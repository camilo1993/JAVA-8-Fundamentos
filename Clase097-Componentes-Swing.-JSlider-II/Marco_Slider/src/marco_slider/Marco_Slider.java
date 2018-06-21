/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco_slider;

import java.awt.BorderLayout;
import java.awt.Font;

import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Kmilo
 */
public class Marco_Slider {

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
        
        setLayout(new BorderLayout());
        
        rotulo = new JLabel("En un lugar de la mancha de cuyo nombre");
        
        add(rotulo, BorderLayout.CENTER);
        
        control = new JSlider(8, 50, 12);
        
        control.setMajorTickSpacing(20);
        
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        
        control.setPaintLabels(true);
        
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        
        control.addChangeListener(new EventoSlider());
        
        JPanel laminaSlider = new JPanel();
        
        laminaSlider.add(control);
        
        add(laminaSlider, BorderLayout.NORTH);
        
    }
    
    private class EventoSlider implements ChangeListener {
        
        @Override
        public void stateChanged(ChangeEvent e) {
            
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
            
        }
        
    }
    
    private JLabel rotulo;
    
    private JSlider control;
    
}
