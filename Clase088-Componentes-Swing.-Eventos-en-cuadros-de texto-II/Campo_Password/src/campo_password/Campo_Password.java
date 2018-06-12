/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campo_password;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Kmilo
 */
public class Campo_Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoContraseña marco = new MarcoContraseña();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

class MarcoContraseña extends JFrame {

    public MarcoContraseña() {
        setTitle("ValidarContraseña");
        setBounds(300, 250, 450, 350);
        add(new LaminaContraseña());
    }

}

class LaminaContraseña extends JPanel {

    public LaminaContraseña() {
        setLayout(new BorderLayout());

        JPanel laminaNorte = new JPanel();

        laminaNorte.setLayout(new GridLayout(2, 2));

        JLabel labelUser = new JLabel("Usuario");
        laminaNorte.add(labelUser);

        JTextField textoUsuario = new JTextField(20);
        laminaNorte.add(textoUsuario);

        JLabel labelPass = new JLabel("Contraseña");
        laminaNorte.add(labelPass);

        textoPass = new JPasswordField(20);
        laminaNorte.add(textoPass);

        add(laminaNorte, BorderLayout.NORTH);

        JButton botonEnviar = new JButton("Enviar");
        add(botonEnviar, BorderLayout.SOUTH);

        textoPass.getDocument().addDocumentListener(new EscuchaPassword());

    }

    private class EscuchaPassword implements DocumentListener {

        @Override
        public void changedUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            int longPass = textoPass.getPassword().length;
            if (longPass < 8 || longPass > 12) {
                textoPass.setBackground(Color.red);
            } else {
                textoPass.setBackground(Color.white);

            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            int longPass = textoPass.getPassword().length;
            if (longPass < 8 || longPass > 12) {
                textoPass.setBackground(Color.red);
            } else {
                textoPass.setBackground(Color.white);

            }

        }

    }

    private JPasswordField textoPass;
}
