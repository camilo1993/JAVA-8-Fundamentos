/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispocisionmuelle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

/**
 *
 * @author Kmilo
 */
public class DispocisionMuelle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        MarcoMuelle mimarco= new MarcoMuelle();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}


class MarcoMuelle extends JFrame {
    
    public MarcoMuelle(){
        
        
        setBounds(300,400,1000,350);
        
       LaminaMuelle   milamina=new LaminaMuelle();
        
        add(milamina);
                
        setVisible(true);        
        
        
    }
    
}

class LaminaMuelle extends JPanel{
    
    public LaminaMuelle(){
        
        JButton boton1 = new JButton("boton 1");

        JButton boton2 = new JButton("boton 2");

        JButton boton3 = new JButton("boton 3");
        
        SpringLayout milayout=new SpringLayout();
        
        setLayout(milayout);

        add(boton1);

        add(boton2);

        add(boton3);

        Spring mimuelle = Spring.constant(0, 10, 100);

        milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);

        milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);

        milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);

        milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);


        
        

        
        
        
        
        
        
    }
    
}