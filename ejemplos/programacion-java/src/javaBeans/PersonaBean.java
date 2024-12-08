package javaBeans;

import java.io.Serializable;

public class PersonaBean implements Serializable {
	
	private String nombre;
	private String apellidos;
	
	public PersonaBean() {
		
	}
	
	public PersonaBean(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonaBean [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append("]");
		return builder.toString();
	}
}
