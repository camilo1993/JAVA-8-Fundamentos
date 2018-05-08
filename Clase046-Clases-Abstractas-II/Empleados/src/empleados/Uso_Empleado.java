/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Camilo", 55000, 2006, 9, 25);

        jefe_RRHH.estableceIncentivo(2570);

//        Empleado empleado1=new Empleado("Camilo Garces", 85000, 1990, 12, 17);
//        
//        Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 6, 2);
//  
//        Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);
//        
//        
//        empleado1.subeSueldo(5);
//        
//        empleado2.subeSueldo(5);
//        
//        empleado3.subeSueldo(5);
//        
//        System.out.println("Nombre : " + empleado1.dameNombre() + " sueldo: " + empleado1.dameSueldo()
//                + " Fecha de alta: " + empleado1.dameFechaContrato());
//
//        System.out.println("Nombre : " + empleado2.dameNombre() + " sueldo: " + empleado2.dameSueldo()
//                + " Fecha de alta: " + empleado2.dameFechaContrato());
//                        
//        System.out.println("Nombre : " + empleado3.dameNombre() + " sueldo: " + empleado3.dameSueldo()
//                + " Fecha de alta: " + empleado3.dameFechaContrato());
        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Camilo Garces", 85000, 1990, 12, 17);

        misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);

        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        misEmpleados[3] = new Empleado("Antonio Fernandez");

        misEmpleados[4] = jefe_RRHH; //Polimorfismo 

        misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

//for(int i=0;i<3;i++){
//    
//    misEmpleados[i].subeSueldo(5);
//}
        for (Empleado e : misEmpleados) {

            e.subeSueldo(5);

        }

//
////for(int i=0;i<3;i++){
////    
//    System.out.println("Nombre: " + misEmpleados[i].dameNombre()
//    + " Sueldo: " + misEmpleados[i].dameSueldo()+ " Fecha de alta: "+ misEmpleados[i].dameFechaContrato());
//    
//}
//
//
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());

        }

    }

}

class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

    }

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String dameNombre() {  //GETTER

        return nombre;
    }

    public double dameSueldo() {   //GETTER

        return sueldo;
    }

    public Date dameFechaContrato() {   //GETTER

        return altaContrato;
    }

    public void subeSueldo(double porcentaje) { //SETTER

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }

    private String nombre;

    private double sueldo;

    private Date altaContrato;
}

class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {

        super(nom, sue, agno, mes, dia);
    }

    public void estableceIncentivo(double b) {

        incentivo = b;

    }

    public double dameSueldo() {

        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;

    }
    private double incentivo;

}
