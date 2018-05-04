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
public class Furgoneta extends Coche {

    private int capacidad_carga;

    private int plaza_extra;

    public Furgoneta(int plazas_extra, int capacidad_extra) {

        super();    //llamar al constructor de la clase padre

        this.capacidad_carga = capacidad_carga;

        this.plaza_extra = plaza_extra;

    }

        public String dimeDatosFurgoneta(){
        
        return  " la capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plaza_extra;
    
}
    
    
}
