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
@Table(name="INVENTARIO")
public class Inventario {
	
	public Inventario() {
		
	}
	
	public Inventario(int id) {
		this.inventarioId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="inid_auto")
	@SequenceGenerator(name="inid_auto",sequenceName="INVENTARIO_ID_SEQ")
	@Column(name="INVENTARIO_ID",columnDefinition="NUMBER")
	private int inventarioId;
	
	@OneToOne
	//@JoinColumn(name = "PRODUCTO_ID",referencedColumnName = "PRODUCTO_ID")
	@JoinColumn(name="PRODUCTO_ID",columnDefinition="NUMBER")
	private Productos producto;
	
	@Column(name="STOCK",columnDefinition="NUMBER")
	private int stock;
	
	@Column(name="CADUCIDAD",columnDefinition="DATE")
	private Date caducidad;
	
	@Column(name="FECHA_RESURTIDO",columnDefinition="DATE")
	private Date fechaResurtido;

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	public Date getFechaResurtido() {
		return fechaResurtido;
	}

	public void setFechaResurtido(Date fechaResurtido) {
		this.fechaResurtido = fechaResurtido;
	}
}
