package com.jcvalram.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.jcvalram.peliculas.domain.Pelicula;
import com.jcvalram.peliculas.excepciones.AccesoDatosException;
import com.jcvalram.peliculas.excepciones.EscrituraDatosException;
import com.jcvalram.peliculas.excepciones.LecturaDatosException;

public class AccesoDatosImpl implements IAccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) {
		try {
			return new File(nombreArchivo).exists();
		}
		catch(Exception e) {
			e.printStackTrace(System.out);
			return false;
		}
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException {
		List<Pelicula> peliculaList = new ArrayList<>();
		File archivo = new File(nombreArchivo);
		
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var linea = "";
			while (linea != null) {
				linea = entrada.readLine();
				if (linea != null) {
					peliculaList.add(new Pelicula(linea));
				}
			}
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			throw new LecturaDatosException("Excepción al listar peliculas");
		}
		return peliculaList;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosException {
		File archivo = new File(nombreArchivo);
		
		try {
			var salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.getNombre());
			salida.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			throw new EscrituraDatosException("Excepción al agregar pelicula al archivo");
		}
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosException {
		File archivo = new File(nombreArchivo);
		String encontrado = null;
		
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var linea = "";
			while (linea != null && encontrado == null) {
				linea = entrada.readLine();
				if (linea != null && linea.contains(buscar)) {
					encontrado = linea;
				}	
			}
			entrada.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			throw new LecturaDatosException("No se pudo leer el archivo");
		}
		return encontrado;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosException {
		File archivo = new File(nombreArchivo);
		PrintWriter salida;
		try {
			salida = new PrintWriter(archivo);
			salida.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			throw new AccesoDatosException("No se pudo crear el archivo");
		}
	}

	@Override
	public void borrar(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		archivo.delete();
		System.out.println("\n Archivo borrado");
	}
}
