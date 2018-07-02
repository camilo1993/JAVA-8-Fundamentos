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
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Kmilo
 */
public class Menu_procesador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MarcoProcesador2 mimarco = new MarcoProcesador2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoProcesador2 extends JFrame {

    public MarcoProcesador2() {
        setBounds(350, 200, 600, 450);
        LaminaProcesador2 milamina = new LaminaProcesador2();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProcesador2 extends JPanel {

    public LaminaProcesador2() {
        setLayout(new BorderLayout());
        mibarra = new JMenuBar();

        creaLienzo();

        String[] itemsFuentes = {"Arial", "Verdana", "Raleway"};
        creaMenu("Fuentes", itemsFuentes);

        String[] itemsEstilo = {"Negrita", "Cursiva"};
        creaMenu("Estilo", itemsEstilo);

        String[] itemsTamanos = {"12", "16", "20", "24"};

        creaMenu("Tamaños", itemsTamanos);

        //creaLienzo();
    }

    public void creaMenu(String pestaña, String[] misitems) {
        JMenu mimenu = new JMenu(pestaña);
        for (String item : misitems) {
            JMenuItem mimenuitem = new JMenuItem(item);
            if (mibarra.getMenuCount() == 0) {
                mimenu.add(item).addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", item));
            } else if (mibarra.getMenuCount() == 1) {
                if (item == "Negrita") {
                    mimenu.add(item).addActionListener(new StyledEditorKit.BoldAction());
                } else {
                    mimenu.add(item).addActionListener(new StyledEditorKit.ItalicAction());
                }
            } else {
                mimenu.add(item).addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", Integer.parseInt(item)));
            }
        }
        mibarra.add(mimenu);
        add(mibarra, BorderLayout.NORTH);
    }

    public void creaLienzo() {
        JPanel laminalienzo = new JPanel();
        lienzo = new JTextPane();
        laminalienzo.add(lienzo);
        add(laminalienzo, BorderLayout.CENTER);
    }

    private JMenuBar mibarra;
    private JTextPane lienzo;
}
