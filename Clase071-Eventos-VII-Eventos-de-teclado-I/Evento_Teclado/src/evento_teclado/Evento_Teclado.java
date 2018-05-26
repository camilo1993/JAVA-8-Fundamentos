/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento_teclado;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

/**
 *
 * @author Kmilo
 */
public class Evento_Teclado {

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

        EventoDeTeclado tecla = new EventoDeTeclado();

        addKeyListener(tecla);

    }
}

class EventoDeTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();

        System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {

        char letra = e.getKeyChar();

        System.out.println(letra);
    }

}
