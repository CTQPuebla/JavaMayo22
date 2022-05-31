package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cid_cliente")
	@SequenceGenerator(name="cid_cliente",sequenceName="CLIENTE_ID_SEQ")
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="RFC" ,columnDefinition="NVARCHAR2(100)")
	private String rfc;
	
	@Column(name="CORREO", columnDefinition="NVARCHAR2(100)")
	private String correo;
	
	public Clientes() {
		
	}
	
	public Clientes(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
