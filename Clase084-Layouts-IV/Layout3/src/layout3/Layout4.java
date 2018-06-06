/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kmilo
 */
public class Layout4 {

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
        
        principio=true;

        setLayout(new BorderLayout());

        pantalla = new JButton("0");

        pantalla.setEnabled(false);

        add(pantalla, BorderLayout.NORTH);

        milamina2 = new JPanel();

        milamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();

        ponerBoton("7", insertar);

        ponerBoton("8", insertar);

        ponerBoton("9", insertar);

//        ponerBoton("/");
        ponerBoton("4", insertar);

        ponerBoton("5", insertar);

        ponerBoton("6", insertar);

//        ponerBoton("*");
        ponerBoton("1", insertar);

        ponerBoton("2", insertar);

        ponerBoton("3", insertar);

//        ponerBoton("-");
        ponerBoton("0", insertar);

//        ponerBoton(".");
//
//        ponerBoton("=");
//
//        ponerBoton("+");
//        JButton boton1=new JButton("1");
//        
//        milamina2.add(boton1);
        add(milamina2, BorderLayout.CENTER);

    }

    private void ponerBoton(String rotulo, ActionListener oyente) {

        JButton boton = new JButton(rotulo);

        boton.addActionListener(oyente);

        milamina2.add(boton);

    }

    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String entrada = e.getActionCommand();

            if (principio) {

                pantalla.setText("");

                principio = false;
            }

            pantalla.setText(pantalla.getText() + entrada);

        }

    }

    private JPanel milamina2;

    private JButton pantalla;

    private boolean principio;
}
