package pruebajsp.com.CalculosMatematicos;

public class Calculo {
	
	
	private static int resultado;

	public static int metodosuma( int num1, int num2){
		
		resultado= num1+num2;
		
		return resultado;
		

		
	}


	public static int metodoResta( int num1, int num2){
		
		resultado= num1-num2;
		
		return resultado;

	}

	public static int metodoMultiplicacion( int num1, int num2){
		
		resultado= num1*num2;
		
		return resultado;

	}

}
