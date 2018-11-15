/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;

import vista.*;

import java.awt.event.*;

/**
 *
 * @author Kmilo
 */
public class ControladorBotonEjecuta implements ActionListener {
    
    public ControladorBotonEjecuta(Marco_Aplicacion2 elmarco){
        
        this.elmarco=elmarco;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String seleccionSeccion = (String) elmarco.secciones.getSelectedItem();
        
        String seleccionPais = (String) elmarco.paises.getSelectedItem();
        
        elmarco.resultado.append(obj.filtraBBDD(seleccionSeccion, seleccionPais));
        
        elmarco.resultado.append("\n");
    }
    
    private Marco_Aplicacion2 elmarco;
    
    EjecutaConsultas obj = new EjecutaConsultas();
    


}
