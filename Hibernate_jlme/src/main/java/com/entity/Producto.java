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

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productoId")
@Entity
@Table(name = "PRODUCTOS")
public class Producto {

	public Producto() {

	}

	public Producto(int id) {
		this.productoId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_auto")
	@SequenceGenerator(name = "pid_auto", sequenceName = "PRODUCTO_ID_SEQ")
	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private int productoId;

	@ManyToOne
	@JoinColumn(name = "CATEGORIA_ID", columnDefinition = "NUMBER")
	private Categoria cat;

	@ManyToOne
	@JoinColumn(name = "PROVEEDOR_ID", columnDefinition = "NUMBER")
	private Proveedor prov;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	private String nombre;

	@Column(name = "PRESENTACION", columnDefinition = "NVARCHAR2(100)")
	private String presentacion;

	@Column(name = "PRECIO", columnDefinition = "NUMBER(6,2)")
	private double precio;

	@OneToOne(mappedBy = "prodId")
	private Inventario inv;

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria catId) {
		this.cat = catId;
	}

	public Proveedor getProv() {
		return prov;
	}

	public void setProv(Proveedor provId) {
		this.prov = provId;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Inventario getInv() {
		return inv;
	}

	public void setInv(Inventario inv) {
		this.inv = inv;
	}

	@Override
	public String toString() {
		return "Producto [productoId=" + productoId + ", catId=" + cat + ", provId=" + prov + ", nombre=" + nombre
				+ ", presentacion=" + presentacion + ", precio=" + precio + "]";
	}

}
