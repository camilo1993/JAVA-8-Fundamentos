/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;

/**
 *
 * @author Kmilo
 */
public class Conexion {

    Connection miConexion = null;

    public Conexion() {

    }

    public Connection dameConexion() {

        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

        } catch (Exception e) {

        }

        return miConexion;
    }
}
