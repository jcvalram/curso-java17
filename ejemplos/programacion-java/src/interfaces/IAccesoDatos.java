package interfaces;

public interface IAccesoDatos {

	int MAX_REGISTRO = 10;
	
	void insertar();
	
	void listar();
	
	void actualizar();
	
	void eliminar();
}
