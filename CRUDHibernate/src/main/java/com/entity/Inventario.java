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

@JsonIdentityInfo(
		   generator = ObjectIdGenerators.IntSequenceGenerator.class,
		   property = "@inventarioId")
@Entity
@Table(name="INVENTARIO")
public class Inventario {
	
	public Inventario() {}
	public Inventario(int id) {
		this.inventarioId=id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="INVENTARIO_SEQ")
	@Column(name="INVENTARIO_ID", columnDefinition="NUMBER")
	private int inventarioId;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	Producto producto;
	@Column(name="STOCK", columnDefinition="NUMBER")
	private int stock;
	@Column(name="CADUCIDAD", columnDefinition="DATE")
	private Date caducidad;
	@Column(name="FECHA_RESURTIDO", columnDefinition="DATE")
	private Date feachaResurtido;
	
	public int getInventarioId() {
		return inventarioId;
	}
	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
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
	public Date getFeachaResurtido() {
		return feachaResurtido;
	}
	public void setFeachaResurtido(Date feachaResurtido) {
		this.feachaResurtido = feachaResurtido;
	}
	
}
