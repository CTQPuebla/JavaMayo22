package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {

	public Clientes() {
		}
	public Clientes(int id) {
		this.clientesId = id;
		}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CLIENTES_SEQ")
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	int clientesId;
	@OneToOne (mappedBy="clientes")
	Ventas ventas;
	
	
	@Column (name="RFC_CLIENTE", columnDefinition="NVARCHAR2")
	String rfcCliente;
	
	@Column (name="CORREO", columnDefinition="NVARVHAR2")
	String correo;

	public int getClientesId() {
		return clientesId;
	}
	public void setClientesId(int clientesId) {
		this.clientesId = clientesId;
	}
	public String getRfcCliente() {
		return rfcCliente;
	}
	public void setRfcCliente(String rfcCliente) {
		this.rfcCliente = rfcCliente;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	


}
