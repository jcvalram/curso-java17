package cpjlaboratoriofinal;

import java.util.Scanner;

import com.jcvalram.peliculas.negocio.CatalogoPeliculas;
import com.jcvalram.peliculas.negocio.CatalogoPeliculasImpl;

public class Main {

	static CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
	static Scanner consola;
	final static String NOMBRE_FICHERO = "C:\\Users\\janva\\Desktop\\DesarrolloIT\\Cursos\\Udemy\\Universidad_Java2021\\prueba.txt";
	
	public static void main(String[] args) {
		String opcion;
		do {
			opcion = mostrarMenu();
			switch(opcion) {
				case "1":
					catalogo.iniciarArchivo(NOMBRE_FICHERO);
					break;
				case "2":
					agregarPelicula();
					break;
				case "3":
					catalogo.listarPeliculas(NOMBRE_FICHERO);
					break;
				case "4":
					buscarPelicula();
					break;
				case "0":
					System.out.println("Fin del menú");
					break;
				default:
					System.out.println("!Opción incorrecta!");
			}
		} while(!opcion.equals("0"));
	}
	
	public static String mostrarMenu() {
		consola = new Scanner(System.in);
		System.out.println("\n-------  MENU PELICULAS --------");
		System.out.println("Elige una opción: ");
		System.out.println("1.- Iniciar catalogo peliculas");
		System.out.println("2.- Agregar pelicula");
		System.out.println("3.- Listar peliculas");
		System.out.println("4.- Buscar pelicula");
		System.out.println("0.- Salir \n");
		return consola.nextLine();
	}
	
	public static void agregarPelicula() {
		consola = new Scanner(System.in);
		System.out.println("\n Introduce el nombre de la pelicula a agregar: ");
		var pelicula = consola.nextLine();
		catalogo.agregarPelicula(pelicula, NOMBRE_FICHERO);
	}
	
	public static void buscarPelicula() {
		consola = new Scanner(System.in);
		System.out.println("Introduce busqueda: ");
		var buscar = consola.nextLine();
		catalogo.buscarPelicula(NOMBRE_FICHERO, buscar);
	}

}
