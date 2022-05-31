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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "PRODUCTO")
@JsonIdentityInfo ( generator = ObjectIdGenerators . PropertyGenerator . class , property = "productoId" )
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
//property = "@productoId")
public class Producto  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autoIdPr")
	@SequenceGenerator(name = "autoIdPr", sequenceName = "PRODUCTO_SEQ")
	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private int productoId;
	
	@ManyToOne
	@JoinColumn(name = "PROVEDOR_ID", columnDefinition = "NUMBER")
	Provedor proevedorId;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_ID")
	Categoria categori;

	@Column(name = "PR_NOMBRE", columnDefinition = "NVARCHAR2(15)")
	String prNombre;

	@Column(name = "PR_UNIMED", columnDefinition = "NVARCHAR2(3)")
	String prUniMed;

	@Column(name = "PR_CANT", columnDefinition = "NUMBER")
	int prCant;
	
	@OneToOne(mappedBy="prodcuto")
	Inventario inventario;
	@OneToMany(mappedBy="proprecio")
	List <ProPrecio> propreLits;
	
	public List<ProPrecio> getPropreLits() {
		return propreLits;
	}

	public void setPropreLits(List<ProPrecio> propreLits) {
		this.propreLits = propreLits;
	}

	public Producto() {

	}

	public Producto(int productoId) {

		this.productoId = productoId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	

	public Provedor getProevedorId() {
		return proevedorId;
	}

	public void setProevedorId(Provedor proevedorId) {
		this.proevedorId = proevedorId;
	}


	public Categoria getCategori() {
		return categori;
	}

	public void setCategori(Categoria categori) {
		this.categori = categori;
	}

	public String getPrNombre() {
		return prNombre;
	}

	public void setPrNombre(String prNombre) {
		this.prNombre = prNombre;
	}

	public String getPrUniMed() {
		return prUniMed;
	}

	public void setPrUniMed(String prUniMed) {
		this.prUniMed = prUniMed;
	}

	public int getPrCant() {
		return prCant;
	}

	public void setPrCant(int prCant) {
		this.prCant = prCant;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	

}
