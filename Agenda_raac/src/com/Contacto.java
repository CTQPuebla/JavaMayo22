package com;

public class Contacto {
	String nombre, correo, numero;
	public Contacto() {
		
	}
	public Contacto(String nombre, String correo, String numero) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", numero=" + numero + "]";
	}
	
	
}
