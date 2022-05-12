package ceteq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {
	private String nombre;
	private String numTelefono;
	private double presupuesto;
	private List<Auto> autosComprados = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String numTelefono, double presupuesto) {
		super();
		this.nombre = nombre;
		this.numTelefono = numTelefono;
		this.presupuesto = presupuesto;
	}

	public Cliente(String nombre, String numTelefono, double presupuesto, List<Auto> autosComprados) {
		this.nombre = nombre;
		this.numTelefono = numTelefono;
		this.presupuesto = presupuesto;
		this.autosComprados = autosComprados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public List<Auto> getAutosComprados() {
		return autosComprados;
	}

	public void setAutosComprados(List<Auto> autosComprados) {
		this.autosComprados = autosComprados;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numTelefono=" + numTelefono + ", presupuesto=" + presupuesto
				+ ", autosComprados=" + autosComprados + "]";
	}
	
	
}
