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
import java.awt.Image;
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

        lamina_tipo_mensajes = new Lamina_Botones("Tipo de Mensajes", new String[]{"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});

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
    public Object dameMensaje() {

        String s = lamina_mensajes.dameSeleccion();

        if (s.equals("Cadena")) {

            return cadenaMensaje;

        } else if (s.equals("Icono")) {

            return iconoMensaje;
        } else if (s.equals("Componente")) {

            return componenteMensaje;

        } else if (s.equals("Otros")) {

            return objetoMensaje;

        } else if (s.equals("Object[]")) {

            return new Object[]{cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};

        }
        return null;

    }
    //---------------------devuelve tipo icono y Numero de botones en confirmar

    public int dameTipo(Lamina_Botones lamina) {

        String s = lamina.dameSeleccion();

        if (s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {

            return 0;

        } else if (s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {

            return 1;

        } else if (s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {

            return 2;

        } else if (s.equals("QUESTION_MESSAGE")) {

            return 3;
        } else if (s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {

            return -1;
        }
        return 0;

    }

    //------------ OPCIONES A LA LAMINA
    public Object[] dameOpciones(Lamina_Botones lamina) {

        String s = lamina.dameSeleccion();

        if (s.equals("String[]")) {

            return new String[]{"Amarillo", "Azul", "Rojo"};

        } else if (s.equals("Icon[]")) {

            return new Object[]{new ImageIcon("src/graficos/rojo.gif")};

        } else if (s.equals("Object[]")) {

            return new Object[]{cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};

        }
        return null;

    }

    //--------------------------------------------------------
    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

//            System.out.println(lamina_tipo.dameSeleccion());
            if (lamina_tipo.dameSeleccion().equals("Mensaje")) {

                JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));

            } else if (lamina_tipo.dameSeleccion().equals("Confirmar")) {

                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_opcion), dameTipo(lamina_tipo_mensajes));

            } else if (lamina_tipo.dameSeleccion().equals("Entrada")) {

                if (lamina_entrada.dameSeleccion().equals("Campo de texto")) {

                    JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes));
                } else {

                    JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensajes), null, new String[]{"Amarillo", "Azul", "Rojo"}, "Azul");
                }
            } else if (lamina_tipo.dameSeleccion().equals("Opcion")) {

                JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 1, dameTipo(lamina_tipo_mensajes), null, dameOpciones(lamina_opciones), null);
            }

        }

    }

    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensajes, lamina_tipo_opcion, lamina_opciones, lamina_entrada;

    private String cadenaMensaje = "Mensaje";

    private Icon iconoMensaje = new ImageIcon("src/graficos/rojo.gif");

    private Object objetoMensaje = new Date();

    private Component componenteMensaje = new Lamina_Ejemplo();

}

class Lamina_Ejemplo extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponents(g);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        g2.setPaint(Color.YELLOW);

        g2.fill(rectangulo);

    }
}
