package uso_empleado;

import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

    }

}

class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

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
    
    public void subeSueldo(double porcentaje){ //SETTER
        
        double aumento=sueldo*porcentaje/100;
        
        sueldo+=aumento;
    }
    
    private String nombre;

    private double sueldo;

    private Date altaContrato;
}
