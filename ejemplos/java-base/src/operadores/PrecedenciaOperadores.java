package operadores;

public class PrecedenciaOperadores {

	public static void main(String[] args) {
	/*
	 * Precedencia de operadores:
	 * Es el orden en el que se van evaluar los operadores
	 */
		var x = 5;
		var y = 10;
		var z = ++x + y--;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		var resultado = 4 + 5 * 6 / 3; // 4 + ((5*6) / 3)
		System.out.println("resultado = " + resultado);
		
		resultado = (4 + 5) * 6 / 3; // Modificando la prioridad de operadores
		System.out.println("resultado = " + resultado);
	}

}
