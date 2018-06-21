/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_slider;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *
 * @author Kmilo
 */
public class MarcoSlider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Frame_Slider mimarco = new Frame_Slider();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class Frame_Slider extends JFrame {

    public Frame_Slider() {

        setBounds(550, 400, 550, 350);

        Lamina_Slider milamina = new Lamina_Slider();

        add(milamina);

        setVisible(true);

    }

}

class Lamina_Slider extends JPanel {

    public Lamina_Slider() {

//        JSlider control=new JSlider(SwingConstants.VERTICAL,0,100,25); horizontal o vertical
//         control.setComponentOrientation(SwingConstants.HORIZONTAL);
        JSlider control = new JSlider(0, 100, 50);
        
        control.setMajorTickSpacing(50);
        
        control.setMinorTickSpacing(25);
        
        control.setPaintTicks(true);
        
        control.setFont(new Font("Serif", Font.ITALIC,12));
        
        control.setPaintLabels(true);
        
        control.setSnapToTicks(true);
        
        add(control);
        
    }

}
