package bloquesInicializacion;

public class Persona {

	private final int idPersona;
	private static int contadorPersonas;
	
	// Inicializacion est�tico, se ejecuta antes del contructor la primera
	// vez que se carga en memoria esta clase
	static {
		System.out.println("Ejecuci�n bloque est�tico");
		++Persona.contadorPersonas;
		//idPersona = 10; Da error al no ser est�tico la variable
	}
	
	// Inicializaci�n No est�tico, se ejecuta antes del constructor cada vez que 
	// se crea un objeto de la clase
	{
		System.out.println("Ejecuci�n bloque NO est�tico");
		this.idPersona = Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecuci�n del constructor");
	}

	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}

}
