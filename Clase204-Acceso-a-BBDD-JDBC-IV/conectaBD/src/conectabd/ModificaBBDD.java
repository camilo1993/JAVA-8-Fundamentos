/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectabd;

import java.sql.*;

/**
 *
 * @author Kmilo
 */
public class ModificaBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            //1. CREAR CONEXION// 
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            //2. CREAR OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();

            //String instruccionSql = "INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, NOMBREARTÍCULO, PRECIO) VALUES('AR77', 'PANTALÓN', 25.35)"; INSERTA PRODUCTOS
            //String instruccionSql = "UPDATE PRODUCTOS SET PRECIO =PRECIO*2 WHERE CÓDIGOARTÍCULO='AR77'"; MODIFICA PRODUCTOS
            String instruccionSql = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO='AR77'"; //ELIMINA PRODUCTOS

            miStatement.executeUpdate(instruccionSql);

            System.out.println("Datos actualizados correctamente");

        } catch (Exception e) {

            System.out.println("NO CONECTA!");

            e.printStackTrace();

        }

        // TODO code application logic here
    }

}
