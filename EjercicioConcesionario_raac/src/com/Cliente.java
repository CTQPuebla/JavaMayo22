package com;

public class Cliente {
	
	String nombre;
	String numeroTel;
	double dineroDis;
	int autos;
	
	public Cliente() {
		
	}
	
	public Cliente( Double dineroDis, int autos) {
		super();
		this.dineroDis = dineroDis;
		this.autos = autos;
	}
    

	public Cliente(String nombre, String numeroTel, Double dineroDis, int autos) {
		super();
		this.nombre = nombre;
		this.numeroTel = numeroTel;
		this.dineroDis = dineroDis;
		this.autos = autos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Double getDineroDis() {
		return dineroDis;
	}

	public void setDineroDis(Double dineroDis) {
		this.dineroDis = dineroDis;
	}

	public int getAutos() {
		return autos;
	}

	public void setAutos(int autos) {
		this.autos = autos;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroTel=" + numeroTel + ", dineroDis=" + dineroDis + ", autos="
				+ autos + "]";
	}

	

	
	
	

}
