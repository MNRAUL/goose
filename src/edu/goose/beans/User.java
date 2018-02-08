package edu.goose.beans;

import java.time.LocalDateTime;

/**
 * This object contains the user data.
 * 
 * @author Raúl
 *
 */
public class User {
	
	// Variables
	private int    id;
	private String name;
	private String lastName;
	private String email;
	private String telephone;
	private String idNumber;
	private String alias;
	private String password;
	private String userRole;
	private LocalDateTime entryDate;
	
	// Constructors
	public User(int id, String name, String lastName, String email, String telephone, String idNumber, String alias,
			String password, String userRole, LocalDateTime entryDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.idNumber = idNumber;
		this.alias = alias;
		this.password = password;
		this.userRole = userRole;
		this.entryDate = entryDate;
	}
	
	// Getters / Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public LocalDateTime getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDateTime entryDate) {
		this.entryDate = entryDate;
	}
}
