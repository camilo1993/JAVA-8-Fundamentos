/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_dialogos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Kmilo
 */
public class Marco_Dialogos extends JFrame {

    public Marco_Dialogos() {

        setTitle("Prueba de Dialogos");

        setBounds(500, 300, 600, 450);

        JPanel lamina_cuadricula = new JPanel();

        lamina_cuadricula.setLayout(new GridLayout(2, 3));

        String primero[] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};

        lamina_tipo = new Lamina_Botones("Tipo", primero);

        lamina_tipo_mensajes = new Lamina_Botones("Tipo de Mensajes", new String[]{"ERROR_MESSAGE", "INFORMATION_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});

        lamina_mensajes = new Lamina_Botones("Mensaje", new String[]{"Cadena", "Icono", "Componente", "Otros", "Object[]"});

        lamina_tipo_opcion = new Lamina_Botones("Confirmar", new String[]{"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"});

        lamina_opciones = new Lamina_Botones("Opcion", new String[]{"String[]", "Icon[]", "Object[]"});

        lamina_entrada = new Lamina_Botones("Entrada", new String[]{"Campo de texto", "Combo"});

        setLayout(new BorderLayout());

        lamina_cuadricula.add(lamina_tipo);

        lamina_cuadricula.add(lamina_tipo_mensajes);

        lamina_cuadricula.add(lamina_mensajes);

        lamina_cuadricula.add(lamina_tipo_opcion);

        lamina_cuadricula.add(lamina_opciones);

        lamina_cuadricula.add(lamina_entrada);

        //Counstruimos lamina inferior
        JPanel lamina_mostrar = new JPanel();

        JButton boton_mostrar = new JButton("Mostrar");

        boton_mostrar.addActionListener(new AccionMostrar());

        lamina_mostrar.add(boton_mostrar);

        add(lamina_mostrar, BorderLayout.SOUTH);

        add(lamina_cuadricula, BorderLayout.CENTER);

    }

    
    //------------------------------PROPORCIONA MENSAJE---------------------------------
    
    
        public Object   dameMensaje(){
        
        String s= lamina_mensajes.dameSeleccion();
        
        if(s.equals("Cadena")){
            
            return cadenaMensaje;
            
        }else if(s.equals("Icono")){
            
            
            return iconoMensaje;
        }else if(s.equals("Componente")){
            
            
            
            return componenteMensaje;
            
        }else if(s.equals("Otros")){
            
            
            return objetoMensaje;
            
        }else if(s.equals("Object[]")){
            
            
            return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
            
            
        }
        return null;
        
        
        
    }
    
    
    //--------------------------------------------------------
    
    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

//            System.out.println(lamina_tipo.dameSeleccion());
            if (lamina_tipo.dameSeleccion().equals("Mensaje")) {

                JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0);

            } else if (lamina_tipo.dameSeleccion().equals("Confirmar")) {

                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0, 0);

            } else if (lamina_tipo.dameSeleccion().equals("Entrada")) {

                JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0);

            } else if (lamina_tipo.dameSeleccion().equals("Opcion")) {

                JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0, 0, null, null, null);
            }

        }

    }

    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensajes, lamina_tipo_opcion, lamina_opciones, lamina_entrada;

    private String cadenaMensaje = "Mensaje";

    private Icon iconoMensaje = new ImageIcon("src/graficos/rojo.gif");

    private Object objetoMensaje = new Date();

    private Component componenteMensaje = new Lamina_Ejemplo();

}


class Lamina_Ejemplo extends JPanel{
    
    
    public void paintComponent(Graphics g ){
        
        
        super.paintComponents(g);
        
        Graphics2D g2=(Graphics2D)g;
        
        Rectangle2D rectangulo=new Rectangle2D.Double(0,0,getWidth(),getHeight());
        
        g2.setPaint(Color.YELLOW);
        
        g2.fill(rectangulo);
        
    }
}