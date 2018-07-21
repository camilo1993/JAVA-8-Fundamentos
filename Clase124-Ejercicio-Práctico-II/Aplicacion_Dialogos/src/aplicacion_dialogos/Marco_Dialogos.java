/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_dialogos;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Kmilo
 */
public class Marco_Dialogos extends JFrame {
    
    
    public Marco_Dialogos (){
        
        setTitle("Prueba de Dialogos");
        
        setBounds (500,300,600,450);
        
        JPanel lamina_cuadricula = new JPanel();
        
        lamina_cuadricula.setLayout(new GridLayout(2,3));
        
        String primero[]={"Mensaje", "Confirmar", "Opcion","Entrada"};
        
        lamina_tipo=new Lamina_Botones("Tipo", primero);
        
        lamina_cuadricula.add(lamina_tipo);
        
        add(lamina_cuadricula);
    }
    private Lamina_Botones lamina_tipo;
}
