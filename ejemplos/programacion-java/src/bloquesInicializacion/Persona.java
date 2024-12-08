package bloquesInicializacion;

public class Persona {

	private final int idPersona;
	private static int contadorPersonas;
	
	// Inicializacion estático, se ejecuta antes del contructor la primera
	// vez que se carga en memoria esta clase
	static {
		System.out.println("Ejecución bloque estático");
		++Persona.contadorPersonas;
		//idPersona = 10; Da error al no ser estático la variable
	}
	
	// Inicialización No estático, se ejecuta antes del constructor cada vez que 
	// se crea un objeto de la clase
	{
		System.out.println("Ejecución bloque NO estático");
		this.idPersona = Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecución del constructor");
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
