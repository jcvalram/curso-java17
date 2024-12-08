package collections;

import java.util.*;

public class TestCollections {

	public static void main(String[] args) {
		//ejemploList();
		//ejemploSet();
		ejemploMap();
	}
	
	/*
	 * Mantiene el orden en el que se añaden los elementos y permite introducir
	 * elementos repetidos
	 */
	public static void ejemploList() {
		List miLista = new ArrayList();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Miercoles");

		// Recorrido for each
//		for (Object object : miLista) {
//			System.out.println(object);
//		}
		imprimir(miLista);
	}
	
	/*
	 * No mantiene el orden al añadir elementos y no permite introducir
	 * elementos duplicados
	 */
	public static void ejemploSet() {
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Viernes");
		
		imprimir(miSet);
	}
	
	/*
	 * Añade un valor "v" en la key "k", y si se añade un valor en una key
	 * ya existente, lo sustituye por el nuevo valor para esa key
	 */
	public static void ejemploMap() {
		Map miMapa = new HashMap();
		miMapa.put("valor1", "Juan");
		miMapa.put("valor2", "Karla");
		miMapa.put("valor3", "Miguel");
		miMapa.put("valor3", "Carlos");
		
		Object elemento = miMapa.get("valor1");
		System.out.println("elemento = " + elemento);
		
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
	}
	
	/*
	 * Pasamos como argumento un objeto de la clase Collection
	 * ya que es la clase padre de List y Set
	 */
	public static void imprimir(Collection collection) {
		// Recorrido for each con lambdas
		collection.forEach(elemento -> System.out.println(elemento));
	}

}
