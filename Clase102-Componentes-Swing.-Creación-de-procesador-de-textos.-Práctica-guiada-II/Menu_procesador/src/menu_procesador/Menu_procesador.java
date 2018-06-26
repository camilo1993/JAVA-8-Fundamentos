/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_procesador;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author Kmilo
 */
public class Menu_procesador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MenuProcesador_II mimarco = new MenuProcesador_II();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MenuProcesador_II extends JFrame {

    public MenuProcesador_II() {

        setBounds(500, 300, 550, 400);

        LaminaProcesador_II milamina = new LaminaProcesador_II();

        add(milamina);

        setVisible(true);

    }
}

class LaminaProcesador_II extends JPanel {

    public LaminaProcesador_II() {

        setLayout(new BorderLayout());

        JPanel laminamenu = new JPanel();

        JMenuBar mibarra = new JMenuBar();

        //------------------------------
        JMenu fuente = new JMenu("Fuente");

        JMenu estilo = new JMenu("Estilo");

        JMenu tamagno = new JMenu("Tamaño");
//---------------------------

        JMenuItem arial = new JMenuItem("Arial");

        arial.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Arial", Font.PLAIN, 12));

            }

        });

        JMenuItem courier = new JMenuItem("Courier");

        courier.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Courier", Font.PLAIN, 12));

            }

        });

        JMenuItem verdana = new JMenuItem("Verdana");

        verdana.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                miarea.setFont(new Font("Verdana", Font.PLAIN, 12));

            }

        });

        fuente.add(arial);

        fuente.add(courier);

        fuente.add(verdana);

        //---------------------------------
        JMenuItem negrita = new JMenuItem("Negrita");

        JMenuItem cursiva = new JMenuItem("Cursiva");

        estilo.add(negrita);

        estilo.add(cursiva);

        //----------------------------------------
        JMenuItem tam_12 = new JMenuItem("12");

        JMenuItem tam_16 = new JMenuItem("16");

        JMenuItem tam_20 = new JMenuItem("20");

        JMenuItem tam_24 = new JMenuItem("24");

        tamagno.add(tam_12);

        tamagno.add(tam_16);

        tamagno.add(tam_20);

        tamagno.add(tam_24);

//-----------------------------------------------------------        
        mibarra.add(fuente);

        mibarra.add(fuente);

        mibarra.add(estilo);

        mibarra.add(tamagno);

        laminamenu.add(mibarra);

        add(laminamenu, BorderLayout.NORTH);

        JTextPane miarea = new JTextPane();

        add(miarea, BorderLayout.CENTER);

    }

    JTextPane miarea;

}
