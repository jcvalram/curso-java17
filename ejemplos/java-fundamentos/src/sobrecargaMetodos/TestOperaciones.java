package sobrecargaMetodos;

public class TestOperaciones {

	public static void main(String[] args) {
		var resultado1 = Operaciones.sumar(5, 3);
		System.out.println("resultado1 = " + resultado1);
		
		var resultado2 = Operaciones.sumar(2.0, 3.0);
		System.out.println("resultado2 = " + resultado2);

		var resultado3 = Operaciones.sumar(3, 4L);   // Pasando un int y un long, ejecutaría el método double
		System.out.println("resultado3 = " + resultado3);
	}

}
