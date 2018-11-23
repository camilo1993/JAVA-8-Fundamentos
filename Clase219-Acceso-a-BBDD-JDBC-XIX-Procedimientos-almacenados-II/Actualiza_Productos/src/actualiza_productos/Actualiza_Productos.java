/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actualiza_productos;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kmilo
 */
public class Actualiza_Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));

        String nArticulo = JOptionPane.showInputDialog("Introduce nombre articulo");
        
        try {
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");
            
            CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?, ?)}");
            
            miSentencia.setInt(1, nPrecio);
            
            miSentencia.setString(2, nArticulo);
            
            miSentencia.execute();
            
            System.out.println("Actualizacion Ok");
            
        } catch (Exception e) {
            
        }
    }

}
