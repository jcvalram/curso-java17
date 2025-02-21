package com.jcvalram.peliculas.domain;

public class Pelicula {
	
	private String nombre;
	
	public Pelicula() {	
	}
	
	public Pelicula(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
}
