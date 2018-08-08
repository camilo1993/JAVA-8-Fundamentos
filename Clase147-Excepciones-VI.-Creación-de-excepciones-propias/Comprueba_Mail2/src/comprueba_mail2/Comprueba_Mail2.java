/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprueba_mail2;

import javax.swing.JOptionPane;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class Comprueba_Mail2 {

    public static void main(String[] args) {

        String el_mail = JOptionPane.showInputDialog("Introduce mail: ");

        try {
            examina_mail(el_mail);
        } catch (Exception e) {

            System.out.println("La direccion de email no es correcta");

            e.printStackTrace();
        }
    }

    static void examina_mail(String mail) throws Longitud_mail_erronea {

        int arroba = 0;

        boolean punto = false;

        if (mail.length() <= 3) {

//            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
//            throw new EOFException();
            throw new Longitud_mail_erronea("El mail es demasiado corto");

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

public class Longitud_mail_erronea extends Exception {

    public Longitud_mail_erronea() {
    }

    public Longitud_mail_erronea(String msj_error) {

        super(msj_error);

    }

}
