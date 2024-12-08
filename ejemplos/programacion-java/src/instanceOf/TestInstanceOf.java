package instanceOf;

public class TestInstanceOf {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 5000);
		determinarTipo(empleado);
		empleado = new Gerente("Karla", 10000, "Contabilidad");
		//determinarTipo(empleado);
	}
	
	public static void determinarTipo(Empleado empleado) {
		// Comprueba si la variable empleado est� apuntando en memoria
		// a un tipo de clase Gerente
		if (empleado instanceof Gerente) {
			System.out.println("Es de tipo gerente");
			Gerente gerente = (Gerente) empleado; // 1� forma de conversion
			System.out.println("Gerente.departamento: " + gerente.getDepartamento());
			((Gerente) empleado).getDepartamento(); //2� forma de conversion
		}
		else if (empleado instanceof Empleado) {
			System.out.println("Es de tipo empleado");
			// Aqu� se provoca un error en tiempo de ejecuci�n
			//Gerente gerente = (Gerente) empleado; 
			//System.out.println("Gerente.departamento: " + gerente.getDepartamento());
			System.out.println("Empleado.nombre: " + empleado.getNombre());
		}
		else if (empleado instanceof Object) {
			System.out.println("Es de tipo object");
		}
	}

}
