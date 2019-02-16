import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

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

					modelo = new ResultSetModeloTabla(rs);

					JTable tabla = new JTable(modelo);

					add(new JScrollPane(tabla), BorderLayout.CENTER);

					validate();

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

	private ResultSetModeloTabla modelo;
}

class ResultSetModeloTabla extends AbstractTableModel {

	public ResultSetModeloTabla(ResultSet unResultset) {

		rsRegistros = unResultset;

		try {

			resmd = rsRegistros.getMetaData();

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		try {
			return resmd.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return 0;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub

		try {
			rsRegistros.last();

			return rsRegistros.getRow();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return 0;
		}

	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		try {

			rsRegistros.absolute(arg0 + 1);

			return rsRegistros.getObject(arg1 + 1);
		} catch (Exception e) {

			e.printStackTrace();

			return null;

		}
	}

	public String getColumnName(int c) {

		try {

			return resmd.getColumnName(c + 1);

		} catch (Exception e) {

			e.printStackTrace();
			
			return null;

		}

	}

	private ResultSet rsRegistros;

	private ResultSetMetaData resmd;

}
