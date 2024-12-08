package herencia;

public class TestPolimorfismo {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 5000);
		//System.out.println("empleado: " + empleado.obtenerDetalles());
		imprimir(empleado);
		
		//Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
		//System.out.println("gerente: " + gerente.obtenerDetalles());
		//imprimir(gerente);
		empleado = new Gerente("Karla", 10000, "Contabilidad");
		imprimir(empleado);
	}
	
	/*
	 * Método donde se aplica polimorfismo con definiendo como argumento 
	 * un tipo de la clase padre Empleado.
	 * Y desde el main se puede pasar como argumento un objeto de la clase
	 * padre Empleado como de la clase hija Gerente.
	 */
	public static void imprimir(Empleado empleado) {
		System.out.println("empleado = " + empleado.obtenerDetalles());
	}

}
