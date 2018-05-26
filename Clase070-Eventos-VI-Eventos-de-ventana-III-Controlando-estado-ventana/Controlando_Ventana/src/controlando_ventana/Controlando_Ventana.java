/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlando_ventana;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

/**
 *
 * @author Kmilo
 */
public class Controlando_Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoEstado mimarco = new MarcoEstado();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoEstado extends JFrame {

    public MarcoEstado() {

        setVisible(true);

        setBounds(300, 300, 500, 350);

        CambiaEstado nuevo_estado = new CambiaEstado();

        addWindowStateListener(nuevo_estado);

    }

}

class CambiaEstado implements WindowStateListener {

    public void windowStateChanged(WindowEvent e) {
//        System.out.println("La ventana ha cambiado de estado");

//        System.out.println(e.getNewState());
        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {

            System.out.println("La ventana esta a pantalla completa");

        } else if (e.getNewState() == Frame.NORMAL) {

            System.out.println("La ventana esta normal");

        } else if (e.getNewState() == Frame.ICONIFIED) {

            System.out.println("La ventana esta minimizada");
        }

    }

}
