package herencia;

public class Gerente extends Empleado {
	
	private String departamento;
	
	public Gerente(String nombre, double sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}
	
	/*
	 * Sobreescritura del método de la clase padre con otro tipo de modificador
	 * de acceso, en este caso menos restrictivo que en la clase padre.
	 */
	@Override
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", departamento: " + this.departamento;
	}
}
