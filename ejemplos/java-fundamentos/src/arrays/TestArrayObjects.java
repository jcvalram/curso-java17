package arrays;

public class TestArrayObjects {

	public static void main(String[] args) {
		Persona personas[] = new Persona[2]; // Con new crea un objeto de tipo Array de Persona
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Carlos");
		
		System.out.println("personas[0]: " + personas[0]);
		System.out.println("personas[1]: " + personas[1]);
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("personas " + i + " = " + personas[i]);
		}
	}

}
