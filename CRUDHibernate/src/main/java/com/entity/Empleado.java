package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="EMPLEADO")
public class Empleado {
	
	public Empleado() {}
	public Empleado(int id) {
		this.empleadoId=id;
	}
	
	@OneToMany(mappedBy="empleado")
	List<Venta> list;
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@Column (name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_REGISTRO", columnDefinition="DATE")
	private Date fechaRegistro;
	@Column(name="EDAD", columnDefinition="NUMBER")
	private int edad;
	@Column(name="DIRECCION", columnDefinition="NVARCHAR (20)")
	private String direccion;
	@Column(name="ROL", columnDefinition="NVARCHAR (10)")
	private String rol;
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
	public List<Venta> getList() {
		return list;
	}
	public void setList(List<Venta> list) {
		this.list = list;
	}
	
	
	
}
