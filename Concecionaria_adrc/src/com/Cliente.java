package com;

public class Cliente {

	String nombre;
	int autosAdquiridos;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, int autosAdquiridos) {
		super();
		this.nombre = nombre;
		this.autosAdquiridos = autosAdquiridos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAutosAdquiridos() {
		return autosAdquiridos;
	}

	public void setAutosAdquiridos(int autosAdquiridos) {
		this.autosAdquiridos = autosAdquiridos;
	}
	
	public void sumaAutosAdquiridos() {
		autosAdquiridos+=1;
	}

}
