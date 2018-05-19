/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_letras;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

/**
 *
 * @author kamilo
 */
public class Prueba_letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String fuente = JOptionPane.showInputDialog("Introduce Fuente");

        boolean estalafuente = false;

        String[] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombredelafuente : nombreDeFuentes) {

            if (nombredelafuente.equals(fuente)) {

                estalafuente = true;

            }

        }

        if (estalafuente) {

            System.out.println("Fuente instalada");

        } else {

            System.out.println("No esta instalada la Fuente");
        }

    }

}
