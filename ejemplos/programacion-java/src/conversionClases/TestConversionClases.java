package conversionClases;

public class TestConversionClases {

	public static void main(String[] args) {
		Empleado empleado;
		
		empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
		//System.out.println("empleado = " + empleado);

		System.out.println(empleado.obtenerDetalles());
		// Downcasting
		((Escritor) empleado).getTipoEscritura();  // 1º forma
		Escritor escritor = (Escritor) empleado;   // 2º forma
		escritor.getTipoEscritura();
		
		//Upcasting
		Empleado empleado2 = escritor;
		System.out.println(empleado2.obtenerDetalles());
	}

}
