/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creando;


import java.io.*;

/**
 *
 * @author Kmilo
 */
public class NewClass {

    public static void main(String[] args) {

        File ruta = new File("E:" + File.separator + "GIT" + File.separator + "JAVA-8-Fundamentos" + File.separator + "Clase160-Manipulación-archivos-y-directorios.-Clase-File-II" + File.separator + "nuevo_directorio.txt");

        ruta.delete();
        
    }
}
