package ejercicios;

import java.util.Scanner;

public class EjercicioTriangulo {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Proporciona el alto: ");
		var alto = consola.nextInt();
		System.out.println("Proporciona el ancho: ");
		var ancho = consola.nextInt();
		
		var area = alto * ancho;
		var perimetro = (alto + ancho) * 2;
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		consola.close();
	}

}
