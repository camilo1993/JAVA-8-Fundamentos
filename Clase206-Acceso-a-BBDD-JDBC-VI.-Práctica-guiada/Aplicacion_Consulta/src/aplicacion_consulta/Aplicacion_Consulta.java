/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_consulta;

import javax.swing.*;

import java.awt.*;
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

        add(botonConsulta, BorderLayout.SOUTH);

        //----CONEXIÓN CON BBDD----//
        try {

            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pruebas", "root", "");

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

    private JComboBox secciones;

    private JComboBox paises;

    private JTextArea resultado;

}
