/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_empleado;

import java.util.*;

/**
 *
 * @author Kmilo
 */
public class Uso_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Empleado ListaEmpleado[] = new Empleado[3];
//
//        ListaEmpleado[0] = new Empleado("Ana", 45, 2500);
//
//        ListaEmpleado[1] = new Empleado("Antonio", 55, 2000);
//
//        ListaEmpleado[2] = new Empleado("Maria", 25, 2600);
//
//        ListaEmpleado[3] = new Empleado("Maria", 25, 2600);
        ArrayList<Empleado> ListaEmpleado = new ArrayList<Empleado>();

        ListaEmpleado.ensureCapacity(3);
        
        ListaEmpleado.add(new Empleado("Ana", 45, 2500));

        ListaEmpleado.add(new Empleado("Antonio", 55, 2000));

        ListaEmpleado.add(new Empleado("Maria", 25, 2600));
        
        System.out.println(ListaEmpleado.size());
        
        for (Empleado e : ListaEmpleado) {

            System.out.println(e.dameDatos());

        }

    }

}

class Empleado {

    public Empleado(String nombre, int edad, double salario) {

        this.nombre = nombre;

        this.edad = edad;

        this.salario = salario;

    }

    public String dameDatos() {

        return "El empleado se llama" + nombre + " tiene " + edad + " años " + "Y un salario de " + salario;

    }
    private String nombre;

    private int edad;

    double salario;
}
