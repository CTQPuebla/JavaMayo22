package com.entity;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {

	public Clientes() {}
	public Clientes(int id) {
		this.clienteId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="CLIENTES_SEQ")
	@Column(name="CLIENTE_ID" , columnDefinition="NUMBER")
	int clienteId;
	
	@Column(name="RFC" , columnDefinition="NVARCHAR2(7 CHAR)")
	String rfc;
	@Column(name="CORREO" , columnDefinition="NVARCHAR2(50 CHAR)")
	String correo;
	
	@OneToMany(mappedBy="cliente")
	List<Ventas> list;
	//Getters & Setters

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
	public List<Ventas> getList() {
		return list;
	}
	public void setList(List<Ventas> list) {
		this.list = list;
	}

	
	
}