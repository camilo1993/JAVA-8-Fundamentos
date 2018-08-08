/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprueba_mail;

import javax.swing.JOptionPane;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class Comprueba_Mail {

    public static void main(String[] args) {

        String el_mail = JOptionPane.showInputDialog("Introduce mail: ");
        try {
            examina_mail(el_mail);
        } catch (EOFException e) {

            System.out.println("La direccion de email no es correcta")
            
        }
    }

    static void examina_mail(String mail) throws EOFException {

        int arroba = 0;

        boolean punto = false;

        if (mail.length() <= 3) {

//            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw new EOFException();

        } else {

            for (int i = 0, n = mail.length(); i < n; i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (arroba == 1 && punto == true) {
                System.out.println("Es correcto.");
            } else {
                System.out.println("No es correcto.");
            }
        }
    }
}
﻿
