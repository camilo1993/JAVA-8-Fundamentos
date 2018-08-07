/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallos;

import javax.swing.JOptionPane;

/**
 *
 * @author Kmilo
 */
public class Fallos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] mi_matriz = new int[5];

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 75;

        for (int i = 0; i < 5; i++) {

            System.out.println("Posicion" + i + "=" + mi_matriz[i]);

        }

        //Peticion datos personales 
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        System.out.println("Hola " + nombre + " Tienes " + edad + " años " + " El programa termino su ejecucion");

    }

}
