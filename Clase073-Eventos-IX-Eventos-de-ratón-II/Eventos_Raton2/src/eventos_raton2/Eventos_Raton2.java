/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_raton2;

import javax.swing.JFrame;

import java.awt.event.*;

public class Eventos_Raton2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoRaton miMarco = new MarcoRaton();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRaton extends JFrame {

    MarcoRaton() {

        setVisible(true);

        setBounds(500, 300, 550, 250);

        EventosDeRaton EventoRaton = new EventosDeRaton();

        addMouseMotionListener(EventoRaton);

    }
}

class EventosDeRaton implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");    }

//    public void mousePressed(MouseEvent e) {
//
//        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
//
//            System.out.println("Has pulsado el botón izquierdo");
//
//        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
//
//            System.out.println("Has pulsado la rueda del ratón");
//
//        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
//
//            System.out.println("Has pulsado el botón derecho");
//        }
//    }

}
