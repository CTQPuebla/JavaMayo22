package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.Inventario;
import com.general.Metodos;

public class CategoriaDAO implements Metodos{
	
	//Carga los objetos(las clases definidas en el persistence)
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
		//Carga toas las operaciones (insert, update, delete, select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Categoria categoria = null;

	@Override
	public String guardar(Object ob) {
		categoria =(Categoria) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(categoria);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close(); //Es importante cerrar el EntityManager para liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		categoria = (Categoria) ob;
		Categoria categoriadb = em.find(Categoria.class, categoria.getCategoriaId());
		String r= null;
		em.getTransaction().begin();
		try {
			categoriadb.setDescripcion(categoria.getDescripcion());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r= null;
		categoria = em.find(Categoria.class, id);
		em.getTransaction().begin();
		try {
			em.remove(categoria);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
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
