/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class UsoArraylist {
    
    public static void main(String[] args) {
        
        ArrayList archivos = new ArrayList(4);
        
        archivos.add("Juan");
        
        archivos.add("Maria");
        
        archivos.add("Ana");
        
        archivos.add("Sandra");
        
        archivos.add(new File("gestion_Pedidos.accdb"));
        
        String nombrePersona = (String) archivos.get(2);
        
        System.out.println(nombrePersona);
        
    }
    
}
