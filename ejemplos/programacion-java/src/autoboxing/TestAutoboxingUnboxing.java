package autoboxing;

public class TestAutoboxingUnboxing {
	
	public static void main(String args[]) {
		// Clases envolventes
		/*
		 - int -> Integer
		 - long -> Long
		 - float -> Float
		 - double -> Double
		 - byte -> Byte
		 - char -> Character
		 - short -> Short
		*/
		
		// Autoboxing (Envuelve el tipo primitivo en un object)
		Integer entero = 10;
		System.out.println("entero: " + entero);
		
		// Unboxing (Desenvuelve un objeto a tipo primitivo)
		int entero2 = entero;
		System.out.println("entero2: " + entero2);
	}
}
