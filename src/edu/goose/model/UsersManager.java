package edu.goose.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import edu.goose.beans.Course;
import edu.goose.beans.User;
import edu.goose.model.bbdd.ConnectionPool;

public class UsersManager {

	public User getUserByAliasAndPassword(String alias, String password) {
		User user = null;
		try (Connection connection = ConnectionPool.getConnection()) {
			String sql = "SELECT * FROM USERS WHERE ALIAS = ? AND PASSWORD = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, alias);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int id 				= resultSet.getInt("ID_USER");
				String name 		= resultSet.getString("NAME");
				String lastName 	= resultSet.getString("LASTNAME");
				String email 		= resultSet.getString("EMAIL");
				String telephone 	= resultSet.getString("TELEPHONE");
				String idNumber 	= resultSet.getString("ID_NUMBER");
				// String alias 	 = resultSet.getString("ALIAS");
				// String password 	 = resultSet.getString("PASSWORD");
				String userRole 	= resultSet.getString("USER_ROLE");
				Timestamp entryDate = resultSet.getTimestamp("ENTRY_DATE");

				user = new User(id, name, lastName, email, telephone, idNumber, alias, password, userRole,
						entryDate.toLocalDateTime());
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return user;
	}
	
	public User[] getAllUsers() {
		List<User> listUsers = new ArrayList<>();
		try (Connection connection = ConnectionPool.getConnection()) {
			
			String sql = "SELECT * FROM USERS";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id 				= resultSet.getInt("ID_USER");
				String name 		= resultSet.getString("NAME");
				String lastName 	= resultSet.getString("LASTNAME");
				String email 		= resultSet.getString("EMAIL");
				String telephone 	= resultSet.getString("TELEPHONE");
				String idNumber 	= resultSet.getString("ID_NUMBER");
				String alias 	 	= resultSet.getString("ALIAS");
				String password 	= resultSet.getString("PASSWORD");
				String userRole 	= resultSet.getString("USER_ROLE");
				Timestamp entryDate = resultSet.getTimestamp("ENTRY_DATE");

				listUsers.add(new User(id, name, lastName, email, telephone, idNumber, alias, password, userRole,
						entryDate.toLocalDateTime()));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return listUsers.toArray(new User[0]);
	}
	
	public Course[] getUserCourses(User user) {
		List<Course> listCourses = new ArrayList<>();
		try (Connection connection = ConnectionPool.getConnection()) {
			
			String sql = 
					"SELECT C.* "
					+ " FROM USERS U"
					+ " INNER JOIN USER_COURSES UC ON U.ID_USER = UC.ID_USER"
					+ " INNER JOIN COURSES C ON UC.ID_COURSE = C.ID_COURSE"
					+ " WHERE U.ID_USER = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id 				= resultSet.getInt("ID");
				String name 		= resultSet.getString("NAME");
				String description 	= resultSet.getString("DESCRIPTION");
				Date initialDate 	= resultSet.getDate("INITIAL_DATE");
				Date endDate 		= resultSet.getDate("END_DATE");

				listCourses.add(new Course(id, name, description, initialDate.toLocalDate(), endDate.toLocalDate()));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return listCourses.toArray(new Course[0]);
	}

}
