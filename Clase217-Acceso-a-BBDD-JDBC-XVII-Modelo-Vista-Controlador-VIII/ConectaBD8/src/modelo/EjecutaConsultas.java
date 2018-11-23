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

                enviaConsultaPais = conecta.prepareStatement(consultaPais);

                enviaConsultaPais.setString(1, pais);

                rs = enviaConsultaPais.executeQuery();

            } else {

                enviaConsultaTodos = conecta.prepareStatement(consultaTodos);

                enviaConsultaTodos.setString(1, seccion);

                enviaConsultaTodos.setString(2, pais);

                rs = enviaConsultaTodos.executeQuery();
            }

        } catch (Exception e) {

        }
        return rs;

    }
    private final Conexion miConexion;

    private ResultSet rs;

    private PreparedStatement enviaConsultaSeccion;

    private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?";

    private PreparedStatement enviaConsultaPais;

    private final String consultaPais = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=?";

    private PreparedStatement enviaConsultaTodos;

    private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?";

}
