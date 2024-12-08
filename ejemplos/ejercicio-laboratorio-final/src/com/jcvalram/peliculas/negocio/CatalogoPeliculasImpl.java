package com.jcvalram.peliculas.negocio;

import java.util.List;

import com.jcvalram.peliculas.datos.AccesoDatosImpl;
import com.jcvalram.peliculas.datos.IAccesoDatos;
import com.jcvalram.peliculas.domain.Pelicula;
import com.jcvalram.peliculas.excepciones.AccesoDatosException;
import com.jcvalram.peliculas.excepciones.EscrituraDatosException;
import com.jcvalram.peliculas.excepciones.LecturaDatosException;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
	
	public CatalogoPeliculasImpl() {
	}

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		IAccesoDatos datos = new AccesoDatosImpl();
		if (datos.existe(nombreArchivo)) {
			try {
				datos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);
			} catch (EscrituraDatosException e) {
				System.out.println("Ocurrió un error: " + e.getMessage());
			}
			System.out.println("\n Se ha escrito correctamente en el archivo");
		}
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		IAccesoDatos datos = new AccesoDatosImpl();
		if (datos.existe(nombreArchivo)) {
			List<Pelicula> peliculas;
			try {
				peliculas = datos.listar(nombreArchivo);
				System.out.println("Peliculas: \n");
				peliculas.forEach(peli -> System.out.println(peli.getNombre()));
			} catch (LecturaDatosException e) {
				System.out.println("Ocurrió un error: " + e.getMessage());
			}	
		}
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		IAccesoDatos datos = new AccesoDatosImpl();
		if (datos.existe(nombreArchivo)) {
			String pelicula;
			try {
				pelicula = datos.buscar(nombreArchivo, buscar);
				if (pelicula != null) {
					System.out.println("Se ha encontrado la pelicula: " + pelicula);
				}
				else {
					System.out.println("No se encontró la pelicula");
				}
			} catch (LecturaDatosException e) {
				System.out.println("Ocurrió un error: " + e.getMessage());
			}
		}
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		IAccesoDatos datos = new AccesoDatosImpl();
		try {
			datos.crear(nombreArchivo);
			System.out.println("\n Archivo creado: " + nombreArchivo);
		} catch (AccesoDatosException e) {
			System.out.println("Ocurrió un error: " + e.getMessage());
		}	
	}
}
