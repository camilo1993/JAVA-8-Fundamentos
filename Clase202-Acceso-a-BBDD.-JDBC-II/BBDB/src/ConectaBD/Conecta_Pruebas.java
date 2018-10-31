/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectaBD;

import java.sql.*;

/**
 *
 * @author Kmilo
 */
public class Conecta_Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            //1. CREAR CONEXION// 
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            //2. CREAR OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();

            //3. EJECUTAR SQL
            ResultSet miResultset = miStatement.executeQuery("Select * FROM PRODUCTOS");

            //4. RECORRER EL RESULTSET
            while (miResultset.next()) {

                System.out.println(miResultset.getString("NOMBREARTÍCULO") + " " + miResultset.getString("CÓDIGOARTÍCULO") + " " + miResultset.getString("PRECIO"));
            }

        } catch (Exception e) {

            System.out.println("NO CONECTA!");

            e.printStackTrace();

        }

        // TODO code application logic here
    }

}
