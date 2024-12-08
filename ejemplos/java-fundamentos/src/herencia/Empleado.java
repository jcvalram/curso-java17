package herencia;

public class Empleado extends Persona {
	
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado() {
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}
	
	public Empleado(String nombre, double sueldo) {
		//super(nombre);
		this();  // Cuando se llama al constructor vacío de la propia clase, ya no
				 // se puede llamar al constructor vacío del padre.
		this.nombre = nombre;  // Atributo de la clase padre
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
