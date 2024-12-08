package javaBeans;

public class TestJavaBeans {

	public static void main(String[] args) {
		PersonaBean persona = new PersonaBean();
		persona.setNombre("Juan");
		persona.setApellidos("Perez");
		
		System.out.println("persona: " + persona);
		System.out.println("Persona nombre: " + persona.getNombre());
		System.out.println("Persona apellidos: " + persona.getApellidos());
	}

}
