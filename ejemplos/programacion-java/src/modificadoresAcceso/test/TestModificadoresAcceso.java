package modificadoresAcceso.test;

import modificadoresAcceso.Clase1;
import modificadoresAcceso.Clase3;
import modificadoresAcceso.hijo.ClaseHija;

public class TestModificadoresAcceso {

	public static void main(String[] args) {
		ejemploModificadorPublic();
		System.out.println(" --------------------- ");
		ejemploModificadorProtected();
		System.out.println(" --------------------- ");
		ejemploModificadorDefault();
		System.out.println(" --------------------- ");
		ejemploModificadorPrivate();
	}
	
	public static void ejemploModificadorPublic() {
		Clase1 clase = new Clase1("Publico");
		System.out.println("atributoPublico: " + clase.atributoPublico);
		clase.metodoPublico();
	}
	
	public static void ejemploModificadorProtected() {
		ClaseHija claseHija = new ClaseHija();
		System.out.println("claseHija: " + claseHija);	
	}
	
	public static void ejemploModificadorDefault() {
		Clase2 clase2 = new Clase2();
		clase2.atributoDefault = "Cambio prueba";
		System.out.println("atributoDefault: " + clase2.atributoDefault);
		clase2.metodoDefault();
	}
	
	public static void ejemploModificadorPrivate() {
		Clase3 clase3 = new Clase3("Saludo");
	}
}
