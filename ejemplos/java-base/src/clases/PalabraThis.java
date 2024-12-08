package clases;

public class PalabraThis {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", "Perez");
		System.out.println("Persona = " + empleado);
		System.out.println("Persona nombre = " + empleado.nombre);
		System.out.println("Persona apellido = " + empleado.apellido);
	}
}

class Empleado {
	String nombre;
	String apellido;
	
	Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Imprimir objeto usando this: " + this);
		new Imprimir().imprimir(this);
	}
}

class Imprimir {
	public void imprimir(Empleado empleado) {
		System.out.println("Persona desde imprimir: " + empleado);
		System.out.println("Imprimir objeto actual: " + this);
	}
}
