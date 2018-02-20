
package manipula_cadena;


public class Manipula_cadena {

    public static void main(String[] args) {
     
    String nombre="Camilo Garces Vega";
    
    System.out.println("Mi nombre es " +nombre);
    
    System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
    
    System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
    
    int ultima_letra=nombre.length();
    
    System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
   
    }
}