/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco_texto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

import java.awt.event.*;

/**
 *
 * @author Kmilo
 */
public class Marco_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoTexto mimarco = new MarcoTexto();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        mimarco.setVisible(true);
        // TODO code application logic here
    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() {

        setBounds(600, 300, 600, 350);

        LaminaTexto milamina = new LaminaTexto();

        add(milamina);

        setVisible(true);
    }

}

class LaminaTexto extends JPanel {

    public LaminaTexto() {

        setLayout(new BorderLayout());
        
        JPanel milamina2=new JPanel();
        
        milamina2.setLayout(new FlowLayout());

        resultado = new JLabel("", JLabel.CENTER);

        JLabel texto1 = new JLabel("e.mail: ");

        milamina2.add(texto1);

        campo1 = new JTextField(20);

        milamina2.add(campo1);

        add(resultado, BorderLayout.CENTER);

        JButton miboton = new JButton("Comprobar");

        DameTexto mievento = new DameTexto();

        miboton.addActionListener(mievento);

        milamina2.add(miboton);
        
        add(milamina2,BorderLayout.NORTH);
        
        

//        System.out.println(campo1.getText().trim()); ajusta los caracteres
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;

            String email = campo1.getText();

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {

                    correcto++;

                }
            }

            if (correcto != 1) {
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("correcto");
            }

        }

    }
    private JTextField campo1;

    private JLabel resultado;

}
