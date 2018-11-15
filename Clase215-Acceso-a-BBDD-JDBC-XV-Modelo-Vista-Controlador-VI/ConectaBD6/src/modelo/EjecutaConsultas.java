/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author Kmilo
 */
public class EjecutaConsultas {

    public String filtraBBDD(String seccion, String pais) {

        pruebas = "";

        if (!seccion.equals("Todos") && pais.equals("Todos")) {

            pruebas = "Has escogido seccion";

        } else if (seccion.equals("Todos") && !pais.equals("Todos")) {

            pruebas = "Has escogido un pais";

        } else {

            pruebas = "Has escogido ambos";
        }
        return pruebas;
    }

    private String pruebas;
}
