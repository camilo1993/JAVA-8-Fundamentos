/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_acciones2;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author Kmilo
 */
public class Prueba_Acciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MarcoAccion marco = new MarcoAccion();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);

    }

}

class MarcoAccion extends JFrame {

    public MarcoAccion() {

        setTitle("Prueba Acciones");

        setBounds(600, 350, 600, 300);

        PanelAccion lamina = new PanelAccion();

        add(lamina);

    }
}

class PanelAccion extends JPanel {

    public PanelAccion() {

        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bola_rojo.gif"), Color.RED);

//        JButton botonAmarillo=new JButton(accionAmarillo);
//        
//        add(botonAmarillo);
        add(new JButton(accionAmarillo));

        add(new JButton(accionAzul));

        add(new JButton(accionRojo));

//        JButton botonAmarillo = new JButton("Amarillo");
//        JButton botonAzul = new JButton("Azul");
//        JButton botonRojo = new JButton("Rojo");
//
//        add(botonAmarillo);
//        add(botonAzul);
//        add(botonRojo);
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

//        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");

        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");

        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");

        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");

        ActionMap mapaAccion = getActionMap();

        mapaAccion.put("fondo_amarillo", accionAmarillo);

        mapaAccion.put("fondo_azul", accionAzul);

        mapaAccion.put("fondo_rojo", accionRojo);

    }

    private class AccionColor extends AbstractAction {

        public AccionColor(String nombre, Icon icono, Color color_boton) {

            putValue(Action.NAME, nombre);

            putValue(Action.SMALL_ICON, icono);

            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);

            putValue("color_de_fondo", color_boton);

        }

        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_de_fondo");

            setBackground(c);

            System.out.println("Nombre " + getValue(Action.NAME) + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));

        }

    }

}
