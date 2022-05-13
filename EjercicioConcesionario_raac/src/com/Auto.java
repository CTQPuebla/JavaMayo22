package com;

public class Auto {
	String modelo;
	String a�o;
	double precio;
	
	public Auto() {
		
	}

	public Auto(String modelo, String a�o, double precio) {
		super();
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", a�o=" + a�o + ", precio=" + precio + "]";
	}
	
	
}
