package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDORES")
public class Proveedores {
	
	
		
public Proveedores() {
			}
		
	public Proveedores(int id) {
			this.productosId = id;
			}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
		@SequenceGenerator(name="cid_auto", sequenceName="PROVEEDORES_SEQ")
		@Column(name="PROVEEDOR_ID", columnDefinition="NUMBER")
		int productosId;
		
		@OneToOne (mappedBy="proveedores")
		Productos productos;
		
		
		@Column (name="NOMBRE_PROVEEDOR", columnDefinition="NVARCHAR2")
		String nombreProveedor;
		
		@Column (name="RFC_PROVEEDORES", columnDefinition="NVARVHAR2")
		String rfcProveedores;
		
		@Column (name="NUM_CUENTA", columnDefinition="NUMBER")
		int numCuenta;
		
		@Column (name="TELEFONO", columnDefinition="NUMBER")
		int telefono;

		public int getProductosId() {
			return productosId;
		}
		public void setProductosId(int productosId) {
			this.productosId = productosId;
		}
		public String getNombreProveedor() {
			return nombreProveedor;
		}
		public void setNombreProveedor(String nombreProveedor) {
			this.nombreProveedor = nombreProveedor;
		}
		public String getRfcProveedores() {
			return rfcProveedores;
		}
		public void setRfcProveedores(String rfcProveedores) {
			this.rfcProveedores = rfcProveedores;
		}
		public int getNumCuenta() {
			return numCuenta;
		}
		public void setNumCuenta(int numCuenta) {
			this.numCuenta = numCuenta;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

	

		
		

}
