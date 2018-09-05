/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosgenericos;

import java.util.GregorianCalendar;

/**
 *
 * @author Kmilo
 */
public class MetodosGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombres[] = {"Jose", "Maria", "Pepe"};

        System.out.println(MisMatrices.getMenor(nombres));

        GregorianCalendar fechas[] = {new GregorianCalendar(2015, 07, 12), 
                                      new GregorianCalendar(2015, 05, 12),
                                      new GregorianCalendar(2015, 04, 12),};

System.out.println(MisMatrices.getMenor(fechas));
        
//        String elementos = MisMatrices.getElementos(nombres);
//        
//        System.out.println(elementos);
//        
//        Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),};
//        
//        System.out.println(MisMatrices.getElementos(listaEmpleados));
    }

}

class MisMatrices {

    public static <T extends Comparable> T getMenor(T[] a) {

        if (a == null || a.length == 0) {

            return null;

        }

        T elementoMenor = a[0];

        for (int i = 1; i < a.length; i++) {

            if (elementoMenor.compareTo(a[i]) > 0) {

                elementoMenor = a[i];

            }

        }
        return elementoMenor;
    }

}
