package com.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		   generator = ObjectIdGenerators.IntSequenceGenerator.class,
		   property = "@productoId")

@Entity
@Table(name="PRODUCTO")
public class Producto {
	
	public Producto() {}
	public Producto(int id) {
		this.productoId=id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTO_SEQ")
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoId;
	
	@OneToOne(mappedBy="producto")
	private Inventario inventario;
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	private Proveedor proveedor;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2 (10)")
	private String nombre;
	@Column(name="PRESENTACION", columnDefinition="NVARCHAR2 (20)")
	private String presentacion;
	@Column(name="PRECIO", columnDefinition="NUMBER (6,2)")
	private double precio;
	
	@OneToMany(mappedBy="producto")
	List<DetalleVenta> list;
	public List<DetalleVenta> getList() {
		return list;
	}
	public void setList(List<DetalleVenta> list) {
		this.list = list;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
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
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}
