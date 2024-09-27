package ceteq;

public class Auto {
	private String identificador;
	private String modelo;
	private String marca;
	private double precio;
	
	public Auto() {
		
	}

	public Auto(String identificador, String modelo, String marca, double precio) {
		this.identificador = identificador;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [identificador=" + identificador + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio
				+ "]";
	}
	
	
}
