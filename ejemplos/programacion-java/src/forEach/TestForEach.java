package forEach;

public class TestForEach {

	public static void main(String[] args) {
		int edades[] = {5, 6, 7, 8};
		for (int edad : edades) {
			System.out.println("edad: " + edad);
		}
		
		Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustn")};
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
