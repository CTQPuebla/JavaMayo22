package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		   generator = ObjectIdGenerators.IntSequenceGenerator.class,
		   property = "@ventaId")

@Entity
@Table (name="VENTA")
public class Venta {
	
	public Venta() {}
	public Venta(int id) {
		this.ventaId=id;
	}
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@Column (name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaId;
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private Empleado empleado;
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	private Date fechaVenta;
	@Column(name="SUBTOTAL", columnDefinition="NUMBER(6,2)")
	private double subTotal;
	@Column(name="TOTAL", columnDefinition="NUMBER (6,2)")
	private double total;
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
