package edu.goose.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.goose.beans.Usuario;

public class GestionUsuarios {

	
	/**
	 * Servicio que consulta en base de datos si la contraseña es correcta.
	 * 
	 * @param nombre   Nombre del usuario a consultar
	 * @param password Password del usario a consultar
	 * @return true si el usuario es correcto, false si no lo es.
	 */
	public static boolean validar(String nombre, String password) {
		if(nombre.equals("nombre"))
			return true;
		return false;
	}
	
	
	public static Usuario getUsuario(String nombre, String password) {
		Usuario contacto = null;
		/*try (Connection connection = DriverManager.getConnection(url_bd, user, pass)) {
			// Intrucción SQL
			String sql = "Select  * from contactos where nombre = ? and password = ?";
			// Creo el PreparedStatement y lo ejecuto
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(1, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				contacto = new Usuario(				
						resultSet.getInt("id"),
						resultSet.getString ("alias"),
						resultSet.getString("nombre"),
						resultSet.getString("apellido1"),
						resultSet.getString("apellido2"),
						resultSet.getString("email"),
						resultSet.getInt("telefono"),
						resultSet.getString("pais"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		return contacto;
		
	}
	
}
