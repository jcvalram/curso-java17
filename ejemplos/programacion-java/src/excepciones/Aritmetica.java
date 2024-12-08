package excepciones;

public class Aritmetica {
	
	/*
	 * Lanzamos una excepci�n de tipo Exception y por tanto el compilador
	 * obliga a propagar la excepci�n con 'throws'
	 */
	public static int division(int numerador, int denominador) 
			throws OperacionException {
		if (denominador == 0) {
			throw new OperacionException("Division entre cero");
		}
		return numerador / denominador;
	}
	
	/*
	 * Lanzamos una excepci�n de tipo RuntimeException y por tanto el compilador
	 * no obliga a propagar la excepci�n.
	 */
	public static int divisionRTE(int numerador, int denominador) {
		if (denominador == 0) {
			throw new OperacionRuntimeException("Division entre cero");
		}
		return numerador / denominador;
	}
}
