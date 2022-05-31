package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VENTA")
public class Venta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vid_auto")
	@SequenceGenerator(name="vid_auto", sequenceName = "VENTA_ID_SEQ")
	@Column(name="VENTA_ID",columnDefinition="NUMBER")
	private int ventaId;
	
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	private Date fechaVenta;
	
	@Column(name="SUB_TOTAL", columnDefinition="NUMBER")
	private int subTotal;
	
	public Venta() {
		
	}

	public Venta(int ventaId) {
		super();
		this.ventaId = ventaId;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
}
