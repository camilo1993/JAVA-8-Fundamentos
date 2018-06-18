/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_area;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kmilo
 */
public class Prueba_Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MarcoPruebaArea mimarco = new MarcoPruebaArea();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);
    }

}

class MarcoPruebaArea extends JFrame {

    public MarcoPruebaArea() {

        setTitle("Probando Area de texto");

        setBounds(500, 300, 500, 350);

        setLayout(new BorderLayout());

        laminaBotones = new JPanel();

        botonInsertar = new JButton("Insertar");

        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                areaTexto.append("En un lugar de la mancha cuyo nombre no quiero acordarme ");

            }

        });

        laminaBotones.add(botonInsertar);

        botonSaltoLinea = new JButton("Salto Linea");

        botonSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean saltar = !areaTexto.getLineWrap();

                areaTexto.setLineWrap(saltar);

//                if (saltar) {
//
//                    botonSaltoLinea.setText("Quitar salto");
//                } else {
//
//                    botonSaltoLinea.setText("Salto Linea");
//                }
                botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");
                
            }
            
        });

        laminaBotones.add(botonSaltoLinea);

        add(laminaBotones, BorderLayout.SOUTH);

        areaTexto = new JTextArea(8, 20);

        laminaConBarras = new JScrollPane(areaTexto);

        add(laminaConBarras, BorderLayout.CENTER);

    }
    private JPanel laminaBotones;

    private JButton botonInsertar, botonSaltoLinea;

    private JTextArea areaTexto;

    private JScrollPane laminaConBarras;
}
