package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDORES")
public class Proveedor {

	public Proveedor() {
	}

	public Proveedor(int Id) {
		this.proveedorId = Id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="provid_auto")
	@SequenceGenerator(name="provid_auto", sequenceName="PROVEEDOR_ID_SEQ")
	@Column(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	private int proveedorId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	private String nombre;
	
	@Column(name="RFC", columnDefinition="NVARCHAR2(100)")
	private String rfc;
	
	@Column(name="NUM_CUENTA", columnDefinition="NVARCHAR2(100)")
	private String numCuenta;
	
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2(100)")
	private String telefono;

	public int getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Proveedor [proveedorId=" + proveedorId + ", nombre=" + nombre + ", rfc=" + rfc + ", numCuenta="
				+ numCuenta + ", telefono=" + telefono + "]";
	}
}
