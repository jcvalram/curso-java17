package operaciones;

public class Aritmetica {

	// Atributos de la clase
	int a;
	int b;
	
	// Constructor vacio
	public Aritmetica() {
		System.out.println("Ejecutando constructor");
	}
	
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con arg");
	}
	
	// Metodos de la clase
	public void sumar() {
		int resultado = a + b;
		System.out.println("Suma: " + resultado);
	}
	
	public int sumarConRetorno() {
		return a + b;
	}
	
	public int sumarConArgumentos(int a, int b) {
		this.a = a; //El argumento a se asigna al atributo this.a
		this.b = b;
		return this.sumarConRetorno();
	}

}
