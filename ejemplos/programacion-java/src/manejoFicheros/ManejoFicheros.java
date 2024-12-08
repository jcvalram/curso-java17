package manejoFicheros;

import java.io.*;

public class ManejoFicheros {
	
	public static void crearFichero(String nombreFichero) {
		// Creamos objeto con el nombre del fichero
		File fichero = new File(nombreFichero);
		
		try {
			PrintWriter salida = new PrintWriter(fichero);
			salida.close();
			System.out.println("Se ha creado el fichero");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void escribirFichero(String nombreFichero, String contenido) {
		File fichero = new File(nombreFichero);
		
		try {
			PrintWriter salida = new PrintWriter(fichero);
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito en el fichero");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void agregarContenido(String nombreFichero, String contenido) {
		File fichero = new File(nombreFichero);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(fichero, true));
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha agregado informacion en el fichero");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	public static void leerFichero(String nombreFichero) {
		var fichero = new File(nombreFichero);
		
		try {
			var entrada = new BufferedReader(new FileReader(fichero));
			var lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println("lectura = " + lectura);
				lectura = entrada.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

}
