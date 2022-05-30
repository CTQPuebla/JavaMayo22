package com.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		   generator = ObjectIdGenerators.IntSequenceGenerator.class,
		   property = "@proveedorId")

@Entity
@Table(name="PROVEEDOR")
public class Proveedor {
	
	public Proveedor() {}
	public Proveedor(int id) {
		this.proveedorId=id;
	}
	
	@OneToMany(mappedBy="proveedor")
	List<Producto> list;
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@Column (name="PROVEEDOR_ID", columnDefinition="NUMBER")
	private int proveedorId;
	
	@Column(name="NOBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="RFC", columnDefinition="NVARCHAR2(13)")
	private String rfc;
	@Column(name="NUMERO_CUENTA", columnDefinition="NUMBER")
	private long numeroCuenta;
	@Column(name="TELEFONO", columnDefinition="NUMBER")
	private long telefono;
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
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public List<Producto> getList() {
		return list;
	}
	public void setList(List<Producto> list) {
		this.list = list;
	}
	
	
	
}
