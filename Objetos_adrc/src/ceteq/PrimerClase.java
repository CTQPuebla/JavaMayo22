package ceteq;

public class PrimerClase {
	//Anatomina de las clases POJO
	//Atributos
	//Constructores
	//Getters and Setters
	//toString
	
	String color;
	String material;
	double alto, ancho, profundidad;
	String forma;
	
	public PrimerClase() {
	}
	
	public PrimerClase(String color) {
		this.color = color;
	}

	public PrimerClase(String color, String material, double alto, double ancho, double profundidad, String forma) {
		this.color = color;
		this.material = material;
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "PrimerClase [color=" + color + ", material=" + material + ", alto=" + alto + ", ancho=" + ancho
				+ ", profundidad=" + profundidad + ", forma=" + forma + "]";
	}
	
}
