/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_raton2;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author Kmilo
 */
public class Eventos_Raton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoRaton mimarco = new MarcoRaton();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRaton extends JFrame {

    public MarcoRaton() {

        setVisible(true);

        setBounds(700, 300, 600, 450);

        EventosDeRaton EventoRaton = new EventosDeRaton();

        addMouseListener(EventoRaton);

    }
}

class EventosDeRaton extends MouseAdapter {

//    public void mouseClicked(MouseEvent e) {
//
//       System.out.println("Cordenada X: " + e.getX() + " Cordenada Y: " + e.getY());
//        System.out.println(e.getClickCount());
//
//
//    }
    public void MousePressed(MouseEvent e) {

        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {

            System.out.println("Has pulsado el boton izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {

            System.out.println("Has pulsado la rueda del raton");

        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {

            System.out.println("Has pulsado el boton derecho");

        }

    }
}
