package operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		var resultado = (1 > 2) ? "verdadero" : "false";
		System.out.println("resultado = " + resultado);
		
		var numero = 9;
		resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
		System.out.println("resultado = " + resultado);
	}

}