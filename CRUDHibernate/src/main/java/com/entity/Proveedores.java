package com.entity;

import java.util.List;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDORES")
public class Proveedores {

	public Proveedores() {}
	public Proveedores(int id) {
		this.proveedorId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="PROVEEDORES_SEQ")
	@Column(name="PROVEEDOR_ID" , columnDefinition="NUMBER")
	int proveedorId;
	
	@Column(name="NOMBRE" , columnDefinition="NVARCHAR2(30 CHAR)")
	String nombre;
	@Column(name="RFC" , columnDefinition="NVARCHAR2(7 CHAR)")
	String rfc;
	@Column(name="NUM_CUENTA" , columnDefinition="NUMBER")
	String numCuenta;
	@Column(name="TELEFONO" , columnDefinition="NUMBER")
	String telefono;
	
	@OneToMany(mappedBy="proveedores")
	List<Productos> list;
	//Getters & Setters

	
	
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
	public List<Productos> getList() {
		return list;
	}
	public void setList(List<Productos> list) {
		this.list = list;
	}

	
	
}