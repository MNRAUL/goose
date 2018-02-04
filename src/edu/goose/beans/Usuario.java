package edu.goose.beans;

import org.json.JSONObject;

/**
 * Objeto que contiene todos los datos del usuario
 * 
 * @author Raúl
 *
 */
public class Usuario {
	//Variables
	private int 	id;
	private String 	alias;
	private String 	nombre;
	private String 	apellido1;
	private String 	apellido2;
	private String 	email;
	private int 	telefono;
	private String 	pais;

	// Constructores
	public Usuario(int id, String alias, String nombre, String apellido1, String apellido2, String email,
			int telefono, String pais) {
		this.id = id;
		this.alias = alias;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.telefono = telefono;
		this.pais = pais;
	}

	// Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Servicio que devuelve un String con todos los parametros del Usuario separados guiones
	 */
	@Override
	public String toString() {
		return  id 			+ "-" + 
				alias 		+ "-" + 
				nombre 		+ "-" + 
				apellido1 	+ "-" + 
				apellido2 	+ "-" + 
				email 		+ "-" + 
				telefono 	+ "-" + 
				pais;
	}
	
	public JSONObject toJsonObject() {
		JSONObject jsonUsuario = new JSONObject();
		jsonUsuario.put("id", this.getId());
		jsonUsuario.put("alias", this.getAlias());
		jsonUsuario.put("nombre", this.getNombre());
		jsonUsuario.put("apellido1", this.getApellido1());
		jsonUsuario.put("apellido2", this.getApellido2());
		jsonUsuario.put("email", this.getEmail());
		jsonUsuario.put("telefono", this.getTelefono());
		jsonUsuario.put("pais", this.getPais());
		
		return jsonUsuario;
	}
}
