package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());	
		//El error se dio en la linea 15 de la clase TestBuscarProductoNull
		//la variable que genera este error es prod, devido a que no contiene un producto almacenado
		//solo la variable maquina tiene almacenado la variable prodcuto con un nombre a llamr
	}
}
