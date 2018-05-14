/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatemporizador1;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

/**
 *
 * @author kamilo
 */
public class PruebaTemporizador2 {

    public static void main(String[] args) {
        
        
        Reloj mireloj=new Reloj(3000, true);
        
        mireloj.enMarcha();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

        System.exit(0);
        
    }

}


class Reloj {

    public Reloj(int intervalo, boolean sonido) {
        
        this.intervalo=intervalo;
        
        this.sonido=sonido;
        

    }

    public void enMarcha(){
        
        ActionListener oyente=new DameLaHora2();
        
        Timer mitemporizador=new Timer(intervalo, oyente);
        
        mitemporizador.start();
    }
    
    private int intervalo;
    private boolean sonido;
    
    private class DameLaHora2 implements ActionListener{
        
        public void actionPerformed(ActionEvent evento){
            
            Date ahora=new Date();
            
            System.out.println("Te pongo la hora cada 3 seg: " + ahora);
             
            if(sonido){
                
                Toolkit.getDefaultToolkit().beep(); 
                
                
            }
            
            
        }
    }
}
