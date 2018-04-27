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
public class Coche {

    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    String color;
    
    int peso_total;
   
    boolean asientos_cuero, climatizador;

    public Coche() {

        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;
    }

    public String dime_largo(){ //GETTER
        
        return "El largo del coche es " + largo;
        
    }
    public void establece_color(){ //SETTER
        
        color="azul";
    }
    public String dime_color(){
        
        return "El color del coche es " + color;
        
    }
}
