package com.entity;


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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PRODUCTOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@productoId", scope = Producto.class)
public class Producto{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productoid_seq")
	@SequenceGenerator(name = "productoid_seq", sequenceName = "PRODUCTO_ID_SEQ")
	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private int productoId;
	
	//@Column(name = "CATEGORIA_ID", columnDefinition = "NUMBER")
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_ID", referencedColumnName = "ID_CATEGORIA", columnDefinition = "NUMBER")
	private Categoria categoriaId;
	
	@Column(name = "PROVEEDOR_ID", columnDefinition = "NUMBER")
	private Long proveedorId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	private String nombre;
	
	@Column(name = "PRESENTACION", columnDefinition = "NVARCHAR2(100)")
	private String presentacion;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER(6,2)")
	private Double precio;
	
	@OneToOne(mappedBy = "productoId")
	private Inventario inventario;
	
	public Producto() {
	}
	
	public Producto(int id) {
		this.productoId = id;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public Categoria getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categoria categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Long getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(Long proveedorId) {
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
}
