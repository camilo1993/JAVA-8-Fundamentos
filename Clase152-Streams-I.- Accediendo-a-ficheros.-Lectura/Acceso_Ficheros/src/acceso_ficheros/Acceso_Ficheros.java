/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_ficheros;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class Acceso_Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Leer_Fichero accediendo = new Leer_Fichero();

        accediendo.lee();

    }

}

class Leer_Fichero {

    public void lee() {

        try {

            FileReader entrada = new FileReader("E:/GIT/JAVA-8-Fundamentos/Clase152-Streams-I.- Accediendo-a-ficheros.-Lectura/ejemplo.txt");

            int c = entrada.read();

            while (c != -1) {

                c = entrada.read();

                char letra = (char) c;

                System.out.print(letra);

            }

        } catch (IOException e) {

            System.out.println("No se ha encontrado el fichero");

        }

    }

}
