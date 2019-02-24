
public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona Antonio = new Persona("Antonio");

		System.out.println(Antonio.getNombre());

		Empleado Ana = new Empleado("Ana", 35000);

		System.out.println(Ana.getNombre());

		System.out.println(Ana.getSalario());

		// System.out.println(Antonio.getClass());

		// Class cl1 = Antonio.getClass();

		// System.out.println(cl1.getName());

		
		
		String nombreClase = "instrospeccion.Empleado";

		try {
			Class cl1 = Class.forName(nombreClase);

			System.out.println(cl1.getName());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Persona {

	public Persona(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return nombre;

	}

	private String nombre;

}

class Empleado extends Persona {

	public Empleado(String nombre, double salario) {

		super(nombre);

		this.salario = salario;

	}

	public void setIncentivo(double incentivo) {

		salario = salario + incentivo;

	}

	public String getSalario() {

		return "EL salario es: " + salario;

	}

	private double salario;
}
