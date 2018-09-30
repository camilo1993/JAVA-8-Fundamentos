/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Kmilo
 */
public class UsoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Libro libro1 = new Libro("P en Java", "Juan", 25);

        Libro libro2 = new Libro("P en Java", "Juan", 25);

        if (libro1.equals(libro2)) {

            System.out.println("es el mismo libro");

        } else {

            System.out.println("No es el mismo Libro");

        }

    }

}
