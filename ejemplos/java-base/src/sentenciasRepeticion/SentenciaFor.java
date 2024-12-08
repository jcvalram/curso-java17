package sentenciasRepeticion;

public class SentenciaFor {

	public static void main(String[] args) {
		// Ejemplo 1
//		for(var contador = 0; contador < 3; contador++) {
//			System.out.println("Contador: " + contador);
//		}
		
		// Ejemplo 2 con 'break'
//		for(var contador = 0; contador < 3; contador++) {
//			if (contador % 2 == 0) {
//				System.out.println("Contador: " + contador);
//				break;
//			}
//		}
		
		//Ejemplo 3 con 'continue'
//		for(var contador = 0; contador < 3; contador++) {
//			if (contador % 2 != 0) {
//				continue; // Ir a la siguiente iteración
//			}
//			System.out.println("Contador: " + contador);
//		}
		
		//Ejemplo 4 con etiquetas (No es recomendable usarla)
		inicio: //etiqueta
		for(var contador = 0; contador < 3; contador++) {
			if (contador % 2 != 0) {
				continue inicio; // Ir a la linea de código de la etiqueta
			}
			System.out.println("Contador: " + contador);
		}
	}

}
