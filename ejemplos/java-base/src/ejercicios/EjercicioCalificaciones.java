package ejercicios;

import java.util.Scanner;

public class EjercicioCalificaciones {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Proporciona un valor entre 0 y 10");
		var valor = consola.nextDouble();
		var nota = "Desconocido";
		
		if (valor >= 9 && valor <= 10) {
			nota = "A";
		}
		else if (valor >= 8 && valor < 9) {
			nota = "B";
		}
		else if (valor >= 7 && valor < 8) {
			nota = "C";
		}
		else if (valor >= 6 && valor < 7) {
			nota = "D";
		}
		else if (valor >= 0 && valor < 6) {
			nota = "F";
		}
		
		System.out.println("Nota = " + nota);
		consola.close();
	}
}
