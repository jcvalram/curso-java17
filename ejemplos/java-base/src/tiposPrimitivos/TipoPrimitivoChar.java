package tiposPrimitivos;

public class TipoPrimitivoChar {

	public static void main(String[] args) {
		
		// El tipo char ocupa 16 bits
		
		char miCaracter = 'a';
		System.out.println("miCaracter = " + miCaracter);
		
		char varChar = '\u0021';  // Asignamos un valor con c�digo UNICODE
		System.out.println("varChar = " + varChar);
		
		char varCharDecimal = 33; // Asignaos un valor con c�digo decimal
		System.out.println("varCharDecimal = " + varCharDecimal);
		
		char charSimbolo = '!';
		System.out.println("charSimbolo = " + charSimbolo);
		
		// Infernecia de tipos
		
		var varChar2 = '\u0021';  // Asignamos un char con c�digo UNICODE
		System.out.println("varChar2 = " + varChar2);
		
		var varCharDecimal2 = 33; // En este caso asigna a un int y no un char
		System.out.println("varCharDecimal2 = " + varCharDecimal2);
		
		var charSimbolo2 = '!'; // Asigna char con el s�mbolo
		System.out.println("charSimbolo2 = " + charSimbolo2);
		
		int variableEnteraSimbolo = '!'; // Convierte a su c�digo decimal del caracter.
		System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
		
		int letra = 'a';
		System.out.println("letra = " + letra);
	}

}
