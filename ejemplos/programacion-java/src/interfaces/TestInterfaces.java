package interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		IAccesoDatos accesoDatos = new MySqlImpl();
		//accesoDatos.listar();
		imprimir(accesoDatos);
		
		accesoDatos = new OracleImpl();
		//accesoDatos.listar();
		imprimir(accesoDatos);
	}
	
	public static void imprimir(IAccesoDatos datos) {
		datos.listar();
	}

}
