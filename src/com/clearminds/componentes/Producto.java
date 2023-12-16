package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	
	public Producto(String codigo,String nombre,double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	public void incrementarPrecio(int inc){
		double aum = this.precio * (inc*0.01);
		this.precio = this.precio + aum;
	}
	public void disminuirPrecio(double des){
		this.precio = this.precio - des;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
