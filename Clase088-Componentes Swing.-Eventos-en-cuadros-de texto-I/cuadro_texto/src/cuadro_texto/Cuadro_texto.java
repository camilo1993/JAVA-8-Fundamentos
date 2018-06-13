/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadro_texto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Kmilo
 */
public class Cuadro_texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MarcoPrueba mimarco = new MarcoPrueba();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// TODO code application logic here
    }

}

class MarcoPrueba extends JFrame {

    public MarcoPrueba() {

        setBounds(500, 300, 500, 350);

        LaminaPrueba milamina = new LaminaPrueba();

        add(milamina);

        setVisible(true);

    }

}

class LaminaPrueba extends JPanel {

    public LaminaPrueba() {

        JTextField micampo = new JTextField(20);

        EscuchaTexto el_evento = new EscuchaTexto();

        Document midoc = micampo.getDocument();

        midoc.addDocumentListener(el_evento);

        add(micampo);
    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
