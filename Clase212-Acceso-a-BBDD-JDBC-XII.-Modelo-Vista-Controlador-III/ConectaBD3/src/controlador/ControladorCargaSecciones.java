/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.*;

import modelo.*;

import vista.*;

/**
 *
 * @author Kmilo
 */
public class ControladorCargaSecciones extends WindowAdapter {

    public ControladorCargaSecciones (Marco_Aplicacion2 elmarco) {
        
        this.elmarco=elmarco;

    }

    public void windowOpened(WindowEvent e) {
        
        obj.ejecutaConsultas();
        
        try {
            while (obj.rs.next()) {
                
                elmarco.secciones.addItem(obj.rs.getString(1));
                
            }
            

        }catch(Exception e2){
            
            
        }



    }

    CargaSecciones obj = new CargaSecciones();

    private Marco_Aplicacion2 elmarco;

}
