package com.entity;
import java.util.List;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos {
   
	public Productos() {}
	public Productos(int id) {
		this.productoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto",sequenceName="PRODUCTOS_SEQ")
	@Column(name="PRODUCTO_ID" , columnDefinition="NUMBER")
	int productoId;
	
	@OneToOne(mappedBy="producto")
	 Inventario inventario;
	
	@OneToOne(mappedBy="producto")
	 DetallesVentas detallesVentas;
	


	//	@Column(name="CATEGORIA_ID" , columnDefinition="NUMBER")
//	int categoriaId;
	@Column(name="NOMBRE" , columnDefinition="NVARCHAR2(20 CHAR)")
	String nombre;
	@Column(name="PRESENTACION" , columnDefinition="NVARCHAR2(30 CHAR)")
	String presentacion;
	@Column(name="PRECIO" , columnDefinition="NUMBER(8,2)")
	String precio;
//	@Column(name="PROVEEDOR_ID" , columnDefinition="NUMBER")
//	int proveedorId;
	
	
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private Categorias categoria;
	
	@ManyToOne
	@JoinColumn(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	private Proveedores proveedores;
	
	
	//Getters & Setters
	
	
	public int getProductoId() {
		return productoId;
	}
	public Proveedores getProveedores() {
		return proveedores;
	}
	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public DetallesVentas getDetallesVentas() {
		return detallesVentas;
	}
	public void setDetallesVentas(DetallesVentas detallesVentas) {
		this.detallesVentas = detallesVentas;
	}
	
	
	
}