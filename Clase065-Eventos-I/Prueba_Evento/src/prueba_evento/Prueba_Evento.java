/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_evento;



import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author kamilo
 */
public class Prueba_Evento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoConBotones mimarco = new MarcoConBotones();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MarcoConBotones extends JFrame {

    public MarcoConBotones() {

        setTitle("Botones y Eventos");

        setBounds(750, 300, 300, 200);

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

    }
}

class LaminaBotones extends JPanel {
    
    
    
    
}
