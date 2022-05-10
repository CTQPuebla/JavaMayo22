package ceteq;

import java.util.Arrays;

public class Maquina {
	private String modelo;
	private String ubicacion;
	private int totalProductos;
	private double dineroAcumulado;
	private double dineroTotalMaquina;
	private double cambio;
	private Producto[] productos;
	
	public Maquina() {
		
	}

	public Maquina(String modelo, String ubicacion, int totalProductos, double dineroAcumulado, double dineroTotalMaquina, double cambio, Producto[] productos) {
		super();
		this.modelo = modelo;
		this.ubicacion = ubicacion;
		this.totalProductos = totalProductos;
		this.dineroAcumulado = dineroAcumulado;
		this.dineroTotalMaquina = dineroTotalMaquina;
		this.cambio = cambio;
		this.productos = productos;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getTotalProductos() {
		return totalProductos;
	}

	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}

	public double getDineroAcumulado() {
		return dineroAcumulado;
	}

	public void setDineroAcumulado(double dineroAcumulado) {
		this.dineroAcumulado = dineroAcumulado;
	}

	public double getDineroTotalMaquina() {
		return dineroTotalMaquina;
	}

	public void setDineroTotalMaquina(double dineroTotalMaquina) {
		this.dineroTotalMaquina = dineroTotalMaquina;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "Maquina [modelo=" + modelo + ", ubicacion=" + ubicacion + ", totalProductos=" + totalProductos
				+ ", dineroAcumulado=" + dineroAcumulado + ", dineroTotalMaquina=" + dineroTotalMaquina + ", cambio="
				+ cambio + ", productos=" + Arrays.toString(productos) + "]";
	}

	public void llenarMaquina(Producto productos[]) {
		this.productos = productos;
		System.out.println(Arrays.deepToString(productos));
	}
	
	public void ingresarDinero(double dinero) {
		this.dineroAcumulado += dinero;
	}
	
	public void escogerProducto(String codigo) {
		for (int i = 0; i < this.productos.length; i++) {
			if (codigo.equals(this.productos[i].getCodigo())) {
				if (!((this.dineroAcumulado - this.productos[i].getPrecio()) >= this.getDineroTotalMaquina())) {
					if (this.dineroAcumulado >= this.productos[i].getPrecio()) {
						this.cambio = this.dineroAcumulado - this.productos[i].getPrecio();
						System.out.println("Producto entregado: " + this.productos[i].getNombre() + ", código: " + this.productos[i].getCodigo() + ", precio: " + this.productos[i].getPrecio());
						System.out.println("Su cambio fue de: " + this.cambio);
					} else {
						System.out.println("Dinero insuficiente");
					}
				} else {
					System.out.println("El cambio sobre pasa el dinero en la maquina");
				}
				break;
			} else {
				System.out.println("No se encontró el código del producto");
			}
		}
	}
	
	
}
