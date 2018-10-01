/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_treeset;

import java.util.*;

/**
 *
 * @author Kmilo
 */
public class Prueba_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        TreeSet<String> ordenaPersonas = new TreeSet<String>();
//
//        ordenaPersonas.add("Sandra");
//
//        ordenaPersonas.add("Amanda");
//
//        ordenaPersonas.add("Diana");
//
//        for (String s : ordenaPersonas) {
//
//            System.out.println(s);
//
//        }
        Articulo primero = new Articulo(1, "Primer articulo");

        Articulo segundo = new Articulo(2, "Segundo articulo");

        Articulo tercer = new Articulo(3, "Tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();

        ordenaArticulos.add(tercer);

        ordenaArticulos.add(primero);

        ordenaArticulos.add(segundo);
        
        for(Articulo art: ordenaArticulos){
            
            System.out.println(art.getDescripcion());
            
        }

    }

}

class Articulo implements Comparable<Articulo> {

    public Articulo(int num, String desc) {

        numero_articulo = num;

        descripcion = desc;

    }

    @Override
    public int compareTo(Articulo o) {
        
        return numero_articulo - o.numero_articulo;
        
    }

    public String getDescripcion() {

        return descripcion;

    }

    private int numero_articulo;

    private String descripcion;
}
