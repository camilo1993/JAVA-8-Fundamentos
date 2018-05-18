/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_2d;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author kamilo
 */
public class Prueba_2d {

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

//        g.drawRect(50, 50, 200, 200);
//        g.drawLine(100, 100, 300, 200);
//        g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.draw(elipse);

        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double CentroenX = rectangulo.getCenterX();

        double CentroenY = rectangulo.getCenterY();

        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();

        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);

        g2.draw(circulo);
    }

}
