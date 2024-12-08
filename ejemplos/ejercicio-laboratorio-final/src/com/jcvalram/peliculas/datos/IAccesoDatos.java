package com.jcvalram.peliculas.datos;

import java.util.List;

import com.jcvalram.peliculas.domain.Pelicula;
import com.jcvalram.peliculas.excepciones.AccesoDatosException;
import com.jcvalram.peliculas.excepciones.EscrituraDatosException;
import com.jcvalram.peliculas.excepciones.LecturaDatosException;

public interface IAccesoDatos {
	
	boolean existe(String nombreArchivo);
	
	List<Pelicula> listar(String nombre) throws LecturaDatosException;
	
	void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosException;
	
	String buscar(String nombreArchivo, String buscar) throws LecturaDatosException;
	
	void crear(String nombreArchivo) throws AccesoDatosException;
	
	void borrar(String nombreArchivo);

}
