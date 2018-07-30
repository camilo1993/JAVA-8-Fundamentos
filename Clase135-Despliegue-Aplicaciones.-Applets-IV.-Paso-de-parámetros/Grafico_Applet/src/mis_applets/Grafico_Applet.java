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
        
        int numero1 = Integer.parseInt(getParameter("barra.1"));

        int numero2 = Integer.parseInt(getParameter("barra.2"));

        int numero3 = Integer.parseInt(getParameter("barra.3"));

        LaminaGrafico milamina = new LaminaGrafico(numero1,numero2,numero3);

        add(milamina);

    }

}

class LaminaGrafico extends JPanel {
    
    public LaminaGrafico (int a,int b,int c){
        
        
        g1=a;
        gr2=b;
        g3=c;
        
    }

    public void paint(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.rotate(180 / 180.0 * Math.PI, 125, 100);

        Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, g1);

        Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, gr2);

        Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, g3);

        g2.setPaint(Color.RED);

        g2.fill(graf1);

        g2.setPaint(Color.YELLOW);

        g2.fill(graf2);

        g2.setPaint(Color.GREEN);

        g2.fill(graf3);

    }

    private int g1,gr2,g3;
    
}
