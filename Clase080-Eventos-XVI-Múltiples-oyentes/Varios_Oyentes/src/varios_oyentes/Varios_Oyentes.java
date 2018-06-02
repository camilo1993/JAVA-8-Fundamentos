/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios_oyentes;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Kmilo
 */
public class Varios_Oyentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Marco_Principal mimarco = new Marco_Principal();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);

        // TODO code application logic here
    }
    
}

class Marco_Principal extends JFrame {
    
    public Marco_Principal() {
        
        setTitle("Prueba varios");
        
        setBounds(900, 100, 300, 200);
        
        Lamina_Principal lamina = new Lamina_Principal();
        
        add(lamina);
    }
}

class Lamina_Principal extends JPanel {
    
    public Lamina_Principal() {
        
        JButton boton_nuevo = new JButton("Nuevo");
        
        add(boton_nuevo);
        
        boton_cerrar = new JButton("Cerrar todo");
        
        add(boton_cerrar);
        
        OyenteNuevo miOyente = new OyenteNuevo();
        
        boton_nuevo.addActionListener(miOyente);
        
    }
    
    private class OyenteNuevo implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
            
            marco.setVisible(true);
        }
        
    }
    JButton boton_cerrar;
    
}

class Marco_Emergente extends JFrame {
    
    public Marco_Emergente(JButton boton_de_principal) {
        
        contador++;
        setTitle("Ventana " + contador);
        
        setBounds(40 * contador, 40 * contador, 300, 150);
        
        CierraTodos oyenteCerrar = new CierraTodos();
        
        boton_de_principal.addActionListener(oyenteCerrar);
    }
    
    private class CierraTodos implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            dispose();
            contador = 0;
        }
        
    }
    private static int contador = 0;
    
}
