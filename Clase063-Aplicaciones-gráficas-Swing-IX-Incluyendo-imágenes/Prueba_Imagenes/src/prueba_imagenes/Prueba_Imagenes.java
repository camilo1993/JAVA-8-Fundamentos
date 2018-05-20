/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_imagenes;

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
public class Prueba_Imagenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoConImagenes mimarco = new MarcoConImagenes();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MarcoConImagenes extends JFrame {

    public MarcoConImagenes() {

        setTitle("Marco con Imagen");

        setBounds(750, 300, 300, 200);

        LaminaConImagenes milamina = new LaminaConImagenes();

        add(milamina);

    }

}

class LaminaConImagenes extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        File miimagen = new File("src/graficos/auto.jpg");

        try {

            imagen = ImageIO.read(miimagen);
        } catch (IOException e) {

            System.out.println("la imagen no se encuentra");
        }

        g.drawImage(imagen, 5, 5, null);

    }

    private Image imagen;

}
