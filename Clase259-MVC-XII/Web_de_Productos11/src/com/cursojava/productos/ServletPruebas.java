package com.cursojava.productos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;
import java.sql.*;

/**
 * Servlet implementation class ServletPruebas
 */
@WebServlet("/Servletpruebas")
public class ServletPruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Definir o establecer el DataSource//

	@Resource(name = "jdbc/pruebas")
	private DataSource miPool;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletPruebas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// Crear el obj printWritter

		PrintWriter salida = response.getWriter();

		response.setContentType("text/plain");

		// Crear conexion con BBDD

		Connection miConexion = null;

		Statement miStatement = null;

		ResultSet miResultset = null;

		try {

			miConexion = miPool.getConnection();
			
			String miSql="SELECT * FROM PRUEBAS";
			
			miStatement= miConexion.createStatement();
			
			miResultset=miStatement.executeQuery(miSql);
			
			while(miResultset.next()) {
				
				String nombre_articulo=miResultset.getString(3);
				
				salida.println(nombre_articulo);
				
				
				
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
