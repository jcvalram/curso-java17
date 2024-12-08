package matrices;

public class TestMatrices {

	public static void main(String[] args) {
		int edades[][] = new int[3][2];
		System.out.println("edades: " + edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		
//		System.out.println("edades 0-0: " + edades[0][0]);
//		System.out.println("edades 0-1: " + edades[0][1]);
//		System.out.println("edades 1-0: " + edades[1][0]);
//		System.out.println("edades 1-1: " + edades[1][1]);
		
		for(int f = 0; f < edades.length; f++) {
			for(int c = 0; c < edades[f].length; c++) {
				System.out.println("edades " + f + "-" + c + ": " + edades[f][c]);
			}
		}
		
		String frutas[][] = {{"Naranaja", "Limon"}, {"Fresa", "Mora", "Kiwi"}};
		imprimir(frutas);
		
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		personas[1][0] = new Persona("Paco");
		personas[1][1] = new Persona("Miguel");
		imprimir(personas);
	}
	
	public static void imprimir(Object matriz[][]) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.println("matriz " + fila + "-" + col + ": " + matriz[fila][col]);
			}
		}
	}
}
