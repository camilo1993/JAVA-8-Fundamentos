/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalistaenlazada;

import java.util.*;

/**
 *
 * @author Kmilo
 */
public class PruebaListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedList<String> paises = new LinkedList<String>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<String>();

        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");

        ListIterator<String> iterA = paises.listIterator();
        ListIterator<String> iterB = capitales.listIterator();

        while (iterB.hasNext()) {

            if (iterA.hasNext()) {

                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);

        iterB = capitales.listIterator();

        while (iterB.hasNext()) {

            iterB.next();

            if (iterB.hasNext()) {

                iterB.next();

                iterB.remove();

            }
        }
        System.out.println(capitales);

        paises.removeAll(capitales);

        System.out.println(paises);
    }

}
