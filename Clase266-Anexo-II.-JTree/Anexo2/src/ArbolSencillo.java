import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbolSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoArbol();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}

class MarcoArbol extends JFrame {

	public MarcoArbol() {

		setTitle("Arbol sencillo");

		setBounds(350, 300, 600, 600);

		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo");

		DefaultMutableTreeNode pais = new DefaultMutableTreeNode("España");

		raiz.add(pais);

		DefaultMutableTreeNode comunidad = new DefaultMutableTreeNode("Madrid");

		pais.add(comunidad);

		DefaultMutableTreeNode mostoles = new DefaultMutableTreeNode("Mostoles");

		comunidad.add(mostoles);

		DefaultMutableTreeNode alcobendas = new DefaultMutableTreeNode("Alcobendas");

		comunidad.add(alcobendas);

		comunidad = new DefaultMutableTreeNode("Cantabria");

		pais.add(comunidad);

		DefaultMutableTreeNode santillana = new DefaultMutableTreeNode("Santillana del mar");

		comunidad.add(santillana);

		pais = new DefaultMutableTreeNode("Alemania");

		raiz.add(pais);

		comunidad = new DefaultMutableTreeNode("Baviera");

		pais.add(comunidad);

		DefaultMutableTreeNode munich = new DefaultMutableTreeNode("Munich");

		comunidad.add(munich);

		JTree arbol = new JTree(raiz);

		//LaminaArbol milamina = new LaminaArbol(arbol);

		//add(milamina);
		
		Container laminaContenido=getContentPane();
		
		laminaContenido.add(new JScrollPane(arbol));

	}

}

class LaminaArbol extends JPanel {

	public LaminaArbol(JTree miarbol) {

		setLayout(new BorderLayout());

		add(miarbol, BorderLayout.NORTH);

	}

}