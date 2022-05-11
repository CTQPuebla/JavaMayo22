package com;

public class Pastel {
	//Estos son los atributos son cuestiones físicas propias del objeto 
	String color;
	String sabor;
	double alto, ancho;
	String cobertura;
	String forma;
	
 public Pastel() {  
		
	}
 
 public Pastel(String color) {
	   this.color = color;
		
	}

	public Pastel(String color, String sabor, double alto, double ancho, String cobertura,  String forma) {
		
		//Esto sale con clic derecho luego source, luego generate constructor fields 
		this.color = color;
		this.sabor = sabor;
		this.alto = alto;
		this.ancho = ancho;
		this.cobertura = cobertura;
		this.forma = forma;
	}
	public void setColor (String color) {
		this.color = color;          
		}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}
//al ultimo va el toString 
	@Override
	public String toString() {
		return "Pastel [color=" + color + ", sabor=" + sabor + ", alto=" + alto + ", ancho=" + ancho
				+ ", cobertura=" + cobertura + ", forma=" + forma + "]";
	}
	
	

}
