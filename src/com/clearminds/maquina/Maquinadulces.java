package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void configurarMaquina(String codigo1,String codigo2,String codigo3,String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
		
	}
	public void mostrarConfiguracion() {
		System.out.println("Celda 1:" + celda1.getCodigo());
		System.out.println("Celda 2:" + celda2.getCodigo());
		System.out.println("Celda 3:" + celda3.getCodigo());
		System.out.println("Celda 4:" + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if(celda1.getCodigo() == codigo) {
			return celda1;
		}else if(celda2.getCodigo() == codigo) {
			return celda2;
		}else if(celda3.getCodigo() == codigo) {
			return celda3;
		}else if(celda4.getCodigo() == codigo) {
			return celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto p1 ,String codigo, int stockA) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p1, stockA);
	}
	public void MostrarProducto() {
		System.out.println("--------------------------");
		if(celda1.getProducto() != null) {
			System.out.println("*****Celda: " + celda1.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre: " + celda1.getProducto().getNombre());	
			System.out.println("Precio: " + celda1.getProducto().getPrecio());
			System.out.println("--------------------------");
		}else {
			System.out.println("*****Celda: " + celda1.getCodigo());
			System.out.println("La celda no tiene producto");
			System.out.println("--------------------------");
		}
		if(celda2.getProducto() != null) {
			System.out.println("*****Celda: " + celda2.getCodigo());
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre: " + celda2.getProducto().getNombre());	
			System.out.println("Precio: " + celda2.getProducto().getPrecio());
			System.out.println("--------------------------");
		}else {
			System.out.println("*****Celda: " + celda2.getCodigo());
			System.out.println("La celda no tiene producto");
			System.out.println("--------------------------");
		}
		if(celda3.getProducto() != null) {
			System.out.println("*****Celda: " + celda3.getCodigo());
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre: " + celda3.getProducto().getNombre());	
			System.out.println("Precio: " + celda3.getProducto().getPrecio());
			System.out.println("--------------------------");
		}else {
			System.out.println("*****Celda: " + celda3.getCodigo());
			System.out.println("La celda no tiene producto");
			System.out.println("--------------------------");
		}
		if(celda4.getProducto() != null) {
			System.out.println("*****Celda: " + celda4.getCodigo());
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("Nombre: " + celda4.getProducto().getNombre());	
			System.out.println("Precio: " + celda4.getProducto().getPrecio());
			System.out.println("--------------------------");
		}else {
			System.out.println("*****Celda: " + celda4.getCodigo());
			System.out.println("La celda no tiene producto");
			System.out.println("--------------------------");
		}
		
		System.out.println("El saldo de la maquina es: " + saldo);
	}
	public Producto buscarProductoEnCelda(String codigo) {
		if(celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		}else if(celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		}else if(celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		}else if(celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		}else {
			return null;
		}
	}
	public double ConsultarPrecio(String codigo) {
		if(celda1.getCodigo() == codigo) {
			return celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo() == codigo) {
			return celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo() == codigo) {
			return celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo() == codigo) {
			return celda4.getProducto().getPrecio();
		}else {
			return 0;
		}
	}
	public Celda BuscarCeldaProducto(String codigo) {
		if(celda1.getProducto() != null) {
			if(celda1.getProducto().getCodigo() == codigo) {
				return celda1;
			}else {
				return null;
			}
		}else if(celda2.getProducto() != null) {
			if(celda2.getProducto().getCodigo() == codigo) {
				return celda2;
			}else {
				return null;
			}
		}else if(celda3.getProducto() != null) {
			if(celda3.getProducto().getCodigo() == codigo) {
				return celda3;
			}else {
				return null;
			}
		}else if(celda4.getProducto() != null) {
			if(celda4.getProducto().getCodigo() == codigo) {
				return celda4;
			}else {
				return null;
			}
		}else {
			return null;
		}
		
	}
	public void incrementarProductos(String codigo,int cantidad) {
		Celda celdaencontrada = BuscarCeldaProducto(codigo);
		int nuevo = celdaencontrada.getStock()+ cantidad;
		celdaencontrada.setStock(nuevo);		
	}
	public void vender(String codigo) {
		if(celda1.getCodigo() == codigo) {
			int nuevo = celda1.getStock() -1;
			celda1.setStock(nuevo);
			double precio = celda1.getProducto().getPrecio();
			saldo = saldo + precio; 
		}else if(celda2.getCodigo() == codigo) {
			int nuevo = celda2.getStock() -1;
			celda2.setStock(nuevo);
			double precio = celda2.getProducto().getPrecio();
			saldo = saldo + precio;
		}else if(celda3.getCodigo() == codigo) {
			int nuevo = celda3.getStock() -1;
			celda3.setStock(nuevo);
			double precio = celda3.getProducto().getPrecio();
			saldo = saldo + precio;
		}else if(celda4.getCodigo() == codigo) {
			int nuevo = celda4.getStock() -1;
			celda4.setStock(nuevo);
			double precio = celda4.getProducto().getPrecio();
			saldo = saldo + precio;
		}
		MostrarProducto();
	}
	public Double venderConCambio(String codigo, double valor) {
		if(celda1.getCodigo() == codigo) {
			int nuevo = celda1.getStock() -1;
			celda1.setStock(nuevo);
			saldo = saldo + celda1.getProducto().getPrecio();
			double vuelto = valor - celda1.getProducto().getPrecio();
			saldo = saldo-vuelto;
			return vuelto;
		}else if(celda2.getCodigo() == codigo) {
			int nuevo = celda2.getStock() -1;
			celda2.setStock(nuevo);
			saldo = saldo + celda2.getProducto().getPrecio();
			double vuelto = valor - celda2.getProducto().getPrecio();
			saldo = saldo-vuelto;
			return vuelto;
		}else if(celda3.getCodigo() == codigo) {
			int nuevo = celda3.getStock() -1;
			celda3.setStock(nuevo);
			saldo = saldo + celda3.getProducto().getPrecio();
			double vuelto = valor - celda3.getProducto().getPrecio();
			saldo = saldo-vuelto;
			return vuelto;
		}else if(celda4.getCodigo() == codigo) {
			int nuevo = celda4.getStock() -1;
			celda4.setStock(nuevo);
			saldo = saldo + celda4.getProducto().getPrecio();
			double vuelto = valor - celda4.getProducto().getPrecio();
			saldo = saldo-vuelto;
			return vuelto;
		}else {
			return 0.0;
		}
	}
	
	
}
