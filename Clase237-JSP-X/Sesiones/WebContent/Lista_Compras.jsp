<%@ page import="java.util.*"%>
<html>

<body>
	<form name="Formulario_Compra" action="Lista_Compra.jsp">

		<p>Artículos a comprar:</p>
		<p>
			<label> <input type="checkbox" name="articulos" value="agua ">
				Agua
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="leche"> Leche
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="pan"> Pan
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="mazanas"> Manzanas
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="carne"> Carne
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="pescado"> Pescado
			</label>
		</p>
		<p>
			<input type="submit" name="button" id="button" value="Enviar">
			<br>
		</p>
	</form>

	<h2>Carro de la Compra:</h2>

	<ul>

		<%
			String[] elementos = request.getParameterValues("articulos");

			if (elementos != null) {

				for (String elemTemp : elementos) {

					out.println("<li>" + elemTemp + "</li>");
				}
			}
		%>

</ul>
</body>

</html>