package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="CLIENTE_T")
public class ClienteT {

	public ClienteT() {
		
	}
	
	public ClienteT(int clienteTId) {
		super();
		this.clienteTId = clienteTId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdCT")
	@SequenceGenerator(name="autoIdCT", sequenceName="CLIENTE_T_SEQ")
	@Column(name="CLIENTE_T_ID", columnDefinition="NUMBER")
	int clienteTId;
	
	@Column(name="CT_NOMBRE", columnDefinition="NVARCHAR2(40)")
	String ctName;
	
	@Column(name="CT_RFC", columnDefinition="NVARCHAR2(14)")
	String ctRfc;
	
	@Column(name="CT_EMAIL", columnDefinition="NVARCHAR2(40)")
	String ctEmail;

	public int getClienteTId() {
		return clienteTId;
	}

	public void setClienteTId(int clienteTId) {
		this.clienteTId = clienteTId;
	}

	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public String getCtRfc() {
		return ctRfc;
	}

	public void setCtRfc(String ctRfc) {
		this.ctRfc = ctRfc;
	}

	public String getCtEmail() {
		return ctEmail;
	}

	public void setCtEmail(String ctEmail) {
		this.ctEmail = ctEmail;
	}
	

}
