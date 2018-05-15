/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author kamilo
 */

import javax.swing.*;

public class Graficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        miMarco marco1 = new miMarco();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class miMarco extends JFrame {

    public miMarco() {

        setSize(500, 300);

    }

}
