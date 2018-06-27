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
          fuente = new JMenu("Fuente");

         estilo = new JMenu("Estilo");

          tamagno = new JMenu("Tamaño");
          
          configura_menu("Arial","fuente", "",1,1);
          
          configura_menu("Courier","fuente", "",1,1);
          
        configura_menu("Verdana", "fuente", "", 1, 1);
//---------------------------
        configura_menu("Negrita", "estilo", "", 1, 1);
        
        configura_menu("Cursiva", "estilo", "", 1, 1);

//-----------------------------------------------------------
        configura_menu("12", "tamaño", "", 1, 1);

        configura_menu("16", "tamaño", "", 1, 1);

        configura_menu("20", "tamaño", "", 1, 1);

        configura_menu("24", "tamaño", "", 1, 1);

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

    }

    JTextPane miarea;

    JMenu fuente, estilo, tamagno;

    Font letras;

}
