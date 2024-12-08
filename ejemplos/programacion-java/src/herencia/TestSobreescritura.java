package herencia;

public class TestSobreescritura {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
		System.out.println("gerente: " + gerente1.obtenerDetalles());
	}
}
