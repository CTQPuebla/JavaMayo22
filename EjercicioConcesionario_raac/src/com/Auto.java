package com;

public class Auto {
	String modelo;
	String año;
	double precio;
	
	public Auto() {
		
	}

	public Auto(String modelo, String año, double precio) {
		super();
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", año=" + año + ", precio=" + precio + "]";
	}
	
	
}
