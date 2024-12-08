package ejercicios;

import java.util.Scanner;

public class TiendaLibros {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Proporciona el nombre:");
		var nombre = consola.nextLine();
		System.out.println("Proporciona el id:");
		var id = consola.nextInt();
		System.out.println("Proporciona el precio:");
		var precio = consola.nextDouble();
		System.out.println("Proporciona el envio gratuito:");
		var envioGratuito = consola.nextBoolean();

		System.out.println(nombre + " #" + id);
		System.out.println("Precio: $" + precio);
		System.out.println("Envio Gratuito: " + envioGratuito);
		consola.close();
	}

}
