package com.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTE")
public class Cliente {

	public Cliente() {}
	public Cliente(int id) {
		this.clienteId=id;
	}
	@OneToMany(mappedBy="cliente")
	List<Venta> list;
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@Column (name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="RFC", columnDefinition="NVARCHAR2(13)")
	private String rfc;
	@Column(name="CORREO", columnDefinition="NVARCHAR(30)")
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
	public List<Venta> getList() {
		return list;
	}
	public void setList(List<Venta> list) {
		this.list = list;
	}
	
}
