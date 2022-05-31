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
@Table(name="INVENTARIO")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
property = "@inventarioId", scope = Inventario.class)
		
public class Inventario {
	

	public Inventario() {
		
	}
	
	public Inventario(int id) {
		this.inventarioId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="INVENTARIO_SEQ")
	@Column(name="INVENTARIO_ID", columnDefinition="NUMBER")
	int inventarioId;
	
	@OneToOne
	@JoinColumn (name="PRODUCTO_ID", columnDefinition="NUMBER")
	Productos productos;
	
	@Column (name="STOCK", columnDefinition="NUMBER")
	int stock;
	@Column (name="CADUCIDAD", columnDefinition="DATE")
	Date caducidad;
	@Column (name="FECHA_RESURTIDO", columnDefinition="DATE")
	Date fechaResurtido;
	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
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
