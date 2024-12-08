package herencia;

import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 5000.0);
		System.out.println("empleado1 = " + empleado1);
		
		Date fecha = new Date();
		Cliente cliente1 = new Cliente("Karla", 'F', 28, "Calle Alcala 301", fecha, true);
		System.out.println("cliente1 = " + cliente1);
	}

}
