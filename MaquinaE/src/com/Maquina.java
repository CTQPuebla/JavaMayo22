package com;

import java.util.Arrays;

public class Maquina {

	CatalogoProductos productos[];
	double dineroDis, cambio, dineroI;
	int cantidad;

	public Maquina() {

	}

	public Maquina(CatalogoProductos[] productos, double dineroDis, double cambio, double dineroI, int cantidad) {
		super();
		this.productos = productos;
		this.dineroDis = dineroDis;
		this.cambio = cambio;
		this.dineroI = dineroI;
		this.cantidad = cantidad;
	}

	public CatalogoProductos[] getProductos() {
		return productos;
	}

	public void setProductos(CatalogoProductos[] productos) {
		this.productos = productos;
	}

	public Double getDineroDis() {
		return dineroDis;
	}

	public void setDineroDis(double dineroDis) {
		this.dineroDis = dineroDis;
	}

	public Double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public Double getDineroI() {
		return dineroI;
	}

	public void setDineroI(double dineroI) {
		this.dineroI = dineroI;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Maquina [productos=" + Arrays.toString(productos) + ", dineroDis=" + dineroDis + ", cambio=" + cambio
				+ ", dineroI=" + dineroI + ", cantidad=" + cantidad + "]";
	}

	public void llenarM(CatalogoProductos p[]) {
		this.productos = p;
	}

	public void credito(double d) {
		this.dineroI += d;
	}

	public void validar(String codigoI) {
		for (int i = 0; i < productos.length; i++) {
			if (codigoI.equals(productos[i].getCodigo())) {
				if (this.getDineroI() < productos[i].getPrecio()) {
					System.out.println("Saldo insuficiente");
				} else {
					if (this.getDineroI() - productos[i].getPrecio() < this.getDineroDis()) {
						this.setCambio(this.getDineroI() - productos[i].getPrecio());
						System.out.println("Cambio: " + this.getCambio().toString());
					}
				}
				break;
			} else {
				if (i == productos.length - 1) {
					System.out.println("codigo incorrecto");
				}

			}

		}

	}
}
