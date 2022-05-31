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
@Table(name="I_DETALLE")
public class InvDetalle {
	
	public InvDetalle() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdInvD")
	@SequenceGenerator(name="autoIdInvD", sequenceName="I_DETALLE_SEQ")
	@Column(name="I_DETALLE_ID", columnDefinition="NUMBER")
	int iDetalleId;

	public InvDetalle(int iDetalleId) {
		super();
		this.iDetalleId = iDetalleId;
	}
	
	@ManyToOne
	@JoinColumn(name="INVENTARIO_ID", columnDefinition="NUMBER")
	Inventario inventario;
	@Column(name="IDET_FECHA", columnDefinition="DATE")
	Date idetFecha;
	@Column(name="IDET_MOVIMIENTO", columnDefinition="CHAR(1)")                      
	char idetMonv;
	@Column(name="IDET_CANTIDAD", columnDefinition="NUMBER")
	int idetCantidad;   
	@Column(name="IDET_CADUCIDAD", columnDefinition="DATE")
	Date idetCaducidad;

	public int getiDetalleId() {
		return iDetalleId;
	}
	public void setiDetalleId(int iDetalleId) {
		this.iDetalleId = iDetalleId;
	}

	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public Date getIdetFecha() {
		return idetFecha;
	}
	public void setIdetFecha(Date idetFecha) {
		this.idetFecha = idetFecha;
	}
	public char getIdetMonv() {
		return idetMonv;
	}
	public void setIdetMonv(char idetMonv) {
		this.idetMonv = idetMonv;
	}
	public int getIdetCantidad() {
		return idetCantidad;
	}
	public void setIdetCantidad(int idetCantidad) {
		this.idetCantidad = idetCantidad;
	}
	public Date getIdetCaducidad() {
		return idetCaducidad;
	}
	public void setIdetCaducidad(Date idetCaducidad) {
		this.idetCaducidad = idetCaducidad;
	}
	
}
