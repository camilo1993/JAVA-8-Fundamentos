/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_applets;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kmilo
 */
public class calc1 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public void init() {

        final JFrame mimarco = new JFrame();

        mimarco.setSize(500, 300);

        LaminaCalculadora milamina = new LaminaCalculadora();

        mimarco.add(milamina);

        JButton boton_calculadora = new JButton("Calculadora");

        add(boton_calculadora);

        boton_calculadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mimarco.setVisible(!mimarco.isVisible());

            }
        });

    }

}

class LaminaCalculadora extends JPanel {

    public LaminaCalculadora() {

        principio = true;

        setLayout(new BorderLayout());

        pantalla = new JButton("0");

        pantalla.setEnabled(false);

        add(pantalla, BorderLayout.NORTH);

        milamina2 = new JPanel();

        milamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new InsertaNumero();

        ActionListener orden = new AccionOrden();

        ponerBoton("7", insertar);

        ponerBoton("8", insertar);

        ponerBoton("9", insertar);

        ponerBoton("/", orden);

        ponerBoton("4", insertar);

        ponerBoton("5", insertar);

        ponerBoton("6", insertar);

        ponerBoton("*", orden);

        ponerBoton("1", insertar);

        ponerBoton("2", insertar);

        ponerBoton("3", insertar);

        ponerBoton("-", orden);

        ponerBoton("0", insertar);

        ponerBoton(".", orden);

        ponerBoton("=", orden);

        ponerBoton("+", orden);

//        JButton boton1=new JButton("1");
//        
//        milamina2.add(boton1);
        add(milamina2, BorderLayout.CENTER);

        ultimaOperacion = "=";

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

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;

        }

        public void calcular(double x) {

            if (ultimaOperacion.equals("+"));
            {

                resultado += x;

            }
            if (ultimaOperacion.equals("-")) {

                resultado -= x;
            }
            if (ultimaOperacion.equals("/"));
            {

                resultado /= x;

            }
            if (ultimaOperacion.equals("*"));
            {

                resultado *= x;

            }

            if (ultimaOperacion.equals("=")) {

                resultado = x;
            }
            pantalla.setText("" + resultado);
        }

    }

    private JPanel milamina2;

    private JButton pantalla;

    private boolean principio;

    private double resultado;

    private String ultimaOperacion;
}
