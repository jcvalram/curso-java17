
public class PasoPorValor {

	public static void main(String[] args) {
		var x = 10;
		System.out.println("x = " + x);
		// Invocación del método con la copia del valor de x
		cambioValor(x);
		// Después de terminar la ejecución del método no afecta al valor
		// que tiene x
		System.out.println("x nuevo valor = " + x);
	}

	public static void cambioValor(int arg1) {
		System.out.println("arg1 = " + arg1);
		arg1 = 15; // Cambiamos el valor de arg1
	}
}
