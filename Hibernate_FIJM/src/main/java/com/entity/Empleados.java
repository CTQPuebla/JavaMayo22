package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")
public class Empleados {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="eid_auto")
	@SequenceGenerator(name="eid_auto", sequenceName="EMPLEADO_ID_SEQ")
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	private String nombre;
	
	@Column(name="FECHA_REG", columnDefinition="DATE")
	private Date fechaReg;
	
	@Column(name="EDAD", columnDefinition="NUMBER")
	private int edad;
	
	@Column(name="DIRECCION",columnDefinition="NVARCHAR2(100)")
	private String direccion;
	
	@Column(name="ROL",columnDefinition="NVARCHAR2(100)")
	private String rol;
	
	public Empleados() {
		
	}

	public Empleados(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaReg() {
		return fechaReg;
	}

	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
