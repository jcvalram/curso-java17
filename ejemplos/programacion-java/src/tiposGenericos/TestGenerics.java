package tiposGenericos;

public class TestGenerics {

	public static void main(String[] args) {
		ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
		objetoInt.obtenerTipo();
		
		ClaseGenerica<String> objetoStr = new ClaseGenerica("Hola");
		objetoStr.obtenerTipo();
	}

}
