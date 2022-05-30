package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.general.Metodos;

public class CategoriaDAO implements Metodos{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Categoria categoria = null;
	
	@Override
	public String guardar(Object ob) {
		categoria = (Categoria) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(categoria);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception e){
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		categoria = (Categoria) ob;
		Categoria categoriadb = em.find(Categoria.class, categoria.getCategoriaId());
		em.getTransaction().begin();
		String resultado = null;
		try {
			categoriadb.setDescripcion(categoria.getDescripcion());
			
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			resultado = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = null;
		categoria = em.find(Categoria.class,id);
		em.getTransaction().begin();
		try {
			em.remove(categoria);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado");
			resultado = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		categoria = em.find(Categoria.class, id);
		return categoria;
	}

	@Override
	public List mostrar() {
		List<Categoria> ls = em.createQuery("from Categoria").getResultList();
		return ls;
	} 

}
