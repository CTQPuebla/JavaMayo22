package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="productoId")
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class ,property="@productoId", scope=Productos.class);
@Entity
@Table(name="PRODUCTOS")
public class Productos {
	
	public Productos() {
		
	}
	
	public Productos(int id) {
		this.productoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pid_auto")
	@SequenceGenerator(name="pid_auto",sequenceName="PRODUCTO_ID_SEQ")
	@Column(name="PRODUCTO_ID",columnDefinition="NUMBER")
	private int productoId;
	
	//@ManyToOne
	//@JoinColumn(name = "CATEGORIA_ID" ,referencedColumnName = "ID_CATEGORIA")
	//@Column(name="CATEGORIA_ID",columnDefinition="NUMBER")
	//private int categoriaId;

	@OneToOne(mappedBy="producto")
	private Inventario inventario;
	
	@Column(name="PROVEEDOR_ID",columnDefinition="NUMBER")
	private int proveedorId;
	
	@Column(name="NOMBRE",columnDefinition="NVARCHAR2(100)")
	private String nombre;
	
	@Column(name="PRESENTACION",columnDefinition="NVARCHAR2(100)")
	private String presentacion;
	
	@Column(name="PRECIO",columnDefinition="NUMBER(6,2)")
	private double precio;
	
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private Categorias categoria;

	public int getProductoId() {
		return productoId;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	

}
