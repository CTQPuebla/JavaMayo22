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
import javax.persistence.Table;


@Entity
@Table(name="DETALLE_VENTA")
public class DetalleVenta {

	public DetalleVenta() {}
	public DetalleVenta(int id) {
		this.detalleVentaId=id;
	}
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@Column (name="DETALLE_VENTA_ID", columnDefinition="NUMBER")
	private int detalleVentaId;
	@ManyToOne
	@JoinColumn(name="VENTA_ID", columnDefinition="NUMBER")
	private Venta venta;
	@ManyToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private Producto producto;
	@Column(name="CANTIDAD", columnDefinition="NUMBER")
	private int cantidad;
	public int getDetalleVentaId() {
		return detalleVentaId;
	}
	public void setDetalleVentaId(int detalleVentaId) {
		this.detalleVentaId = detalleVentaId;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
