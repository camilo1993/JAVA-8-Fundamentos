/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatemporizador1;

import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();

        //ActionListener oyente=new DameLaHora();
        Timer mitemporizador = new Timer(5000, oyente);

        mitemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

        System.exit(0);

    }

}

class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 sg: " + ahora);
        
         Toolkit.getDefaultToolkit().beep();

    }
}
