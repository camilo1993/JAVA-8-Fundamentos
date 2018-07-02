/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcoemergente;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author Kmilo
 */
public class MarcoEmergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MarcoEmergenteM mimarco=new MarcoEmergenteM();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        // TODO code application logic here
    }
    
}


class MarcoEmergenteM extends JFrame{
    
    public MarcoEmergenteM(){
        
        
        setBounds (100,100,300,250);
        
        LaminaEmergenteM milamina=new LaminaEmergenteM();
        
        add(milamina);
    
        setVisible(true);
        
    }
    
}

class LaminaEmergenteM  extends JPanel{
    
    public LaminaEmergenteM(){
        
        JPopupMenu emergente= new JPopupMenu();
        
        JMenuItem opcion1=new JMenuItem("Opcion 1");
        
         JMenuItem opcion2=new JMenuItem("Opcion 2");
         
          JMenuItem opcion3=new JMenuItem("Opcion 3");
        
        emergente.add(opcion1);
        
         emergente.add(opcion2);
         
          emergente.add(opcion3);
        
        setComponentPopupMenu(emergente);
        
        
        
    }
}