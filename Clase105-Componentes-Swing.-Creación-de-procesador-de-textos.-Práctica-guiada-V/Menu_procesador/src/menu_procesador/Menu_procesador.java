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

        MenuProcesador mimarco = new MenuProcesador();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO code application logic here
    }

}

class MenuProcesador extends JFrame {

    public MenuProcesador() {

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
        fuente = new JMenu("Fuente");

        estilo = new JMenu("Estilo");

        tamagno = new JMenu("Tamaño");

        configura_menu("Arial", "fuente", "Arial", 9, 10);

        configura_menu("Courier", "fuente", "Courier", 9, 10);

        configura_menu("Verdana", "fuente", "Verdana", 9, 10);
//---------------------------
        configura_menu("Negrita", "estilo", "", Font.BOLD, 1);

        configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);

//-----------------------------------------------------------
        configura_menu("12", "tamaño", "", 9, 12);

        configura_menu("16", "tamaño", "", 9, 16);

        configura_menu("20", "tamaño", "", 9, 20);

        configura_menu("24", "tamaño", "", 9, 24);

//-----------------------------------------------------------        
        mibarra.add(fuente);

        mibarra.add(estilo);

        mibarra.add(tamagno);

        laminamenu.add(mibarra);

        add(laminamenu, BorderLayout.NORTH);

        JTextPane miarea = new JTextPane();

        add(miarea, BorderLayout.CENTER);
    }

    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {

        JMenuItem elem_menu = new JMenuItem(rotulo);

        if (menu == "fuente") {

            fuente.add(elem_menu);
        } else if (menu == "estilo") {

            estilo.add(elem_menu);
        } else if (menu == "tamaño") {

            tamagno.add(elem_menu);
        }
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo,tipo_letra,estilos,tam));
    }

    private class Gestiona_Eventos implements ActionListener {

        String tipo_texto, menu;

        int estilo_letra, tamagno_letra;

        Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra) {

            tipo_texto = texto2;

            estilo_letra = estilo2;

            tamagno_letra = tam_letra;

            menu = elemento;

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));

        }

    }

    JTextPane miarea;

    JMenu fuente, estilo, tamagno;

    Font letras;

}
