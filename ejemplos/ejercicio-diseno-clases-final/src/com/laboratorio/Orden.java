package com.laboratorio;

public class Orden {
	
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 10;

	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			computadoras[this.contadorComputadoras++] = computadora;
		}
		else {
			System.out.println("Ha alcanzado el límite de computadoras" + Orden.MAX_COMPUTADORAS);
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #: " + this.idOrden);
		System.out.println("Computadoras de la orden: ");
		for (int c = 0; c < this.contadorComputadoras; c++) {
			System.out.println(this.computadoras[c]);
		}
	}
}
