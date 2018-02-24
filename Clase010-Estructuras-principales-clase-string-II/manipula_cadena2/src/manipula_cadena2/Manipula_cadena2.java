/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipula_cadena2;

/**
 *
 * @author kamilo
 */
public class Manipula_cadena2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       String frase="Hoy es un estupendo dia para aprender a programar en java";
       
      
       String frase_resumen=frase.substring(0,29) + "Irnos a la playa y olvidarnos de todo" + "y" 
       frase.substring(29,57);
       
       
       System.out.println(frase_resumen);
    }
    
}
