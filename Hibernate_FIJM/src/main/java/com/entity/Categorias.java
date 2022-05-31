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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="idCategoria")
@Entity
@Table(name="CATEGORIAS")
public class Categorias {
	
	public Categorias() {
		
	}
	
	public Categorias(int id) {
		this.idCategoria = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="catid_auto")
	@SequenceGenerator(name="catid_auto",sequenceName="CATEGORIA_ID_SEQ")
	@Column(name="ID_CATEGORIA",columnDefinition="NUMBER")
	private int idCategoria;
	
	@Column(name="DESCRIPCION",columnDefinition="NVARCHAR2(100)")
	private String descripcion;
	
	@OneToMany(mappedBy="categoria")
	private List<Productos>productosLista;

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Productos> getProductosLista() {
		return productosLista;
	}

	public void setProductosLista(List<Productos> productosLista) {
		this.productosLista = productosLista;
	}
}
