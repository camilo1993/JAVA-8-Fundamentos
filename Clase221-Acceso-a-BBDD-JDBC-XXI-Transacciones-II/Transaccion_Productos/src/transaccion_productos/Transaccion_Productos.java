/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion_productos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kmilo
 */
public class Transaccion_Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection miConexion = null;

        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            miConexion.setAutoCommit(false);

            Statement miStatement = miConexion.createStatement();

            String instruccionSql_1 = "DELETE FROM PRODUCTOS WHERE PAÍSDEORIGEN='USA'";

            String instruccionSql_2 = "DELETE FROM PRODUCTOS WHERE PRECIO>300";

            String instruccionSql_3 = "UPDATE PRODUCTOS SET PRECIO=PRECIO*1.15";

            boolean ejecutar = ejecutar_transaccion();

            if (ejecutar) {

                miStatement.executeUpdate(instruccionSql_1);

                miStatement.executeUpdate(instruccionSql_2);

                miStatement.executeUpdate(instruccionSql_3);

                miConexion.commit();

                System.out.println("Se ejecuto la transaccion correctamente");

            }else{
                
                System.out.println("No se realizo cambio alguno en BBDD");
            }

            miStatement.executeUpdate(instruccionSql_2);

        } catch (Exception e) {

            try {
                miConexion.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Transaccion_Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("algo salio mal y no se realizo cambio alguno en BBDD");
            
        }

    }

    static boolean ejecutar_transaccion() {

        String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos transaccion?");

        if (ejecucion.equals("si")) {
            return true;
        } else {
            return false;
        }

    }
}
