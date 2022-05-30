package com;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nombre;
	double credito;

	List<Auto> autos = new ArrayList<Auto>();

	public Cliente() {

	}

	public Cliente(String nombre, double credito) {
		this.nombre = nombre;
		this.credito = credito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", credito=" + credito + ", autos=" + autos + "]";
	}

}
