package modificadoresAcceso.hijo;

import modificadoresAcceso.Clase1;

public class ClaseHija extends Clase1 {

	public ClaseHija() {
		super();
		this.atributoProtected = "Modificacion atributo protected";
		System.out.println("atributoProtegido: " + this.atributoProtected);
		this.metodoProtected();
	}
}
