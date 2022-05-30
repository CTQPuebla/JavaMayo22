package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "INVENTARIO")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@inventarioId", scope = Inventario.class)
public class Inventario{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventarioid_seq")
	@SequenceGenerator(name = "inventarioid_seq", sequenceName = "INVENTARIO_ID_SEQ")
	@Column(name = "INVENTARIO_ID",columnDefinition = "NUMBER")
	private int inventarioId;
	
	//@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	//@ManyToOne
	@OneToOne
	@JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private Producto productoId;
	
	@Column(name = "STOCK", columnDefinition = "NUMBER")
	private int stock;
	
	@Column(name = "CADUCIDAD", columnDefinition = "DATE")
	private Date caducidad;
	
	@Column(name = "FECHA_RESURTIDO", columnDefinition = "DATE")
	private Date fechaResurtido;
	
	public Inventario() {
		
	}

	public Inventario(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public Producto getProductoId() {
		return productoId;
	}

	public void setProductoId(Producto productoId) {
		this.productoId = productoId;
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

	@Override
	public String toString() {
		return "Inventario [inventarioId=" + inventarioId + ", productoId=" + productoId + ", stock=" + stock
				+ ", caducidad=" + caducidad + ", fechaResurtido=" + fechaResurtido + "]";
	}
	
	
}
