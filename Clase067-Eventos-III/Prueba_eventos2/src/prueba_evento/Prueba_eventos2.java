/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class Prueba_eventos2 {

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

class LaminaBotones extends JPanel  {

    JButton botonAzul = new JButton("Azul");

    JButton botonAmarillo = new JButton("Amarillo");

    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);

        add(botonAmarillo);

        add(botonRojo);

        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);

        ColorFondo Azul = new ColorFondo(Color.BLUE);

        ColorFondo Rojo = new ColorFondo(Color.RED);

        botonAzul.addActionListener(Azul);

        botonRojo.addActionListener(Rojo);

        botonAmarillo.addActionListener(Amarillo);
    }

  
private class ColorFondo implements ActionListener {

    public ColorFondo(Color c) {

        colorDeFondo = c;
    }

    public void actionPerformed(ActionEvent e){
        
        setBackground(colorDeFondo);
        
        
        
    }
    private Color colorDeFondo;

}


}

