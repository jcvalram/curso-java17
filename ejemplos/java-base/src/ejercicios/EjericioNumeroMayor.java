package ejercicios;

import java.util.Scanner;

public class EjericioNumeroMayor {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Proporciona el numero1:");
		var num1 = consola.nextInt();
		System.out.println("Proporciona el numero2:");
		var num2 = consola.nextInt();
		var resultado = num1 > num2 ? num1 : num2;
		System.out.println("El numero mayor es: " + resultado);
		consola.close();
	}

}
