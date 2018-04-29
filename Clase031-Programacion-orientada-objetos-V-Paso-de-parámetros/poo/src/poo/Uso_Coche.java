/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author kamilo
 */
public class Uso_Coche {

    public static void main(String[] args) {

        Coche micoche = new Coche();

        micoche.establece_color("amarillo");
        
        System.out.println(micoche.dime_datos_generales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos("true");
        
        System.out.println(micoche.dime_asientos());
        
        
        
        
        
        
        
//
//        Coche Renault = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE    
//////
//////        System.out.println(Renault.dime_largo());
    }

}
