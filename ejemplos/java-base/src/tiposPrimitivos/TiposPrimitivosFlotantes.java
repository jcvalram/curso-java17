package tiposPrimitivos;

public class TiposPrimitivosFlotantes {

	public static void main(String args[]) {
		// Tipos primitivos flotantes: float y double
		
		float numeroFloat = (float) 10.0;
		System.out.println("Valor float: " + numeroFloat);
		float numeroFloat2 = 10.0F; // Con el liteal F indicamos que es un valor Float.
		System.out.println("Valor float2: " + numeroFloat2);
		float numeroFloat3 = (float) 3.4028236E38D; // Pierde precisión
		System.out.println("Valor float3: " + numeroFloat3);
		System.out.println("Valor minimo float: " + Float.MIN_VALUE);
		System.out.println("Valor maximo float: " + Float.MAX_VALUE);
		
		double numeroDouble = 10;
		System.out.println("Valor double: " + numeroDouble);
		double numeroDouble2 =  1.7976931348623157E308;
		System.out.println("Valor double: " + numeroDouble2);
		System.out.println("Valor minimo double: " + Double.MIN_VALUE);
		System.out.println("Valor maximo double: " + Double.MAX_VALUE);
	}
}
