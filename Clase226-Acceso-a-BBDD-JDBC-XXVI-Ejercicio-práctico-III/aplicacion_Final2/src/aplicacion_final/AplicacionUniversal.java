/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_final;

import java.awt.*;

import java.awt.event.*;

import java.io.*;

import java.sql.*;

import java.util.*;

import javax.swing.*;

public class AplicacionUniversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoBBDD mimarco = new MarcoBBDD();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class MarcoBBDD extends JFrame {

    public MarcoBBDD() {

        setBounds(300, 300, 700, 700);

        LaminaBBDD milamina = new LaminaBBDD();

        add(milamina);

    }

}

class LaminaBBDD extends JPanel {

    public LaminaBBDD() {

        setLayout(new BorderLayout());

        comboTablas = new JComboBox();

        areaInformacion = new JTextArea();

        add(areaInformacion, BorderLayout.CENTER);

        ConectarBBDD();

        obtenerTablas();

        comboTablas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombreTabla = ((String) comboTablas.getSelectedItem());

                mostrarInfoTabla(nombreTabla);
                
            }

        }
        );

     

        add(comboTablas, BorderLayout.NORTH);
        
        ConectarBBDD();
        
        obtenerTablas();
        
    }
    
    public void ConectarBBDD() {
        
        miConexion = null;
        
        String datos[]=new String [3];
        
        try {
            
            entrada=new FileReader("E:/GIT/JAVA-8-Fundamentos/Clase226-Acceso-a-BBDD-JDBC-XXVI-Ejercicio-práctico-III/datos_config.txt");   
            
            BufferedReader miBuffer=new BufferedReader(entrada);
            
            for(int i=0; i<=2; i++){
            
            datos[i]= miBuffer.readLine();  
            
            
        }
            
            miConexion = DriverManager.getConnection(datos[0], datos[1], datos[2]);
            
            entrada.close();
            
        }catch(IOException e){
        
        JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo de conexion");
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    public void obtenerTablas() {
        
        ResultSet miResultSet = null;
        
        try {
            DatabaseMetaData datosBBDD = miConexion.getMetaData();
            
            miResultSet = datosBBDD.getTables(null, null, null, null);
            
            while (miResultSet.next()) {
                
                comboTablas.addItem(miResultSet.getString("TABLE_NAME"));
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }
    
    public void mostrarInfoTabla(String tabla) {
        
        ArrayList<String> campos = new ArrayList<String>();

        String consulta = "SELECT * FROM pruebas ";

        try {

            areaInformacion.setText("");
            
            Statement miStatement = miConexion.createStatement();
            
            ResultSet miResultSet = miStatement.executeQuery(consulta);
            
            ResultSetMetaData rsBBDD = miResultSet.getMetaData();
            
            for (int i = 1; i <= rsBBDD.getColumnCount(); i++) {
                
                campos.add(rsBBDD.getColumnLabel(i));
                
            }
            
            while (miResultSet.next()) {
                
                for (String nombreCampo : campos) {
                    
                    areaInformacion.append(miResultSet.getNString(nombreCampo) + " ");
                    
                }
                
                areaInformacion.append("\n");
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    private JComboBox comboTablas;
    
    private JTextArea areaInformacion;
    
    private Connection miConexion;
    
    private FileReader entrada;
}
