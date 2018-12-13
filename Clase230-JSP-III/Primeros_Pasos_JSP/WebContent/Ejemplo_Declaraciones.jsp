<html>
<body>

<h1 style=""text-align:center">

Ejemplo Declaraciones


</h1 >


<%!

private int resultado;

public int metodosuma( int num1, int num2){
	
	resultado= num1+num2;
	
	return resultado;
	
	%>
	
}

El resultado de la suma es <%= metodosuma(7,5)%>



%>

</body>


</html>