package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int a=3, b=2;
		var resultado = a + b;
		System.out.println("Resultado suma: " + resultado);
		
		resultado = a - b;
		System.out.println("Resultado resta: " + resultado);
		
		resultado = a * b;
		System.out.println("Resultado multiplicacion: " + resultado);
		
		var resultado2 = 3.0 / b;
		System.out.println("Resultado division: " + resultado2);
		
		resultado = a % b;
		System.out.println("Resultado modulo: " + resultado);
		
		// Comprobar número par o impar
		if (a % 2 == 0)
			System.out.println("Es numero par");
		else 
			System.out.println("Es numero impar");
	}

}
