/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import javax.swing.JOptionPane;

public class Aleatorios {

    public static void main(String[] args) {

        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));

        int numAleatorios[] = new int[elementos];

        for (int i = 0; i < numAleatorios.length; i++) {

            numAleatorios[i] = (int) (Math.random() * 100);

        }
        for (int elem : numAleatorios) {
            System.out.println(elem);
        }

    }
    ﻿
}
