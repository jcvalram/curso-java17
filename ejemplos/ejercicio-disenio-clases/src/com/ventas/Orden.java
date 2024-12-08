package com.ventas;

public class Orden {
	
	private final int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[contadorProductos++] = producto;
		}
		else {
			System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int c = 0; c < this.contadorProductos; c++) {
			total += this.productos[c].getPrecio();
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Id orden: " + this.idOrden);
		System.out.println("Total de la orden: $" + this.calcularTotal());
		System.out.println("Productos de la orden:");
		for (int c = 0; c < this.contadorProductos; c++) {
			System.out.println(productos[c]); 
		}
	}

}
