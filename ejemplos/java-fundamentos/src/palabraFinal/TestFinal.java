package palabraFinal;

public class TestFinal {

	public static void main(String[] args) {
		final int miVariable = 10;
		System.out.println("miVariable: " + miVariable);
		//miVariable = 5; // Da error al intentar cambiar el valor
		System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
		
		final Persona persona1 = new Persona();
		//persona1 = new Persona(); // Marca error al intentar asignar una nueva referencia
		persona1.setNombre("Juan");
		System.out.println("persona1 nombre: " + persona1.getNombre());
		persona1.setNombre("Carlos");
		System.out.println("persona1 nombre: " + persona1.getNombre());
	}

}
