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
public class Libro {

    public Libro(String titulo, String Autor, int ISBN) {

        this.titulo = titulo;

        this.autor = autor;

        this.ISBN = ISBN;

    }

    public boolean equals(Object obj) {

        if (obj instanceof Libro) {

            Libro otro = (Libro) obj;

            if (this.ISBN == otro.ISBN) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;
        }

    }

    private String titulo;

    private String autor;

    private int ISBN;

}
