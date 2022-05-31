package com.entity;

import java.sql.Date;

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
@Table(name="VENTAS")
public class Ventas {
	public Ventas() {
	}
	public Ventas(int id) {
		this.VentaId = id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="VENTA_SEQ")
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	int VentaId;
	@OneToOne (mappedBy="ventas")
	DetallesVenta detallesVenta;
	
	
	@ManyToOne
	@Column (name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes clientes;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	Date fechaVenta;
	
	@OneToOne
	@Column (name="EMPLEADO_ID", columnDefinition="NUMBER")
	private Empleado empleado;
	
	@Column (name="SUBTOTAL", columnDefinition="NUMBER")
	int subtotal;
	
	@Column (name="TOTAL", columnDefinition="NUMBER")
	int total;

	public int getVentaId() {
		return VentaId;
	}
	public void setVentaId(int ventaId) {
		VentaId = ventaId;
	}
	
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}
