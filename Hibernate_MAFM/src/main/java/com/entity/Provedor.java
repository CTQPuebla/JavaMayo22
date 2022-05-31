package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROVEDOR")
public class Provedor {
	
	public Provedor() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdPro")
	@SequenceGenerator(name="autoIdPro",sequenceName="PROVEDOR_SEQ")
	@Column(name="PROVEDOR_ID", columnDefinition="NUMBER")
	private int provedorId;
	
	@Column(name="P_NOMBRE", columnDefinition="NVARCHAR2(40)")
	private String pNombre;
	
	@Column(name="P_RFC", columnDefinition="NVARCHAR2(14)")
	private String pRfc;
	
	@Column(name="P_NUMCUENTA", columnDefinition="NUMBER")
	private Long pNumCuenta;
	
	
	@Column(name="P_TELEFONO", columnDefinition="NUMBER")
	private Long pTelefono;
	

	public int getProvedorId() {
		return provedorId;
	}


	public void setProvedorId(int provedorId) {
		this.provedorId = provedorId;
	}


	public String getpNombre() {
		return pNombre;
	}


	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}


	public String getpRfc() {
		return pRfc;
	}


	public void setpRfc(String pRfc) {
		this.pRfc = pRfc;
	}


	public Long getpNumCuenta() {
		return pNumCuenta;
	}


	public void setpNumCuenta(long pNumCuenta) {
		this.pNumCuenta = pNumCuenta;
	}


	public Long getpTelefono() {
		return pTelefono;
	}


	public void setpTelefono(Long pTelefono) {
		this.pTelefono = pTelefono;
	}
	
	

}
