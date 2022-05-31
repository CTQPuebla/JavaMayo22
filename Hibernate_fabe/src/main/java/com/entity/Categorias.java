package com.entity;

import java.sql.Date;
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
@Table(name="CATEGORIAS")
public class Categorias {

	public Categorias() {
	}
	public Categorias(int id) {
		this.categoriaId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CATEGORIAS_SEQ")
	@Column(name="CATEGORIA_ID", columnDefinition="NUMBER")
	int categoriaId;
	
	@Column (name="DESCRIPCION", columnDefinition="NVARCHAR2(20 CHAR)")
	String descripcion;
	
	@OneToMany(mappedBy="categorias")
	List<Productos>list;
	
	

	public List<Productos> getList() {
		return list;
	}
	public void setList(List<Productos> list) {
		this.list = list;
	}
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

	
	
}
