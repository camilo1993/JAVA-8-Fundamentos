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
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
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

        MarcoProcesador marco1 = new MarcoProcesador();
        marco1.setVisible(true);

    }
}

class MarcoProcesador extends JFrame {

    public MarcoProcesador() {

        setBounds(400, 200, 550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi procesador de texto");
        add(new LaminaProcesador());
        
        
        
    }
}

class LaminaProcesador extends JPanel {

    private JTextPane areaTexto;
    private JPanel laminaMenu;
    private JMenuBar barraMenu;
    private JMenu fuente, estilo, tamagno;
    private Font letras;

    
    public LaminaProcesador() {

        setLayout(new BorderLayout());
        
        laminaMenu = new JPanel();

        add(laminaMenu, BorderLayout.NORTH);

        areaTexto = new JTextPane();
        
          JPopupMenu emergente = new JPopupMenu();

        JMenuItem negritaE = new JMenuItem("Negrita");

        JMenuItem cursivaE = new JMenuItem("Cursiva");

        emergente.add(negritaE);

        emergente.add(cursivaE);

        setComponentPopupMenu(emergente);

        areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));

        add(areaTexto, BorderLayout.CENTER);
      
     

        barraMenu = new JMenuBar();

        laminaMenu.add(barraMenu);

        fuente = new JMenu("Fuente");

        estilo = new JMenu("Estilo");

        tamagno = new JMenu("Tamaño");

        barraMenu.add(fuente);
        
        barraMenu.add(estilo);
        
        barraMenu.add(tamagno);

        configuraMenu("Arial", "fuente", 10, "");
        configuraMenu("Courier", "fuente", 10,"");
        configuraMenu("Verdana", "fuente", 10,"");
        
        //--------------
      
//        configuraMenu("Negrita", "estilo", Font.BOLD,"src/graficos/fuente.png");
//        configuraMenu("Cursiva", "estilo", Font.ITALIC,"src/graficos/fuente.png");
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/negrita.png"));

        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/cursiva.png"));

        negrita.addActionListener(new StyledEditorKit.BoldAction());
        
        negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        
        cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));

        estilo.add(negrita);

        estilo.add(cursiva);



        //-----------------
//        configuraMenu("12", "tamagno", 12,"");
//        configuraMenu("16", "tamagno", 16,"");
//        configuraMenu("20", "tamagno", 20,"");
//        configuraMenu("24", "tamagno", 24,"");
        ButtonGroup tamagno_letra = new ButtonGroup();

        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");

        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");

        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");

        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
        
//        veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        

        tamagno_letra.add(doce);

        tamagno_letra.add(dieciseis);

        tamagno_letra.add(veinte);

        tamagno_letra.add(veinticuatro);

        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));

        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));

        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));

        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
        
        tamagno.add(doce);
        
        tamagno.add(dieciseis);
        
        tamagno.add(veinte);
        
        tamagno.add(veinticuatro);


        letras = areaTexto.getFont();

        //-----------------------------------------------------------
        JToolBar barra = new JToolBar();

        JButton negritaBarra = new JButton(new ImageIcon("src/graficos/negrita.png"));

        JButton cursivaBarra = new JButton(new ImageIcon("src/graficos/cursiva.png"));
        
        JButton subrayarBarra = new JButton(new ImageIcon("src/graficos/subrayar.png"));
        
        negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
        
        cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        
        subrayarBarra.addActionListener(new StyledEditorKit.UnderlineAction());
        
        barra.add(negritaBarra);
        
        barra.add(cursivaBarra);
        
        barra.add(subrayarBarra);
        
        barra.setOrientation(1);
        
        add(barra, BorderLayout.WEST);

   
      
        
    }

    public void configuraMenu(String rotulo, String menu, int val,String ruta_icono) {

        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
        if (menu == "fuente") {
            fuente.add(elem_menu);
        } else if (menu == "estilo") {
            estilo.add(elem_menu);
        } else if (menu == "tamagno") {
            tamagno.add(elem_menu);
        }

        elem_menu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                if (menu == "fuente") {

                    letras = new Font(rotulo, letras.getStyle(), letras.getSize());
                }
                 else if (menu == "tamagno") {

                    float tam2 = val;
                    letras = letras.deriveFont(tam2);
                }

                areaTexto.setFont(letras);
            }
        });
    }
}
