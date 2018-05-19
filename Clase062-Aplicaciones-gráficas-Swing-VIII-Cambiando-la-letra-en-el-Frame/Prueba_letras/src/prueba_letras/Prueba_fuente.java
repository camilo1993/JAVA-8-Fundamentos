/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_letras;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author kamilo
 */
public class Prueba_fuente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoConFuentes mimarco = new MarcoConFuentes();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MarcoConFuentes extends JFrame {

    public MarcoConFuentes() {

        setTitle("prueba de Fuentes");

        setSize(400, 400);

        LaminaConFuentes milamina = new LaminaConFuentes();

        add(milamina);

        milamina.setForeground(Color.YELLOW);
    }

}

class LaminaConFuentes extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

//        g.drawRect(50, 50, 200, 200);
//        g.drawLine(100, 100, 300, 200);
//        g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2 = (Graphics2D) g;

        Font mifuente = new Font("Courier", Font.BOLD, 26);

        g2.setFont(mifuente);
        

        g2.drawString("Camilo", 200, 100);

        g2.setFont(new Font("Arial", Font.ITALIC,14));
        
        
        g2.drawString("Curso de java", 100,150);
     

    }

}