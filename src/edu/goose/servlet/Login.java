package edu.goose.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.goose.model.GestionUsuarios;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 4108463555377401465L;
	String loginOk = "controlPanel.html";

	@Override
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {

		httpServletResponse.setContentType("text/html");
		PrintWriter out = httpServletResponse.getWriter();

		String nombre 	= httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("userpass");

		if (GestionUsuarios.validar(nombre, password)) {
			RequestDispatcher rd = httpServletRequest.getRequestDispatcher("servlet2");
			rd.forward(httpServletRequest, httpServletResponse);
		} else {
			out.print("Usuario o contraseña incorrectos.");
			RequestDispatcher rd = httpServletRequest.getRequestDispatcher("index.html");
			rd.include(httpServletRequest, httpServletResponse);
		}

		out.close();
	}

}
