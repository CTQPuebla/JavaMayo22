package com.entity;
import java.sql.Date;

import java.util.List;



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
   
	public Ventas() {}
	public Ventas(int id) {
		this.ventasId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="VENTAS_SEQ")
	@Column(name="VENTAS_ID" , columnDefinition="NUMBER")
	int ventasId;
	

	
	@OneToOne(mappedBy="producto")
	 DetallesVentas detallesVentas;
	


	
	@Column(name="FECHA_VENTA" , columnDefinition="DATE")
	Date fechaVenta;
	@Column(name="SUBTOTAL" , columnDefinition="NUMBER")
	int subtotal;
	@Column(name="TOTAL" , columnDefinition="NUMBER")
	int total;
	
	
	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private Empleados empleado;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes cliente;

	public int getVentasId() {
		return ventasId;
	}
	public void setVentasId(int ventasId) {
		this.ventasId = ventasId;
	}
	public DetallesVentas getDetallesVentas() {
		return detallesVentas;
	}
	public void setDetallesVentas(DetallesVentas detallesVentas) {
		this.detallesVentas = detallesVentas;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
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
	public Empleados getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	
	//Getters & Setters
	
	
	
	
}