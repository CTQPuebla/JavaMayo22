package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="P_PRECIO")
public class ProPrecio {
	public ProPrecio() {
		
	}

	
	public ProPrecio(int proPreId) {
		super();
		this.proPreId = proPreId;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdPpre")
	@SequenceGenerator(name="autoIdPpre", sequenceName="P_PRECIO_SEQ")
	@Column(name="P_PRECIO_ID", columnDefinition="NUMBER")
	int proPreId;
	
	@ManyToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	Producto producto;
	@Column(name="PP_FECHA_I", columnDefinition="DATE")
	Date ppFechaI;
	@Column(name="PP_FEHCA_F", columnDefinition="DATE")
	Date ppFechaF;
	@Column(name="PP_PRECIO", columnDefinition="NUMERIC (6,2)")
	double ppPrecio;
	public int getProPreId() {
		return proPreId;
	}


	public void setProPreId(int proPreId) {
		this.proPreId = proPreId;
	}





	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Date getPpFechaI() {
		return ppFechaI;
	}


	public void setPpFechaI(Date ppFechaI) {
		this.ppFechaI = ppFechaI;
	}


	public Date getPpFechaF() {
		return ppFechaF;
	}


	public void setPpFechaF(Date ppFechaF) {
		this.ppFechaF = ppFechaF;
	}


	public double getPpPrecio() {
		return ppPrecio;
	}


	public void setPpPrecio(double ppPrecio) {
		this.ppPrecio = ppPrecio;
	}
	 
}
