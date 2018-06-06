/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kmilo
 */
public class Layout3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoCalculadora mimarco = new MarcoCalculadora();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class MarcoCalculadora extends JFrame {

    public MarcoCalculadora() {

        setTitle("Calculadora");

        setBounds(500, 300, 450, 300);

        LaminaCalculadora milamina = new LaminaCalculadora();

        add(milamina);

    }

}

class LaminaCalculadora extends JPanel {

    public LaminaCalculadora() {

        setLayout(new BorderLayout());

        JButton pantalla = new JButton("0");

        pantalla.setEnabled(false);

        add(pantalla, BorderLayout.NORTH);

        milamina2 = new JPanel();

        milamina2.setLayout(new GridLayout(4, 4));

        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");
        ponerBoton("0");
        ponerBoton(".");
        ponerBoton("=");
        ponerBoton("+");

//        JButton boton1=new JButton("1");
//        
//        milamina2.add(boton1);
        add(milamina2, BorderLayout.CENTER);

    }

    private void ponerBoton(String rotulo) {

        JButton boton = new JButton(rotulo);

        milamina2.add(boton);

    }
    private JPanel milamina2;
}
