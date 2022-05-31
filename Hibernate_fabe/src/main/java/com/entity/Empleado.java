package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")

public class Empleado {

	

public Empleado() {
}
public Empleado(int id) {
	this.empleadoId = id;
}

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
@SequenceGenerator(name="cid_auto", sequenceName="EMPLEADO_SEQ")
@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
int empleadoId;
@OneToOne (mappedBy="empleados")
Ventas ventas;


@Column (name="NOMBRE_EMPLEADO", columnDefinition="NVARCHAR2")
String nombreEmpleado;



@Column (name="FECHA_REGISTRO", columnDefinition="DATE")
Date fechaRegistro;



@Column (name="EDAD", columnDefinition="NUMBER")
int edad;



@Column (name="DIRECCION", columnDefinition="NVARCHAR2")
String direccion;


@Column (name="ROL", columnDefinition="NVARCHAR2")
String rol;


public int getEmpleadoId() {
	return empleadoId;
}
public void setEmpleadoId(int empleadoId) {
	this.empleadoId = empleadoId;
}
public String getNombreEmpleado() {
	return nombreEmpleado;
}
public void setNombreEmpleado(String nombreEmpleado) {
	this.nombreEmpleado = nombreEmpleado;
}
public Date getFechaRegistro() {
	return fechaRegistro;
}
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
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