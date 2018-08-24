/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros_directorios;

import java.io.*;

/**
 *
 * @author Kmilo
 */
public class Ficheros_directorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        File archivo =new File ("src");
//        
//        System.out.println(archivo.getAbsolutePath());
//        
//        System.out.println(archivo.exists());
        File ruta = new File("E:/GIT/JAVA-8-Fundamentos/Clase159-Manipulación-archivos-y-directorios.-Clase-File-I");

        System.out.println(ruta.getAbsolutePath());

        String[] nombres_archivos = ruta.list();

        for (int i = 0; i < nombres_archivos.length; i++) {

            System.out.println(nombres_archivos[i]);

            File f = new File(ruta.getAbsolutePath(), nombres_archivos[i]);

            if (f.isDirectory()) {

                String[] archivos_subcarpeta = f.list();

                for (int j = 0; j < archivos_subcarpeta.length; j++) {

                    System.out.println(archivos_subcarpeta[j]);
                }

            }

        }

    }

}
