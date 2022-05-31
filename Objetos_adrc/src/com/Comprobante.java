package com;
import java.util.Date;


public class Comprobante {
	
	String direccion, id;
	Date fechaOperacion;
	double saldoRestante;
	
	
	
	
	public Comprobante(String direccion, String id, Date fechaOperacion, double saldoRestante) {
		super();
		this.direccion = direccion;
		this.id = id;
		this.fechaOperacion = fechaOperacion;
		this.saldoRestante = saldoRestante;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public double getSaldoRestante() {
		return saldoRestante;
	}
	public void setSaldoRestante(double saldoRestante) {
		this.saldoRestante = saldoRestante;
	}
	
	
	
	
}
