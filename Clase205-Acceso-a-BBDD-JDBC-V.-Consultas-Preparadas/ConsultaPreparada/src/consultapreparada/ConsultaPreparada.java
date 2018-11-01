/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultapreparada;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class ConsultaPreparada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            //1 CREAR CONEXION
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            //2 PREPARAR CONSULTA
            PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS"
                    + " WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");

            //3 ESTABLECER PARAMETROS DE CONSULTA
            miSentencia.setString(1, "deportes");

            miSentencia.setString(2, "USA");

            //4 EJECUTAR Y RECORRER CONSULTA
            ResultSet rs = miSentencia.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            rs.close();

            //REUTILIZACION DE CONSULTA
            System.out.println("Ejecucion segunda consulta");

            System.out.println("");

            miSentencia.setString(1, "cerámica");

            miSentencia.setString(2, "China");

            //4 EJECUTAR Y RECORRER CONSULTA
            rs = miSentencia.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            rs.close();

        } catch (SQLException ex) {

        }

    }

}
