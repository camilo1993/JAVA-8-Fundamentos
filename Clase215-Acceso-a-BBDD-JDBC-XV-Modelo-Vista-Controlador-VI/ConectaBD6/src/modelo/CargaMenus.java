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
public class CargaMenus {

    public CargaMenus() {

        miConexion = new Conexion();

    }

    public String ejecutaConsultas() {

        Productos miProducto = null;

        Connection accesoBBDD = miConexion.dameConexion();

        try {
            Statement secciones = accesoBBDD.createStatement();

            Statement paises = accesoBBDD.createStatement();

            rs = secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");

            rs2 = paises.executeQuery("SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS");

            miProducto = new Productos();
            
            miProducto.setSeccion(rs.getString(1));
         
            miProducto.setpOrigen(rs2.getString(1));

            rs.close();

            rs2.close();

            accesoBBDD.close();
        } catch (Exception e) {

        }
        return miProducto.getSeccion();
    }

    public Conexion miConexion;

    public ResultSet rs;
    
    public ResultSet rs2;
    
}
