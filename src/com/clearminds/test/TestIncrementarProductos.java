package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		maquina.MostrarProducto();
		
		maquina.incrementarProductos("KE34", 8);
		
		System.out.println("------------LUEGO DEL INCREMENTO-------------");
		
		maquina.MostrarProducto();
		
	}
}
