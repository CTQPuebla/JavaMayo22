package ceteq;

public class Celular {
	private String tipoPantalla;
	private String marca;
	private String modelo;
	private String color;
	private boolean tecladoFisico;
	private int capacidadBateria;
	private double peso;
	private double alto;
	private double ancho;
	private int memoria;
	
	public Celular() {
		
	}

	public Celular(String tipoPantalla, String marca, String modelo, String color, boolean tecladoFisico,
			int capacidadBateria, double peso, double alto, double ancho, int memoria) {
		this.tipoPantalla = tipoPantalla;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tecladoFisico = tecladoFisico;
		this.capacidadBateria = capacidadBateria;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.memoria = memoria;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTecladoFisico() {
		return tecladoFisico;
	}

	public void setTecladoFisico(boolean tecladoFisico) {
		this.tecladoFisico = tecladoFisico;
	}

	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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
	
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return "Celular [tipoPantalla=" + tipoPantalla + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", tecladoFisico=" + tecladoFisico + ", capacidadBateria=" + capacidadBateria + ", peso=" + peso
				+ ", alto=" + alto + ", ancho=" + ancho + ", memoria=" + memoria + "]";
	}

	public void llamar() {
		System.out.println("Llamando...");
	}
	
	public void finalizarLlamada() {
		System.out.println("Finalizando llamada...");
	}
	
	public void sms() {
		System.out.println("Mandando SMS...");
	}
	
}
