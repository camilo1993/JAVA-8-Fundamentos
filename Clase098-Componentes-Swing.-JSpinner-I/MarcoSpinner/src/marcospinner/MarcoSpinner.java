/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcospinner;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Kmilo
 */
public class MarcoSpinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FrameSpinner mimarco=new  FrameSpinner();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        // TODO code application logic here
    }
    
}


class FrameSpinner extends JFrame{
    
    
    public FrameSpinner(){
        
        
        setBounds (550,350,550,350);
        
        setVisible(true);
        
        add(new LaminaSpinner());
        
        
        
        
    }
}

class LaminaSpinner extends JPanel {

    public LaminaSpinner() {

//        String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1));

        Dimension d = new Dimension(200, 20);

        control.setPreferredSize(d);

        add(control);

    }

}
