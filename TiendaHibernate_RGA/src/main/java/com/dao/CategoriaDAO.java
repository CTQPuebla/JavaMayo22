package com.dao;

import java.util.ArrayList;
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
		String resultado = "";
		try {
			em.persist(categoria);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		categoria = (Categoria) ob;
		Categoria categoriadb = em.find(Categoria.class, categoria.getIdCategoria());
		em.getTransaction().begin();
		String resultado = "";
		try {
			categoriadb.setDescripcion(categoria.getDescripcion());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			resultado = "1";
		} catch (Exception e) {
			resultado = e.getMessage();
			em.getTransaction().rollback();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = "";
		categoria = em.find(Categoria.class, id);
		em.getTransaction().begin();
		try {
			em.remove(categoria);
			em.getTransaction().commit();
			System.out.println("Eliminado correctamente");
			resultado = "1";
		} catch (Exception e) {
			resultado = e.getMessage();
			em.getTransaction().rollback();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		return em.find(Categoria.class, id);
	}

	@Override
	public List mostrar() {
		List<Categoria> listCategoria = em.createQuery("from Categoria").getResultList();
		return listCategoria;
	}

}
