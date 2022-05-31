package com.entity;

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
@Table(name = "CATEGORIA")
public class Categoria {

	public Categoria() {

	}


	public Categoria(int categoriaId) {
		super();
		this.categoriaId = categoriaId;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="autoIdCa")
	@SequenceGenerator(name="autoIdCa", sequenceName="CATEGORIA_SEQ")
	@Column(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private int categoriaId;
	
	@Column(name="CA_DESCRICION",columnDefinition="NVARCHAR2(15)")
	private String caDescricion;
	
	@Column(name="CA_CONSERVA", columnDefinition="NVARCHAR2(10)")
	private String caConserva;
	@OneToMany (mappedBy="categori")
	List <Producto> proList;
	
	public int getCategoriaId() {
		return categoriaId;
	}


	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}


	public String getCaDescricion() {
		return caDescricion;
	}


	public void setCaDescricion(String caDescricion) {
		this.caDescricion = caDescricion;
	}


	public String getCaConserva() {
		return caConserva;
	}


	public void setCaConserva(String caConserva) {
		this.caConserva = caConserva;
	}

//
//	public List<Producto> getProList() {
//		return proList;
//	}


	public void setProList(List<Producto> proList) {
		this.proList = proList;
	}
	
	
	

}