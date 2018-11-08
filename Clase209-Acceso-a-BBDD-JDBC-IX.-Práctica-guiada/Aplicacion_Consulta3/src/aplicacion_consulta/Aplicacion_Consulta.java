/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_consulta;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Aplicacion_Consulta {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame mimarco = new Marco_Aplicacion();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class Marco_Aplicacion extends JFrame {

    public Marco_Aplicacion() {

        setTitle("Consulta BBDD");

        setBounds(500, 300, 400, 400);

        setLayout(new BorderLayout());

        JPanel menus = new JPanel();

        menus.setLayout(new FlowLayout());

        secciones = new JComboBox();

        secciones.setEditable(false);

        secciones.addItem("Todos");

        paises = new JComboBox();

        paises.setEditable(false);

        paises.addItem("Todos");

        resultado = new JTextArea(4, 50);

        resultado.setEditable(false);

        add(resultado);

        menus.add(secciones);

        menus.add(paises);

        add(menus, BorderLayout.NORTH);

        add(resultado, BorderLayout.CENTER);

        JButton botonConsulta = new JButton("Consulta");

        botonConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ejecutaConsulta();

            }

        });

        add(botonConsulta, BorderLayout.SOUTH);

        //----CONEXIÓN CON BBDD----//
        try {

            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

            Statement sentencia = miConexion.createStatement();

            //--CARGA JCOMBOBOX 
            String consulta = "SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS";

            ResultSet rs = sentencia.executeQuery(consulta);

            while (rs.next()) {

                secciones.addItem(rs.getString(1));
            }

            rs.close();

            //---CARGA JCOMBOBOX PAISES---//
            consulta = "SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS";

            rs = sentencia.executeQuery(consulta);

            while (rs.next()) {

                paises.addItem(rs.getString(1));
            }

            rs.close();

        } catch (Exception e) {

        }

    }

    private void ejecutaConsulta() {

        ResultSet rs = null;

        try {

            resultado.setText("");

            String seccion = (String) secciones.getSelectedItem();

            String pais = (String) paises.getSelectedItem();

            if (!seccion.equals("Todos") && pais.equals("Todos")) {

                enviaConsultaSeccion = miConexion.prepareStatement(consultaSeccion);

                enviaConsultaSeccion.setString(1, seccion);

                rs = enviaConsultaSeccion.executeQuery();

            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {

                enviaConsultaPais = miConexion.prepareStatement(consultaPais);

                enviaConsultaPais.setString(1, pais);

                rs = enviaConsultaPais.executeQuery();

            } else if (!seccion.equals("Todos") && !pais.equals("Todos")) {

                enviaConsultaTodos = miConexion.prepareStatement(consultaTodos);

                enviaConsultaTodos.setString(1, seccion);

                enviaConsultaTodos.setString(2, pais);

                rs = enviaConsultaTodos.executeQuery();

            }

            while (rs.next()) {

                resultado.append(rs.getString(1));

                resultado.append(", ");

                resultado.append(rs.getString(2));

                resultado.append(", ");

                resultado.append(rs.getString(3));

                resultado.append(", ");

                resultado.append(rs.getString(4));

                resultado.append("\n");
            }

        } catch (Exception e) {

        }

    }

    private Connection miConexion;

    private PreparedStatement enviaConsultaSeccion;

    private PreparedStatement enviaConsultaPais;

    private PreparedStatement enviaConsultaTodos;

    private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?";

    private final String consultaPais = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN=?";

    private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=?"
            + " PAÍSDEORIGEN=?";

    private JComboBox secciones;

    private JComboBox paises;

    private JTextArea resultado;

}
