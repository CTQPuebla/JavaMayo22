package com.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="DETALLES_VENTAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
property = "@detallesVentasId", scope = DetallesVentas.class)
public class DetallesVentas {

	public DetallesVentas() {}
	public DetallesVentas(int id) {
		this.detallesVentasId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="DETALLES_VENTAS_SEQ")
	@Column(name="DETALLES_VENTAS_ID" , columnDefinition="NUMBER")
	int detallesVentasId;
	
	@OneToOne
	@JoinColumn(name="PRODUCTO_ID" , columnDefinition="NUMBER")
	Productos producto;
	@Column(name="VENTAS_ID" , columnDefinition="NUMBER")
	int ventasId;
	@Column(name="CANTIDAD" , columnDefinition="NUMBER")
	int cantidad;
	
	
	public int getDetallesVentasId() {
		return detallesVentasId;
	}
	public void setDetallesVentasId(int detallesVentasId) {
		this.detallesVentasId = detallesVentasId;
	}
	public Productos getProducto() {
		return producto;
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	public int getVentasId() {
		return ventasId;
	}
	public void setVentasId(int ventasId) {
		this.ventasId = ventasId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//Getters & Setters
	
	
	
	
}