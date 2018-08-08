/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_datos2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kmilo
 */
public class Entrada_datos2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);

        int decision = entrada.nextInt();

        if (decision == 1) {

            try {

                pedirDatos();

            } catch (InputMismatchException e) {

                System.out.println("Que has introducido en la edad");

            }

        } else {

            System.out.println("Adios");

            System.exit(0);
        }

        entrada.close();

    }

    static void pedirDatos() throws InputMismatchException {

//        try {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");

        entrada.close();
//        } catch (InputMismatchException e) {

//            
//
//        }
        System.out.println("Hemos terminado");

    }

}
