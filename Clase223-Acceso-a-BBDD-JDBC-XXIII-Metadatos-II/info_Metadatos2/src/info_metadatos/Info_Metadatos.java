/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info_metadatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class Info_Metadatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        mostrarinfo_BBDD();
        mostrarInfo_Tablas();

    }

    static void mostrarinfo_BBDD() {

        Connection miConexion = null;

        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            //Obtencion de metadatos
            DatabaseMetaData datosBBDD = miConexion.getMetaData();

            //Mostramos informacion de la BBDD
            System.out.println("Gestor de BBDD" + datosBBDD.getDatabaseProductName());

            System.out.println("Version del Gestor" + datosBBDD.getDatabaseProductVersion());

            System.out.println("Nombre del driver" + datosBBDD.getDriverName());

            System.out.println("Version del driver" + datosBBDD.getDriverVersion());

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Info_Metadatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    static void mostrarInfo_Tablas() {

        Connection miConexion = null;

        ResultSet miResultset = null;

        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            //Obtencion de metadatos
            DatabaseMetaData datosBBDD = miConexion.getMetaData();

            //Lista de tablas
            System.out.println("Lista de tablas");

            miResultset = datosBBDD.getTables(null, null, null, null);

            while (miResultset.next()) {

                System.out.println(miResultset.getString("TABLE_NAME"));

            }

            //Lista de columnas de productos
            System.out.println("");

            System.out.println("Campos de Productos");

            miResultset = datosBBDD.getColumns(null, null, "productos", null);

            while (miResultset.next()) {

                System.out.println(miResultset.getString("COLUMN_NAME"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Info_Metadatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
