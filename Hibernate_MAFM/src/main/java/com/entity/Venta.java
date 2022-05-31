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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table(name="VENTA")
public class Venta {
	
	public Venta(){
		
	}
	
	public Venta(int ventaId) {
		super();
		this.ventaId = ventaId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdVen")
	@SequenceGenerator(name="autoIdVen", sequenceName="VENTA_SEQ")
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	int ventaId;
	@ManyToOne 
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	ClienteT cliente;
	@ManyToOne 
	@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER")
	Empleado empleado;
	@OneToMany(mappedBy="vendetalle")
	List <VenDetalle> venDList;
	
	@Column(name="V_FECHA", columnDefinition="DATE")
	Date vFecha;
	@Column(name="V_SUBT", columnDefinition="NUMERIC(8,2)")
	double vSubt;
	@Column(name="V_IVA", columnDefinition="NUMERIC(6,2)")
	double vIva;
	@Column(name="V_TOTAL", columnDefinition="NUMERIC(8,2)")
	double vTotal;
	public ClienteT getCliente() {
		return cliente;
	}

	public void setCliente(ClienteT cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	

	public List<VenDetalle> getVenDList() {
		return venDList;
	}

	public void setVenDList(List<VenDetalle> venDList) {
		this.venDList = venDList;
	}

	public Date getvFecha() {
		return vFecha;
	}

	public void setvFecha(Date vFecha) {
		this.vFecha = vFecha;
	}

	public double getvSubt() {
		return vSubt;
	}

	public void setvSubt(double vSubt) {
		this.vSubt = vSubt;
	}

	public double getvIva() {
		return vIva;
	}

	public void setvIva(double vIva) {
		this.vIva = vIva;
	}

	public double getvTotal() {
		return vTotal;
	}

	public void setvTotal(double vTotal) {
		this.vTotal = vTotal;
	}
	
}
