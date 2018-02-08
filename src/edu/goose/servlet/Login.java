package edu.goose.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.goose.model.UsersManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 4108463555377401465L;

	@Override
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {

		String alias 	= httpServletRequest.getParameter("alias");
		String password = httpServletRequest.getParameter("password");
		
		UsersManager usersManager = new UsersManager();

		if (usersManager.getUserByAliasAndPassword(alias, password) != null) {} 
		else {}

	}

}
