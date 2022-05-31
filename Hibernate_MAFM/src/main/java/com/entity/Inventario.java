package com.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table (name="INVENTARIO")
@JsonIdentityInfo ( generator = ObjectIdGenerators . PropertyGenerator . class , property = "inventarioId" )
public class Inventario {

	public Inventario() {
		
	}
	
	
	public Inventario(int inventarioId) {
		super();
		this.inventarioId = inventarioId;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdInv")
	@SequenceGenerator(name="autoIdInv", sequenceName="INVENTARIO_SEQ")
	@Column (name="INVENTARIO_ID", columnDefinition="NUMBER")
	private int inventarioId;
	@OneToOne
	@JoinColumn (name="PRODUCTO_ID", columnDefinition="NUMBER")
	
	Producto prodcuto;
	
	@Column(name="I_STATUS", columnDefinition="CHAR(1)")
	String iStatus;
	
	@Column(name="I_TOTAL", columnDefinition="NUMBER")
	private int iTotal;
	
	@OneToMany(mappedBy="invdetalle")
	List <InvDetalle> invDList;

	public List<InvDetalle> getInvDList() {
		return invDList;
	}

	public void setInvDList(List<InvDetalle> invDList) {
		this.invDList = invDList;
	}

	public int getInventarioId() {
		return inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	

	public Producto getProdcuto() {
		return prodcuto;
	}

	public void setProdcuto(Producto prodcuto) {
		this.prodcuto = prodcuto;
	}

	public String getiStatus() {
		return iStatus;
	}

	public void setiStatus(String iStatus) {
		this.iStatus = iStatus;
	}

	public int getiTotal() {
		return iTotal;
	}

	public void setiTotal(int iTotal) {
		this.iTotal = iTotal;
	}
	
	
}
