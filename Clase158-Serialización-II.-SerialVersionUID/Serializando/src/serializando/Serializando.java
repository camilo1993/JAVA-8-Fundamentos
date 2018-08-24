/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializando;

import java.util.*;

import java.io.*;

public class Serializando {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];

        personal[0] = jefe;

        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);

        personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);

        try {
            //ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("E:/GIT/JAVA-8-Fundamentos/Clase158-Serialización-II.-SerialVersionUID/empleado.dat"));

            //escribiendo_fichero.writeObject(personal);
           
            //escribiendo_fichero.close();
            
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("E:/GIT/JAVA-8-Fundamentos/Clase158-Serialización-II.-SerialVersionUID/empleado.dat"));

            Empleado[] personal_recuperado = (Empleado[]) recuperando_fichero.readObject();

            recuperando_fichero.close();

            for (Empleado e : personal_recuperado) {

                System.out.println(e);

            }

        } catch (Exception e) {

        }

    }

}

//-----------------------------------------------------------------------------------------------------------
class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    public Empleado(String n, double s, int agno, int mes, int dia) {

        nombre = n;

        sueldos = s;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        fechaContrato = calendario.getTime();

    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldos;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void subirSueldo(double porcentaje) {

        double aumento = sueldos * porcentaje / 100;

        sueldos += aumento;

    }

    public String toString() {

        return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldos + ", fecha de contrato=" + fechaContrato;

    }

    private String nombre;

    private double sueldos;

    private Date fechaContrato;

}

//--------------------------------------------------------------------------------------------------------
class Administrador extends Empleado {
    
        private static final long serialVersionUID = 1L;


    public Administrador(String n, double s, int agno, int mes, int dia) {

        super(n, s, agno, mes, dia);

        incentivo = 0;

    }

    public double getSueldo() {

        double sueldoBase = super.getSueldo();

        return sueldoBase + incentivo;

    }

    public void setIncentivo(double b) {

        incentivo = b;
    }

    public String toString() {

        return super.toString() + " Incentivo=" + incentivo;

    }

    private double incentivo;

}
