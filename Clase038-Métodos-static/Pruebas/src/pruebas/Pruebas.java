/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author kamilo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco ");

        Empleados trabajador2 = new Empleados("Ana ");

        Empleados trabajador3 = new Empleados("Antonio");

        Empleados trabajador4 = new Empleados("Maria");

        trabajador1.cambiaSeccion("RRHH");

//        trabajador1.cambiaNombre("Maria");
        System.out.println(trabajador1.devuelveDatos()
                + "\n" + trabajador2.devuelveDatos()
                + "\n" + trabajador3.devuelveDatos()
                + "\n" + trabajador4.devuelveDatos()
        );

        System.out.println(Empleados.dameIdSiguiente());





//        System.out.println(trabajador2.devuelveDatos());
//
//        System.out.println(trabajador3.devuelveDatos());
//        
//        System.out.println(trabajador4.devuelveDatos());

    }

}

class Empleados {

    public Empleados(String nom) {

        nombre = nom;

        seccion = "Administracion";
        
        Id=IdSiguiente;
        
        IdSiguiente++;
        
        
       
    }

    public void cambiaSeccion(String seccion) {

        this.seccion = seccion;

    }

//    public void cambiaNombre(String nombre) {
//       
//        this.nombre = nombre;
//    }

    public String devuelveDatos() {
        return "El nombre es " + nombre + "y la seccion es " + seccion + " y el Id= "+ Id;
    }

    public static String dameIdSiguiente(){
        
        return "El Id Siguiente es: " + IdSiguiente;
    }
    
    
    
    private final String nombre;

    private String seccion;

    private int Id;
    
    private static int IdSiguiente=1;
}
