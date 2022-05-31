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
@Table(name="V_DETALLE")
@JsonIdentityInfo ( generator = ObjectIdGenerators . PropertyGenerator . class , property = "vDetId" )
public class VenDetalle {

	public VenDetalle() {
		
	}
	
	
	public VenDetalle(int vDetId) {
		super();
		this.vDetId = vDetId;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdVenD")
	@SequenceGenerator(name="autoIdVenD", sequenceName="CATEGORIA_SEQ")
	@Column(name="V_DETALLE_ID", columnDefinition="NUMBER")
	int vDetId;
	@ManyToOne
	@JoinColumn(name="VENTA_ID", columnDefinition="NUMBER")
	Venta venta;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	Producto producto;
	@Column(name="VD_CANTIDAD", columnDefinition="NUMBER")
	int vdCantidad;
	@Column(name="VD_IMPORTE", columnDefinition="NUMERIC(8,2)")
	double vdImporte;
	public int getvDetId() {
		return vDetId;
	}
	public void setvDetId(int vDetId) {
		this.vDetId = vDetId;
	}


	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getVdCantidad() {
		return vdCantidad;
	}
	public void setVdCantidad(int vdCantidad) {
		this.vdCantidad = vdCantidad;
	}
	public double getVdImporte() {
		return vdImporte;
	}
	public void setVdImporte(double vdImporte) {
		this.vdImporte = vdImporte;
	}
	
}
