
public class Cadenas {

	public static void main(String[] args) {
		var usuario = "Juan";
		var titulo = "Ingeniero";
		var union = titulo + " " + usuario;
		System.out.println("union = " + union);
		
		var i = 3;
		var j = 4;
		
		// Las expresiones se evaluan de izq a der, veamos dos ejemplos:
		
		// Se realiza la suma numérica y después la concatenación
		System.out.println(i + j + usuario);
		// Expresión Contexto Cadena, si primero encuentra una cadena, considera al resto 
		// cadena también
		System.out.println(usuario + i + j);
		// Modificamos la prioridad de evaluación. Primero se evalúa la suma de enteros que están
		// entre paréntesis y después evalúa el resto de la expresión.
		System.out.println(usuario + (i + j));
	}

}
