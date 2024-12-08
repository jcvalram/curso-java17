package tiposPrimitivos;

public class TiposPrimitivosEnteros {

	public static void main(String[] args) {
		/*
		 * Tipos primitivos enteros: byte, short, int, long
		 */
		
		byte numeroByte = 10;
		System.out.println("Valor short: " + numeroByte);
		byte numeroByte2 = (byte) 129; // Convierte el número a byte pero pierde precisión
		System.out.println("Valor byte: " + numeroByte2);
		System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
		
		
		short numeroShort = 10;
		System.out.println("Valor short: " + numeroShort);
		short numeroShort2 = (short) 32768; // Convierte el número a short pero pierde precisión
		System.out.println("Valor short: " + numeroShort2);
		System.out.println("Valor minimo short: " + Short.MIN_VALUE);
		System.out.println("Valor maximo short: " + Short.MAX_VALUE);
		
		int numeroInt = 10;
		System.out.println("Valor short: " + numeroInt);
		// Aunque pongamos el cast int da error, hay que definirlo como el siguiente tipo superior, en este caso long (L)
		int numeroInt2 = (int) 2147483648L; // Pierde precisión
		System.out.println("Valor int: " + numeroInt2);
		System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
		System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
		
		long numeroLong = 10;
		System.out.println("Valor short: " + numeroLong);
		// Aunque pongamos el cast long da error, hay que definirlo como el siguiente tipo superior, en este caso double (D)
		long numeroLong2 = (long) 9223372036854775808D; // Pierde precisión
		System.out.println("Valor long: " + numeroLong2);
		System.out.println("Valor minimo long: " + Long.MIN_VALUE);
		System.out.println("Valor maximo long: " + Long.MAX_VALUE);
	}

}
