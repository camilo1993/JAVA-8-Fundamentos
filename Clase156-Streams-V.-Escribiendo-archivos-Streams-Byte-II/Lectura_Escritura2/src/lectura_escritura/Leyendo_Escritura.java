/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_escritura;

import java.io.*;

public class Leyendo_Escritura {

    public static void main(String[] args) {

        leer_Archivo();
    }

    public static void leer_Archivo() {
        try {
//Abre el stream de datos.

            FileInputStream archivo_lectura = new FileInputStream("E:/GIT/JAVA-8-Fundamentos/Clase156-Streams-V.-Escribiendo-archivos-Streams-Byte-II/ejemplo.png");

//Almacena el número de bytes.
            BufferedInputStream memoriaAux = new BufferedInputStream(archivo_lectura);
            int tamañoBuffer = memoriaAux.available();

//Establece el tamaño del arreglo. 
            int bytes_archivo[] = new int[tamañoBuffer];

//Almacena en el arreglo los bytes. 
            for (int i = 0; i < bytes_archivo.length; i++) {
                bytes_archivo[i] = memoriaAux.read();

//Imprimiendo para verificar. System.out.println(bytes_archivo[i]);
            }

//Se cierra el Stream 
            archivo_lectura.close();

            System.out.printf("El número de bytes en el archivo es: %d\n", tamañoBuffer);
        } catch (FileNotFoundException ex) {

            System.out.println("No se encuentra el archivo.");

        } catch (IOException ex) {

            System.out.println("Problema de memoria");

        }
        
        

    static void crea_fichero(int datos_nuevo_fichero[]) {

        try {
            FileOutputStream fichero_nuevo = new FileOutputStream("E:/GIT/JAVA-8-Fundamentos/Clase156-Streams-V.-Escribiendo-archivos-Streams-Byte-II/ejemplo2.png")
                
            for (int i = 0; i < datos_nuevo_fichero.length; i++) {

                fichero_nuevo.wait(datos_nuevo_fichero[i]);

            }
                fichero_nuevo.close();
        } catch (IOException e) {
        }

    }

}

﻿
