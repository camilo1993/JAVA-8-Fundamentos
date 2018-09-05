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

        //    ListaEmpleado.ensureCapacity(3);
        ListaEmpleado.add(new Empleado("Ana", 45, 2500));

        ListaEmpleado.add(new Empleado("Antonio", 55, 2000));

        ListaEmpleado.add(new Empleado("Maria", 25, 2600));

        // ListaEmpleado.add(new Empleado("Olga", 23, 2333));
//     ListaEmpleado.set(1, new Empleado("olga", 22, 2333));
//        
//        System.out.println(ListaEmpleado.get(2).dameDatos());
//     System.out.println(ListaEmpleado.size());
//        
//        for (Empleado e : ListaEmpleado) {
//
//            System.out.println(e.dameDatos());
//
//        }
        Iterator<Empleado> mi_iterador = ListaEmpleado.iterator();

        while (mi_iterador.hasNext()) {

            System.out.println(mi_iterador.next().dameDatos());

        }




//        for (int i = 0; i < ListaEmpleado.size(); i++) {
//
//            Empleado e = ListaEmpleado.get(i);
//
//            System.out.println(e.dameDatos());
//            
//        }
//        Empleado arrayEmpleados[] = new Empleado[ListaEmpleado.size()];
//
//        ListaEmpleado.toArray(arrayEmpleados);
//
//        for (int i = 0; i < arrayEmpleados.length; i++) {
//
//            System.out.println(arrayEmpleados[i].dameDatos());
//
//        }

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
