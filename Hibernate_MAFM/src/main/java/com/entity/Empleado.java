package com.entity;

import java.util.Date;
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
@Table (name="EMPLEADO")
public class Empleado {

	public Empleado() {
		
	}
	
	public Empleado(int empleadoId) {
		super();
		this.empleadoId = empleadoId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdEm")
	@SequenceGenerator(name="autoIdEm", sequenceName="EMPLEADO_SEQ")
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	int empleadoId;
	
	@Column(name="E_NOMBRE", columnDefinition="NVARCHAR2(40)")
	String eNombre;
	@Column(name="E_FECHA_REGISTRO", columnDefinition="DATE")
	Date eFechaR;
	@Column(name="E_SEXO", columnDefinition="CHAR(1)")
	char eSexo;
	@Column(name="E_DIRECCION", columnDefinition="NVARCHAR2(15)")
	String eDireccion;
	@Column(name="E_ROLL", columnDefinition="NVARCHAR2(10)")
	String eRoll;
	@Column(name="E_STATUS", columnDefinition="CHAR(1)")
	char eStatus;
	@OneToMany(mappedBy="venta")
	List <Venta> venList;
	
	public List<Venta> getVenList() {
		return venList;
	}

	public void setVenList(List<Venta> venList) {
		this.venList = venList;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String geteNombre() {
		return eNombre;
	}

	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	public Date geteFechaR() {
		return eFechaR;
	}

	public void seteFechaR(Date eFechaR) {
		this.eFechaR = eFechaR;
	}

	public char geteSexo() {
		return eSexo;
	}

	public void seteSexo(char eSexo) {
		this.eSexo = eSexo;
	}

	public String geteDireccion() {
		return eDireccion;
	}

	public void seteDireccion(String eDireccion) {
		this.eDireccion = eDireccion;
	}

	public String geteRoll() {
		return eRoll;
	}

	public void seteRoll(String eRoll) {
		this.eRoll = eRoll;
	}

	public char geteStatus() {
		return eStatus;
	}

	public void seteStatus(char eStatus) {
		this.eStatus = eStatus;
	}
	
	
}
