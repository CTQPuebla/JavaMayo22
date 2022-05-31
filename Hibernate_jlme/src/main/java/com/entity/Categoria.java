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

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "catId")
@Entity
@Table(name="CATEGORIAS")
public class Categoria {

	public Categoria() {
		
	}
	
	public Categoria(int id) {
		this.catId = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="catid_auto")
	@SequenceGenerator(name="catid_auto", sequenceName="CATEGORIA_ID_SEQ")
	@Column(name="ID_CATEGORIA", columnDefinition="NUMBER")
	private int catId;
	
	@Column(name="DESCRIPCION", columnDefinition="NVARCHAR2(100)")
	private String descripcion;
	
	@OneToMany(mappedBy="cat")
	private List<Producto> lista;

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Producto> getLista() {
		return lista;
	}
	
}
