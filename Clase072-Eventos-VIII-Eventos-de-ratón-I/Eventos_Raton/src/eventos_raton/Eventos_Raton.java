/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_raton;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import java.awt.event.*;
import javax.swing.JFrame;
        

/**
 *
 * @author Kmilo
 */
public class Eventos_Raton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoRaton mimarco=new MarcoRaton();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
       
        
    }
    
}

class MarcoRaton extends JFrame {

    public MarcoRaton() {

        setVisible(true);

        setBounds(700, 300, 600, 450);

        EventosDeRaton EventoRaton = new EventosDeRaton();

        addMouseListener(EventoRaton);

    }
}

class EventosDeRaton extends MouseAdapter{
    
    public void mouseClicked(MouseEvent e){
        
        System.out.println("Has hecho click");
        
        
    }

//    @Override
//    public void mouseClicked(MouseEvent e) {
//        
//        System.out.println("Haz hecho click");
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        System.out.println("Acabas de presionar");
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        
//        System.out.println("Acabas de levantar");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        
//        System.out.println("Acabas de entrar");
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        
//        System.out.println("Acabas de salir");
//    }
    
    
    
    
}