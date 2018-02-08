package edu.goose.model.bbdd;

import java.beans.PropertyVetoException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class ConnectionPool {

	private static DataSource datasource;

	private ConnectionPool() throws IOException, SQLException, PropertyVetoException {
		try (FileReader fileReader = new FileReader("config.properties")) {
			Properties properties = new Properties();
			properties.load(fileReader);
			PoolProperties poolProperties = new PoolProperties();
			poolProperties.setDbProperties(properties);
			// Instance Mysql driver

			// Create the Datasource
			DataSource datasource = new DataSource();
			datasource.setPoolProperties(poolProperties);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new DataSource();
			return datasource;
		} else {
			return datasource;
		}
	}

	public static Connection getConnection() throws SQLException {
		return datasource.getConnection();
	}

}
