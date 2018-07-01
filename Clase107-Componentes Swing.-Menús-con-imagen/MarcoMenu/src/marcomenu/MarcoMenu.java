/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcomenu;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Kmilo
 */
public class MarcoMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MenuFrame mimarco = new MenuFrame();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

        // TODO code application logic here
    }

}

class MenuFrame extends JFrame {

    public MenuFrame() {

        setBounds(500, 300, 550, 400);

        MenuLamina milamina = new MenuLamina();

        add(milamina);

        setVisible(true);

    }

}

class MenuLamina extends JPanel {

    public MenuLamina() {

        JMenuBar mibarra = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");

        JMenu edicion = new JMenu("Edicion");

        JMenu herramientas = new JMenu("Herramientas");

        JMenuItem guardar = new JMenuItem("Guardar");

        JMenuItem guardar_como = new JMenuItem("Guardar Como");

        JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("src/graficos/cortar.gif"));

        JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("src/graficos/copiar.gif"));
        
//        copiar.setHorizontalTextPosition(SwingConstants.LEFT); cambiar icono de posicion

        JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("src/graficos/pegar.gif"));

        JMenuItem generales = new JMenuItem("Generales");
 
        JMenu opciones = new JMenu("Opciones");

        JMenu opcion1 = new JMenu("Opcion 1");

        JMenu opcion2 = new JMenu("Opcion 2");

        opciones.add(opcion1);

        opciones.add(opcion2);

        archivo.add(guardar);

        archivo.add(guardar_como);

        edicion.add(cortar);

        edicion.add(copiar);

        edicion.add(pegar);

        edicion.addSeparator();

        edicion.add(opciones);

        herramientas.add(generales);

        mibarra.add(archivo);

        mibarra.add(edicion);

        mibarra.add(herramientas);

        add(mibarra);
    }

}
