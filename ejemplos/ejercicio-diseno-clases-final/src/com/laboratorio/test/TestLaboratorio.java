package com.laboratorio.test;

import com.laboratorio.*;

public class TestLaboratorio {

	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP", 13);
		Teclado teclado1 = new Teclado("Bluetooth", "HP");
		Raton raton1 = new Raton("Cable", "HP");
		Computadora computadoraHP = new Computadora("PC HP", monitorHP, teclado1, raton1);
		
		Monitor monitorGamer = new Monitor("Gamer", 34);
		Teclado teclado2 = new Teclado("Bluetooth", "Gamer");
		Raton raton2 = new Raton("Cable", "Gamer");
		Computadora computadoraGamer = new Computadora("PC Gamer", monitorGamer, teclado2, raton2);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		orden1.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarComputadora(computadoraGamer);
		orden2.mostrarOrden();
	}

}
