package sentenciasRepeticion;

public class SentenciaDoWhile {

	public static void main(String[] args) {
		var contador = 3;
		do {
			System.out.println("Contador = " + contador);
			contador++;
		} while(contador < 3); //Al menos para el contador = 0 se muestra por pantalla
	}
}
