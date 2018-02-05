package edu.goose.model;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class PoolBD {
	private static String url_bd, user, pass;

	static
	{
		try(FileReader fileReader = new FileReader("config.properties")){
			Properties p = new Properties();
			p.load(fileReader);
			
			user 				= p.getProperty("bbdd.usuario");
			pass 				= p.getProperty("bbdd.contraseña");
			String ruta	 		= p.getProperty("bbdd.ruta");
			String puerto 		= p.getProperty("bbdd.puerto");
			String baseDatos 	= p.getProperty("bbdd.base");
			
			url_bd =ruta +  ":" + puerto + "/" + baseDatos;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	 public static void main(String[] args) throws Exception {
         PoolProperties p = new PoolProperties();
         p.setUrl("jdbc:mysql://localhost:3306/mysql");
         p.setDriverClassName("com.mysql.jdbc.Driver");
         p.setUsername("root");
         p.setPassword("password");
         p.setJmxEnabled(true);
         p.setTestWhileIdle(false);
         p.setTestOnBorrow(true);
         p.setValidationQuery("SELECT 1");
         p.setTestOnReturn(false);
         p.setValidationInterval(30000);
         p.setTimeBetweenEvictionRunsMillis(30000);
         p.setMaxActive(100);
         p.setInitialSize(10);
         p.setMaxWait(10000);
         p.setRemoveAbandonedTimeout(60);
         p.setMinEvictableIdleTimeMillis(30000);
         p.setMinIdle(10);
         p.setLogAbandoned(true);
         p.setRemoveAbandoned(true);
         p.setJdbcInterceptors(
           "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+
           "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
         DataSource datasource = new DataSource();
         datasource.setPoolProperties(p);

         Connection con = null;
         try {
           con = datasource.getConnection();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from user");
           int cnt = 1;
           while (rs.next()) {
               System.out.println((cnt++)+". Host:" +rs.getString("Host")+
                 " User:"+rs.getString("User")+" Password:"+rs.getString("Password"));
           }
           rs.close();
           st.close();
         } finally {
           if (con!=null) try {con.close();}catch (Exception ignore) {}
         }
     }
}
