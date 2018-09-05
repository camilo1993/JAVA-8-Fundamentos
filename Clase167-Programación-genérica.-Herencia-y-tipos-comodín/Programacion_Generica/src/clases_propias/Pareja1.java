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
public class Pareja1<T> {

    public Pareja1() {

        primero = null;

    }

    public void setPrimero(T nuevoValor) {

        primero = nuevoValor;

    }

    public static void imprimirTrabajador(Pareja1<? extends Empleado>p){
        
        
        Empleado primero=p.getPrimero();
        
        System.out.println(primero);
        
        
        
    }
    
    
    public T getPrimero() {

        return primero;

    }

    private T primero;

}
