
public class PasoPorValor {

	public static void main(String[] args) {
		var x = 10;
		System.out.println("x = " + x);
		// Invocaci�n del m�todo con la copia del valor de x
		cambioValor(x);
		// Despu�s de terminar la ejecuci�n del m�todo no afecta al valor
		// que tiene x
		System.out.println("x nuevo valor = " + x);
	}

	public static void cambioValor(int arg1) {
		System.out.println("arg1 = " + arg1);
		arg1 = 15; // Cambiamos el valor de arg1
	}
}
