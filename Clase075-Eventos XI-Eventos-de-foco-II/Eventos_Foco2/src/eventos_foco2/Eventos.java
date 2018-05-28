/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_foco2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;


/**
 *
 * @author Kmilo
 */
public class Eventos extends JFrame implements WindowFocusListener {

    public static void main(String[] args) {
        
        Ventana miv=new Ventana();
        
        miv.iniciar();
        

    }

    public void iniciar()
    
    {
       
        
        marco1 = new Ventana();

        marco2 = new Ventana();

        marco1.setVisible(true);

        marco2.setVisible(true);

        marco1.setBounds(300, 100, 600, 350);

        marco2.setBounds(1200, 100, 600, 350);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco1.addWindowFocusListener(this);

        marco2.addWindowFocusListener(this);


    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        
        if(e.getSource()==marco1){
            
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if(e.getSource()==marco1){
            
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
        
        
    }
    Ventana marco1;

        Ventana marco2;

}
