<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.*, java.sql.*, ejemplo.com.jsptags.Empleado"%>

<%
	ArrayList<Empleado> datos = new ArrayList<>();

	Class.forName("com.mysql.jdbc.Driver");

	try {

		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/proyecto_jsp", "root",
				"");

		Statement miStatement = miConexion.createStatement();

		String instruccionSql = "SELECT * FROM EMPLEADOS";

		ResultSet rs = miStatement.executeQuery(instruccionSql);

		while (rs.next()) {

			datos.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));

		}

		rs.close();

		miConexion.close();

	} catch (Exception e) {

		out.println("Ha habido un error");

	}

	pageContext.setAttribute("losEmpleados", datos);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
.cabecera {
	font-weight: bold;
}
</style>

</head>
<body>

	<tr>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Puesto</td>
		<td>Salario</td>
	</tr>

	<table border="1">

		<c:forEach var="EmpTemp" items="${losEmpleados }">
			<tr class="cabecera">
				<td>${EmpTemp.nombre }$</td>
				<td>{EmpTemp.apellido }$</td>
				<td>{EmpTemp.puestp }$</td>
				<td>{EmpTemp.salario }</td>
				</br>
			</tr>
		</c:forEach>

	</table>
</body>
</html>