/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creando;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class Creando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        File ruta = new File("E:" + File.separator + "GIT" + File.separator + "JAVA-8-Fundamentos" + File.separator + "Clase160-Manipulación-archivos-y-directorios.-Clase-File-II" + File.separator + "nuevo_directorio.txt");

        ////        ruta.mkdir();
        String archivo_destino = ruta.getAbsolutePath();

        try {

            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
        }

        Escribiendo accede_es = new Escribiendo();

        accede_es.escribir(archivo_destino);

    }

}

class Escribiendo {

    public void escribir(String ruta_archivo) {

        String frase = "Esto es un ejemplo";

        try {

            FileWriter escritura = new FileWriter(ruta_archivo);

            for (int i = 0; i < frase.length(); i++) {

                escritura.write(frase.charAt(i));

            }
            escritura.close();

        } catch (IOException e) {
        }

    }

}
