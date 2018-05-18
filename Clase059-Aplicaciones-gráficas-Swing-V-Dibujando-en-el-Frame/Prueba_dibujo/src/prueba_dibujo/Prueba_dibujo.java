/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_dibujo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author kamilo
 */
public class Prueba_dibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoConDibujos mimarco = new MarcoConDibujos();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }
    
}

class MarcoConDibujos extends JFrame {
    
    public MarcoConDibujos() {
        
        setTitle("prueba de Dibujo");
        
        setSize(400, 400);
        
        LaminaConFiguras milamina = new LaminaConFiguras();
        
        add(milamina);
        
    }
    
}

class LaminaConFiguras extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.drawRect(50, 50, 200, 200);
        g.drawLine(100, 100, 300, 200);
        g.drawArc(50, 100, 100, 200, 120, 150);
        
    }
    
}
