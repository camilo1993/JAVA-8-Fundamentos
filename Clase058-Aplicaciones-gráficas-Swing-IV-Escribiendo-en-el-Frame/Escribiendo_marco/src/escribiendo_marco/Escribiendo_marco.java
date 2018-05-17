/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribiendo_marco;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author kamilo
 */
public class Escribiendo_marco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoConTexto mimarco = new MarcoConTexto();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }
    
}

class MarcoConTexto extends JFrame {
    
    public MarcoConTexto() {
        
        setVisible(true);
        
        setSize(600, 450);
        
        setLocation(400, 200);
        
        setTitle("Primer texto");
        
        Lamina milamina=new Lamina();
        
        add(milamina);
        
    }
    
}

class Lamina extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.drawString("Estamos aprendiendo Swing", 100, 100);
        
    }
    
}
