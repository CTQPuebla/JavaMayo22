package com.entity;

import java.sql.Date;
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
@Table(name="CATEGORIAS")
public class Empleados {

	public Empleados() {}
	public Empleados(int id) {
		this.empleadoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="EMPLEADOS_SEQ")
	@Column(name="EMPLEADO_ID" , columnDefinition="NUMBER")
	int empleadoId;
	
	@Column(name="NOMBRE" , columnDefinition="NVARCHAR2(15 CHAR)")
	String nombre;
	@Column(name="FECHA_REGISTRO" , columnDefinition="DATE")
	Date fechaRegistro;
	@Column(name="EDAD" , columnDefinition="NVARCHAR2(100 CHAR)")
	String edad;
	@Column(name="DIRECCION" , columnDefinition="NVARCHAR2(50 CHAR)")
	String direccion;
	@Column(name="ROL" , columnDefinition="NVARCHAR2(20 CHAR)")
	String rol;
	@Column(name="STATUS" , columnDefinition="NUMBER")
	int status;
	
	@OneToMany(mappedBy="empleado")
	List<Ventas> list;
	//Getters & Setters

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
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Ventas> getList() {
		return list;
	}
	public void setList(List<Ventas> list) {
		this.list = list;
	}

	


	
}