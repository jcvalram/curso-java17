package excepciones;

public class TestExcepciones {

	public static void main(String[] args) {
		ejemploException();
		//ejemploRuntimeException();
	}
	
	public static void ejemploException() {
		int resultado = 0;
		try {
			resultado = Aritmetica.division(10, 0);
		} catch(OperacionException oe) {
			System.out.println("Ocurrió un error de tipo OperacionExcception");
		} catch(Exception e) {
			System.out.println("Ocurrio un error de tipo Exception:");
			//e.printStackTrace(System.out);
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Se revisó la división entre cero");
		}
		System.out.println("resultado: " + resultado);
	}
	
	public static void ejemploRuntimeException() {
		int resultado = 0;
		resultado = Aritmetica.divisionRTE(10, 0);
		System.out.println("resultado: " + resultado);
	}
}
