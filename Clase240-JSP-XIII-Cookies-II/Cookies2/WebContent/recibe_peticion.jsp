<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//Leyendo datos del formulario

		String ciudad_favorita = request.getParameter("ciudad_favorita");

		//Crear cookie

		Cookie laCookie = new Cookie("agencia_viajes.ciudad_favorita", ciudad_favorita);

		// Vida de la cookie
	
		laCookie.setMaxAge(365*24*60*60); // un año segun el calculo del parametro
		
		// Enviar a Usuario
		
		response.addCookie(laCookie);
		
		
		
	%>

Gracias por enviar tus preferencias

<a href="agencia_viajes.jsp">Ir a la agencia de viajes</a>

</body>
</html>