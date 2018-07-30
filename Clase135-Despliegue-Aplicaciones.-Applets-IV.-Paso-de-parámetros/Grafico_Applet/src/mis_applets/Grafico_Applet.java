/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_applets;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class Grafico_Applet extends JApplet {

    public void init() {

        LaminaGrafico milamina = new LaminaGrafico();

        add(milamina);

    }

}

class LaminaGrafico extends JPanel {

    public void paint(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.rotate(180 / 180.0 * Math.PI, 125, 100);

        Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, 50);

        Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, 175);

        Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, 100);

        g2.setPaint(Color.RED);

        g2.fill(graf1);

        g2.setPaint(Color.YELLOW);

        g2.fill(graf2);

        g2.setPaint(Color.GREEN);

        g2.fill(graf3);

    }

}
