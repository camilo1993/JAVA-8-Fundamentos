/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_evento;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author kamilo
 */
public class Prueba_Evento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoBotones mimarco = new MarcoBotones();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y Eventos");

        setBounds(750, 300, 500, 300);

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");

    JButton botonAmarillo = new JButton("Amarillo");

    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);

        add(botonAmarillo);

        add(botonRojo);

        botonAzul.addActionListener(this);

        botonRojo.addActionListener(this);

        botonAmarillo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        Object botonPulsado = e.getSource();

        if (botonPulsado == botonAzul) {

            setBackground(Color.BLUE);

        } else if (botonPulsado == botonAmarillo) {

            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.RED);

        }
    }

}
