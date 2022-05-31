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
public class Cliente {
	
	public Cliente() {
	}

	public Cliente(int Id) {
		this.clienteId = Id;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="clid_auto")
	@SequenceGenerator(name="clid_auto", sequenceName="CLIENTE_ID_SEQ")
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="RFC", columnDefinition="NVARCHAR2(20)")
	private String rfc;
	
	@Column(name="CORREO", columnDefinition="NVARCHAR2(30)")
	private String correo;

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

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", rfc=" + rfc + ", correo=" + correo + "]";
	}
	
}
