
public class Cadenas {

	public static void main(String[] args) {
		var usuario = "Juan";
		var titulo = "Ingeniero";
		var union = titulo + " " + usuario;
		System.out.println("union = " + union);
		
		var i = 3;
		var j = 4;
		
		// Las expresiones se evaluan de izq a der, veamos dos ejemplos:
		
		// Se realiza la suma num�rica y despu�s la concatenaci�n
		System.out.println(i + j + usuario);
		// Expresi�n Contexto Cadena, si primero encuentra una cadena, considera al resto 
		// cadena tambi�n
		System.out.println(usuario + i + j);
		// Modificamos la prioridad de evaluaci�n. Primero se eval�a la suma de enteros que est�n
		// entre par�ntesis y despu�s eval�a el resto de la expresi�n.
		System.out.println(usuario + (i + j));
	}

}
