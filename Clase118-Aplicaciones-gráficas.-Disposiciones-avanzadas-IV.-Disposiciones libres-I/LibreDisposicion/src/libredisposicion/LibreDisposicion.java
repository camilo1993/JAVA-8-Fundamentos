/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libredisposicion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kmilo
 */
public class LibreDisposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoLibre mimarco = new MarcoLibre();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MarcoLibre extends JFrame {

    public MarcoLibre() {

        setBounds(450, 350, 600, 400);

        LaminaLibre milamina = new LaminaLibre();

        add(milamina);

        setVisible(true);

    }

}

class LaminaLibre extends JPanel {

    public LaminaLibre() {

        setLayout(null);

        JLabel nombre = new JLabel("Nombre: ");

        JLabel apellido = new JLabel("Apellido: ");

        JTextField c_nombre = new JTextField();

        JTextField c_apellido = new JTextField();

        nombre.setBounds(20, 20, 80, 10);

        c_nombre.setBounds(100, 20, 100, 20);

        apellido.setBounds(20, 60, 80, 15);

        c_apellido.setBounds(100, 55, 100, 20);

        add(nombre);

        add(apellido);

        add(c_nombre);

        add(c_apellido);

//        JButton boton1 = new JButton("boton1");
//
//        JButton boton2 = new JButton("boton2");
//
//        boton1.setBounds(500, 300, 150, 50);
//
//        boton2.setBounds(200, 100, 150, 50);
//
//        add(boton1);
//
//        add(boton2);


        
         
    }
}