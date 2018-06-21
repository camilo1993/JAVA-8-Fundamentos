/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_combo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kmilo
 */
public class Prueba_Combo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoCombo mimarco = new MarcoCombo();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }
    
}

class MarcoCombo extends JFrame {
    
    public MarcoCombo() {
        
        setVisible(true);
        
        setBounds(550, 300, 550, 400);
        
        LaminaCombo milamina = new LaminaCombo();
        
        add(milamina);
        
    }
    
}

class LaminaCombo extends JPanel {
    
    public LaminaCombo() {
        
        setLayout(new BorderLayout());        
        
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        
        add(texto, BorderLayout.CENTER);
        
        JPanel Lamina_norte = new JPanel();
        
        micombo = new JComboBox();
        
        micombo.setEditable(true);
        
        micombo.addItem("Serif");
        
        micombo.addItem("SansSerif");
        
        micombo.addItem("Monospaced");
        
        micombo.addItem("Dialog");
        
        Evento_combo mievento = new Evento_combo();
        
        micombo.addActionListener(mievento);
        
        Lamina_norte.add(micombo);
        
        add(Lamina_norte, BorderLayout.NORTH);
        
    }
    
    private class Evento_combo implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN, 18));
            
        }
        
    }
    
    private JLabel texto;
    
    private JComboBox micombo;
    
}
