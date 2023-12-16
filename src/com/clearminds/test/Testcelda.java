package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class Testcelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Código Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
	//el error NullPointerException se genera en la linea 8 de la clase Testcelda
	//El error se genera al momento de invocar al atributo producto de la variable celda, mismo que se encuentra en null
	
}
