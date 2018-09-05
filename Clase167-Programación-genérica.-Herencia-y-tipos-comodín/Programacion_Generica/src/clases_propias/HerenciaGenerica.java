package clases_propias;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kmilo
 */
public class HerenciaGenerica {
    
    public static void main(String[] args) {

//        Empleado Administrativa = new Empleado("Helena", 45, 1500);
//
//        Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
//
//        Empleado nuevoEmpleado = DirectoraComercial;
        Pareja1<Empleado> Administrativa = new Pareja1<Empleado>();
        
        Pareja1<Jefe> DirectoraComercial = new Pareja1<Jefe>();

//Pareja1<Empleado>nuevoEmpleado=DirectoraComercial;
        Pareja1.imprimirTrabajador(Administrativa);
        
        Pareja1.imprimirTrabajador(DirectoraComercial);
        
    }
    
}
