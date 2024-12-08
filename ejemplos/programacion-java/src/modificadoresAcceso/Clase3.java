package modificadoresAcceso;

public class Clase3 {
	
	private String atributoPrivate = "Valor atributo private";
	
	// A�adimos constructor p�blico para poder crear el objeto
	// y llamar al constructor privado
	public Clase3(String arg) {
		this();
	}
	
	private Clase3() {
		System.out.println("Constructor private");
		System.out.println("atributoPrivate: " + this.atributoPrivate);
		metodoDefault();
	}

	private void metodoDefault() {
		System.out.println("M�todo private");
	}
}
