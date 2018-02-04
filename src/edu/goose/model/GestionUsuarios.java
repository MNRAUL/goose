package edu.goose.model;

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
		/**TODO*/
		if(nombre.equals("nombre"))
			return true;
		return false;
	}
	
	
	public static Usuario getUsuario() {
		return null;
	}
	
}
