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

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;

    public Coche() {

        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;
    }

    public String dime_datos_generales() { //GETTER

        
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ". Mide " + largo/1000  +   " Metros  con un anche de " + ancho + 
                " cm y un peso de plataforma de " + peso_plataforma + " kg";

    }

    public void establece_color(String color_coche) { //SETTER

        color = color_coche;
    }

    public String dime_color() {

        return "El color del coche es " + color;

    }
    public void configura_asientos(String asientos_cueros) {

        if(asientos_cuero ==true){
            
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }

   
    }
    public String dime_asientos() {
        if (asientos_cuero == true) {
            
        }
         return "El coche tiene asientos de cuero";
         
    }
}
    

