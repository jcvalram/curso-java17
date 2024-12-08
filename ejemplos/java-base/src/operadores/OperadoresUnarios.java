package operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		// Operador cambio signo
		var a = 3;
		var b = -a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Operador negaci�n
		var c = true;
		var d = !c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// Operador incremento
		// 1. preincremento (simbolo antes de la variable)
		var e = 3;
		var f = ++e; // Primero se incrementa la variable y despu�s se usa su valor. 
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		// 2. postincremento (simbolo despu�s de la variable)
		var g = 5;
		var h = g++; // Primero se usa el valor de la variable y despu�s se incrementa.
		System.out.println("g = " + g); //Ten�a pendiente un incremento
		System.out.println("h = " + h);
		
		// Operador decremento
		// 1. predecremento
		var i = 2;
		var j = --i;
		System.out.println("i = " + i); // Ya est� decementada
		System.out.println("j = " + j);
		
		// 2. postdecremento
		var k = 4;
		var l = k--; // Primero se usa el valor de la variable y queda pendiente el decremento
		System.out.println("k = " + k);
		System.out.println("l = " + l);
	}

}
