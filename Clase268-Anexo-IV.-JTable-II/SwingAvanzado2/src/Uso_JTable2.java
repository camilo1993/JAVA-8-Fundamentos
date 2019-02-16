import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Uso_JTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco = new MarcoTablaPersonalizado();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

		

	}

}

 
class MarcoTablaPersonalizado extends JFrame{
	
	public MarcoTablaPersonalizado() {

		setTitle("Tabla Personalizada");

		setBounds(300, 300, 400, 200);
		
		TableModel mimodelo=new ModeloTablaPersonalizada();
		
		JTable mitabla=new JTable(mimodelo);
		
		add(new JScrollPane(mitabla));

	
	
}
	
}


class ModeloTablaPersonalizada extends AbstractTableModel{

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}