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


@JsonIdentityInfo(
		   generator = ObjectIdGenerators.IntSequenceGenerator.class,
		   property = "@categoriaId")
@Entity
@Table(name="CATEGORIA")
public class Categoria {
	
	public Categoria() {}
	public Categoria(int id) {
		this.categoriaId=id;
	}
	@OneToMany(mappedBy="categoria")
	List<Producto> list;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CATEGORIA_SEQ")
	@Column(name="CATEGORIA_ID", columnDefinition="NUMBER")
	private int categoriaId;
	
	@Column(name="DESCRIPCION", columnDefinition="NVARCHAR2 (30)")
	private String descripcion;

	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Producto> getList() {
		return list;
	}
	public void setList(List<Producto> list) {
		this.list = list;
	}
}
