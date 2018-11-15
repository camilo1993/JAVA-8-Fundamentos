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

    public EjecutaConsultas() {

        miConexion = new Conexion();

    }

    public ResultSet filtraBBDD(String seccion, String pais) {

        Connection conecta = miConexion.dameConexion();

        rs = null;

        try {

            if (!seccion.equals("Todos") && pais.equals("Todos")) {

                enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);

                enviaConsultaSeccion.setString(1, seccion);

                rs = enviaConsultaSeccion.executeQuery();

            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {

            } else {

            }

        } catch (Exception e) {

        }
        return rs;

    }
    private final Conexion miConexion;

    private ResultSet rs;

    private PreparedStatement enviaConsultaSeccion;

    private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?";
}
