/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprocesador;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Kmilo
 */
public class MenuProcesador {

    /**
     * @param the command line arguments
     */
    public static void main(String[] args) {
        marcoProcesador marco = new marcoProcesador();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class marcoProcesador extends JFrame {

    public marcoProcesador() {
        setTitle("IGT Soft - Procesador de Texto");
        setBounds(450, 250, 400, 300);

        panelProcesador panel = new panelProcesador();
        add(panel);
    }

}

class panelProcesador extends JPanel {

    JTextArea texto = new JTextArea();
    String letraFuente = "Dialog";
    int letraEstilo = Font.PLAIN;
    int letraTamagno = 12;

    public panelProcesador() {

        setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();

        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamaño = new JMenu("Tamaño");

        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamaño);

        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem verdana = new JMenuItem("Verdana");
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        JMenuItem ocho = new JMenuItem("8");
        JMenuItem diez = new JMenuItem("10");
        JMenuItem doce = new JMenuItem("12");
        JMenuItem catorce = new JMenuItem("14");
        JMenuItem dieciseis = new JMenuItem("16");

        fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);
        estilo.add(negrita);
        estilo.add(cursiva);
        tamaño.add(ocho);
        tamaño.add(diez);
        tamaño.add(doce);
        tamaño.add(catorce);
        tamaño.add(dieciseis);

        arial.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraFuente = "Arial";
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // arial

        courier.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraFuente = "Courier";
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // courier

        verdana.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraFuente = "Verdana";
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // verdana

        negrita.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                if (letraEstilo == Font.ITALIC) {
                    letraEstilo = 3;
                } else {
                    letraEstilo = Font.BOLD;
                }

                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // negrita 

        cursiva.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                if (letraEstilo == Font.BOLD) {
                    letraEstilo = 3;
                } else {
                    letraEstilo = Font.ITALIC;
                }

                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // cursiva

        ocho.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraTamagno = 8;
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // ocho

        diez.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraTamagno = 10;
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // diez

        doce.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraTamagno = 12;
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // doce

        catorce.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraTamagno = 14;
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // catorce

        dieciseis.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                letraTamagno = 16;
                texto.setFont(new Font(letraFuente, letraEstilo, letraTamagno));

            }

        }); // dieciseis
        texto = new JTextArea();

        add(menu, BorderLayout.NORTH);
        add(texto, BorderLayout.CENTER);

    } // public

} // class panelProcesador﻿
