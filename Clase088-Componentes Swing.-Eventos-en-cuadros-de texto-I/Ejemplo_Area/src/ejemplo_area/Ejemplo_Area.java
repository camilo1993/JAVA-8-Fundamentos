/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_area;

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
public class Ejemplo_Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoArea mimarco = new MarcoArea();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }

}

class MarcoArea extends JFrame {

    public MarcoArea() {

        setBounds(500, 300, 500, 350);

        LaminaArea milamina = new LaminaArea();

        add(milamina);

        setVisible(true);

    }

}

class LaminaArea extends JPanel {

    public LaminaArea() {

        miarea = new JTextArea(8, 20);

        JScrollPane laminaBarras = new JScrollPane(miarea);

        miarea.setLineWrap(true);

        add(laminaBarras);

        JButton miboton = new JButton("Dale");

        miboton.addActionListener(new GestionaArea());

        add(miboton);

    }

    private class GestionaArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(miarea.getText());

        }

    }
    private JTextArea miarea;
}
