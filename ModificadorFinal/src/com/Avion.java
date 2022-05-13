package com;

public final class Avion {
	
	
	final static String COMBUSTIBLE="TURBOSINA";
	
	private String marca;
	private String modelo;
	
	public Avion() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static String getCombustible() {
		return COMBUSTIBLE;
	}
	
	
	public final void aterrizar() {
		System.out.println("aterrizando...");
	}
	

}
