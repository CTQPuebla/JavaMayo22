package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DETALLE_VENTA")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="dvid_auto")
	@SequenceGenerator(name="dvid_auto", sequenceName="TICKET_ID_SEQ")
	@Column(name="TICKET_ID", columnDefinition="NUMBER")
	private int ticketId;
	
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaId;
	
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoId;
	
	@Column(name="CANTIDAD", columnDefinition="NUMBER")
	private int cantidad;
	
	public DetalleVenta() {
		
	}

	public DetalleVenta(int ticketId) {
		super();
		this.ticketId = ticketId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
