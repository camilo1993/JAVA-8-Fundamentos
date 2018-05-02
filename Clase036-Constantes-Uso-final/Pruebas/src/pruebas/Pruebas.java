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

        trabajador1.cambiaSeccion("RRHH");
        
        System.out.println(trabajador1.devuelveDatos());

        System.out.println(trabajador2.devuelveDatos());

    }

}

class Empleados {

    public Empleados(String nom) {

        nombre = nom;

        seccion = "Administracion";

    }

    public void cambiaSeccion(String seccion) {

        this.seccion = seccion;

    }

    public String devuelveDatos() {
        return "El nombre es " + nombre + "y la seccion es " + seccion;
    }

    private String nombre;

    private String seccion;

}
