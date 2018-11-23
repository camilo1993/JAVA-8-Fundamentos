/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserta_clientes_pedidos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class Inserta_Clientes_Pedidos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub	

        Connection miConexion = null;

        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            miConexion.setAutoCommit(false);

            Statement miStatement = miConexion.createStatement();

            String instruccionSql_1 = "INSERT INTO CLIENTES (CÓDIGOCLIENTE, EMPRESA, DIRECCIÓN) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";

            miStatement.executeUpdate(instruccionSql_1);

            String instruccionSql_2 = "INSERT INTO PEDIDOS (NÚMERODEPEDIDO, CÓDIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";

            miStatement.executeUpdate(instruccionSql_2);

            miConexion.commit();

            System.out.println("Datos INSERTADOS correctamente");

        } catch (Exception e) {

            System.out.println("ERROR EN LA INSERCIÓN DE DATOS!!");

            try {
                miConexion.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Inserta_Clientes_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            }

            e.printStackTrace();

        }

    }

}
