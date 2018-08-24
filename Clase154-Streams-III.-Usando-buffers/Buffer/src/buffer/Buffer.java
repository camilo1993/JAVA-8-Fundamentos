/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffer;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class Buffer {

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

            entrada = new FileReader("E:/GIT/JAVA-8-Fundamentos/Clase154-Streams-III.-Usando-buffers/ejemplo.txt");

            BufferedReader mibuffer = new BufferedReader(entrada);

            String linea = "";

            while (linea != null) {

                linea = mibuffer.readLine();

                if (linea != null) {
                    System.out.println(linea);
                }

            }

            //entrada.close();
        } catch (IOException e) {

            System.out.println("No se ha encontrado el fichero");

        } finally {

            try {
                entrada.close();
            } catch (IOException ex) {
            }

        }

    }
    FileReader entrada;
}
