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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "CATEGORIAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@categoriaId", scope = Categoria.class)
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "idcategoria_seq")
	@SequenceGenerator(name = "idcategoria_seq", sequenceName = "CATEGORIA_ID_SEQ")
	@Column(name = "ID_CATEGORIA", columnDefinition = "NUMBER")
	private int idCategoria;
	
	@Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(100)")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "categoriaId")
	private List<Producto> listProductos;
	
	
	public Categoria() {	
	}
	
	public Categoria(int id) {
		this.idCategoria = id;
	}
	
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
	
	public List<Producto> getListProductos() {
		return listProductos;
	}

	public void setListProductos(List<Producto> listProductos) {
		this.listProductos = listProductos;
	}
	
	
}
