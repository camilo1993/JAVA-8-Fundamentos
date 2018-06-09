/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco_texto;

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
        
        MarcoTexto mimarco=new MarcoTexto();
        
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
        
        JLabel texto1=new JLabel("e.mail: ");
        
      add(texto1);
        
       campo1=new JTextField(20);
        
       add(campo1);
        
        JButton miboton=new JButton ("Comprobar");

        DameTexto mievento=new DameTexto();
        
        
        miboton.addActionListener(mievento);
        
        add(miboton);





//        System.out.println(campo1.getText().trim()); ajusta los caracteres

    }
    
    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println(campo1.getText().trim());
            
        }
        
   
    }
   private   JTextField campo1;
        
}
