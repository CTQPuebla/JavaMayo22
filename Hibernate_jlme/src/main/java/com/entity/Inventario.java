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

@Entity
@Table(name="INVENTARIO")
public class Inventario {
	
	public Inventario() {
	
	}

	public Inventario(int id) {
		this.invId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="invid_auto")
	@SequenceGenerator(name="invid_auto", sequenceName="INVENTARIO_ID_SEQ")
	@Column(name="INVENTARIO_ID", columnDefinition="NUMBER")
	private int invId;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private Producto prodId;
	
	@Column(name="STOCK", columnDefinition="NUMBER")
	private int stock;
	
	@Column(name="CADUCIDAD", columnDefinition="DATE")
	private Date caducidad;
	
	@Column(name="FECHA_RESURTIDO", columnDefinition="DATE")
	private Date fecResurtido;
	
	public int getInvId() {
		return invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public Producto getProdId() {
		return prodId;
	}

	public void setProdId(Producto prodId) {
		this.prodId = prodId;
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

	public Date getFecResurtido() {
		return fecResurtido;
	}

	public void setFecResurtido(Date recResurtido) {
		this.fecResurtido = recResurtido;
	}
	
}
