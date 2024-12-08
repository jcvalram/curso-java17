package arrays;

public class TestArrays {

	public static void main(String[] args) {
		int edades[] = new int[3]; // Con new crea un objeto de tipo Array de int
		System.out.println("edades = " + edades); // Imprime la direcci�n de memoria de la variable
		
		edades[0] = 10;
		System.out.println("edades[0] = " + edades[0]);
		edades[1] = 8;
		System.out.println("edades[1] = " + edades[1]);
		edades[2] = 5;
		System.out.println("edades[2] = " + edades[2]);
		
		//edades[3] = 5; //Error en tiempo de ejecuci�n, al intentar asignar un valor
		               //en una posici�n del array fuera de rango.
		
		for (var cont = 0; cont < edades.length; cont++) {
			System.out.println("edades elemento: " + cont + ", valor: " + edades[cont]);
		}
		
		String[] frutas = {"Naranja", "Platano", "Uva"};
		for(int i = 0; i < frutas.length; i++) {
			System.out.println("frutas = " + frutas[i]);
		}
	}

}
