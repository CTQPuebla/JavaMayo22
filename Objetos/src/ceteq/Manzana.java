package ceteq;

public class Manzana {
	
	String color;
	String tama�o;
	double precio;
	String origen;
	boolean isRecienCortada;
	
	public Manzana() {
	}
	
	public Manzana(String color, String tama�o, double precio) {
		this.color = color;
		this.tama�o = tama�o;
		this.precio = precio;
	}
	
	public Manzana(String color, String tama�o, double precio, boolean isRecienCortada) {
		this.color = color;
		this.tama�o = tama�o;
		this.precio = precio;
		this.isRecienCortada = isRecienCortada;
	}
	
	public Manzana(String color, String tama�o, double precio, String origen) {
		this.color = color;
		this.tama�o = tama�o;
		this.precio = precio;
		this.origen = origen;
	}

	public Manzana(String color, String tama�o, double precio, String origen, boolean isRecienCortada) {
		this.color = color;
		this.tama�o = tama�o;
		this.precio = precio;
		this.origen = origen;
		this.isRecienCortada = isRecienCortada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isRecienCortada() {
		return isRecienCortada;
	}

	public void setRecienCortada(boolean isRecienCortada) {
		this.isRecienCortada = isRecienCortada;
	}

	@Override
	public String toString() {
		return "Manzana [color=" + color + ", tama�o=" + tama�o + ", precio=" + precio + ", origen=" + origen
				+ ", isRecienCortada=" + isRecienCortada + "]";
	}

}
