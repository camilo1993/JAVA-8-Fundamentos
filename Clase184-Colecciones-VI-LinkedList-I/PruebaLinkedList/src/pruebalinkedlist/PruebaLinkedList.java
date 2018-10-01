/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalinkedlist;

import java.util.*;

/**
 *
 * @author Kmilo
 */
public class PruebaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> personas = new LinkedList<String>();
        
        personas.add("pepe");
        
        personas.add("Sandra");
        
        personas.add("Ana");
        
        personas.add("Laura");
        
        System.out.println(personas.size());
        
        ListIterator<String> it = personas.listIterator();
        
        it.next();
        
        it.add("Juan");
        
        for (String persona : personas) {
            
            System.out.println(persona);
            
        }
        
    }
    
}
