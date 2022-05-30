package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos {

public Productos() {
		
	}
	public Productos(int id) {
		this.productoId = id;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTO_ID_SEQ")
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	int productoId;
	
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID",columnDefinition="NUMBER")
	private Categoria categoria;
	@Column(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	int proveedorId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(25)")
	String nombre;
	@Column(name="PRESENTACION", columnDefinition="NVARCHAR2(50)")
	String  presentacion;
	@Column(name="PRECIO", columnDefinition="NUMBER")
	int precio;
	
	@OneToOne(mappedBy="producto")
	Inventario inventario;

	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
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
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	

}
