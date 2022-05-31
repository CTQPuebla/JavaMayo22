package com.entity;



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
	
	

	public Productos() {
		}
	public Productos(int id) {
		this.productosId = id;
		}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTOS_SEQ")
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	int productosId;
	@OneToOne (mappedBy="productos")
	DetallesVenta detallesVenta;
	
	
	@OneToOne (mappedBy="productos")
	Inventario inventario;
	
//	@Column (name="CATEGORIA_ID", columnDefinition="NUMBER")
//	int categoriaId;
	
	@Column (name="NOMBRE_PRODUCTO", columnDefinition="NVARCHAR2")
	String nombreProductos;
	
	@Column (name="PRESENTACION", columnDefinition="NVARVHAR2")
	String presentacion;
	@Column (name="PRECIO", columnDefinition="NUMBER")
	int precio;
//	@Column (name="PROVEEDOR_ID", columnDefinition="NUMBER")
//	int proveedorId;
	
	@OneToMany
	@JoinColumn(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	private Proveedores proveedores;
	

//(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private Categorias categorias;
	

	
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	public Inventario getInventario() {
	return inventario;
}
public void setInventario(Inventario inventario) {
	this.inventario = inventario;
}
	public int getProductosId() {
		return productosId;
	}
	public void setProductosId(int productosId) {
		this.productosId = productosId;
	}

	public String getNombreProductos() {
		return nombreProductos;
	}
	public void setNombreProductos(String nombreProductos) {
		this.nombreProductos = nombreProductos;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Proveedores getProveedores() {
		return proveedores;
	}
	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}
	
	
	
}
