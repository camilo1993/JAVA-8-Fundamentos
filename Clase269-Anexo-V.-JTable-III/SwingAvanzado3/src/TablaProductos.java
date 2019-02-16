import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class TablaProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame mimarco = new MarcoProductos();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class MarcoProductos extends JFrame {

	public MarcoProductos() {

		setTitle("Productos");

		setBounds(500, 300, 800, 400);

		JPanel superior = new JPanel();

		nombresDeTablas = new JComboBox();

		try {

			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/curso_sql", "root", "");

			datosBBDD = miconexion.getMetaData();

			rs = datosBBDD.getTables(null, null, null, null);

			while (rs.next()) {

				nombresDeTablas.addItem(rs.getString("TABLE_NAME"));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		nombresDeTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String tablaSeleccionada = (String) nombresDeTablas.getSelectedItem();

				String consulta = "SELECT * FROM " + tablaSeleccionada;

				try {

					sentencia = miconexion.createStatement();

					rs = sentencia.executeQuery(consulta);
					
					while(rs.next()) {
						
						
					}

				} catch (Exception e2) {

					e2.printStackTrace();
				}

			}

		});

		superior.add(nombresDeTablas);

		add(superior, BorderLayout.NORTH);

	}

	private JComboBox nombresDeTablas;

	private DatabaseMetaData datosBBDD;

	private ResultSet rs;

	private Connection miconexion;

	private Statement sentencia;
}