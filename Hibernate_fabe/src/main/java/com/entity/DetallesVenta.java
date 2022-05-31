package com.entity;

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

@Entity
@Table(name="DETALLES_VENTA")
public class DetallesVenta {
	
	public DetallesVenta() {
	}
	public DetallesVenta(int id) {
		this.detalleVentaId = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="DETALLES_VENTA_SEQ")
	@Column(name="DETALLE_VENTA_ID", columnDefinition="NUMBER")
	int detalleVentaId;
	
	@ManyToOne
	@Column (name="VENTA_ID", columnDefinition="NUMBER")
	private Ventas ventas;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private Productos productos;
	
	
//	@Column (name="PRODUCTO_ID", columnDefinition="NUMBER")
//	int productoId;
//	
	@Column (name="CANTIDAD", columnDefinition="NUMBER")
	int cantidad;

	public int getDetalleVentaId() {
		return detalleVentaId;
	}
	public void setDetalleVentaId(int detalleVentaId) {
		this.detalleVentaId = detalleVentaId;
	}
	

	
	public Ventas getVentas() {
		return ventas;
	}
	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
