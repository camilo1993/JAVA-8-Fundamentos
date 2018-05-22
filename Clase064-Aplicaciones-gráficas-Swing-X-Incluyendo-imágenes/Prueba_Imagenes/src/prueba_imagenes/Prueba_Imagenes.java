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

    public LaminaConImagenes() {

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        File miimagen = new File("src/graficos/bola.png");

        try {

            imagen = ImageIO.read(miimagen);
        } catch (IOException e) {

            System.out.println("la imagen no se encuentra");
        }

        int anchuraImagen = imagen.getWidth(this);

        int alturaImagen = imagen.getHeight(this);

        g.drawImage(imagen, 0, 0, null);

        for (int i = 0; i < 300; i++) {

            for (int j = 0; j < 200; j++) {

                if (i + j > 0) {

                    g.copyArea(0, 0, anchuraImagen, alturaImagen, 64 * i, 64 * j);
                }

            }

        }

    }

    private Image imagen;

}
