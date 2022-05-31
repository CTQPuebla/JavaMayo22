package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.general.Metodos;

public class CategoriaDao implements Metodos {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Categoria categoria=null;
	@Override
	public String guardar(Object oB) {
		categoria = (Categoria) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(categoria);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro categoria");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro categoria");
		}
		em.close();
		return resultado;	
	}

	@Override
	public String editar(Object oB) {
		categoria = (Categoria) oB;
		Categoria categoriaDb= em.find(Categoria.class, categoria.getCategoriaId());
		String res= null;
		em.getTransaction().begin();
		try {
			categoriaDb.setCaDescricion(categoria.getCaDescricion());
			categoriaDb.setCaConserva(categoria.getCaConserva());
			em.getTransaction().commit();
			System.out.println("Registor editado");
			res="1";
			
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se actualizo registro");
			res =ex.getMessage();
		}
		return res;
	}

	@Override
	public String eliminar(int id) {
		String res= null;
		categoria =em.find(Categoria.class, id);
		em.getTransaction().begin();
		try {
			em.remove(categoria);
			em.getTransaction().commit();
			System.out.println("Se elimino registro");
			res="1";
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se puedo eliminar");
			res = "1";
		}
		return res;
	}

	@Override
	public Object buscar(int id) {
		categoria = em.find(Categoria.class, id);
		return categoria;
	}

	@Override
	public List mostrar() {
		List<Categoria> calis =em.createQuery("from Categoria").getResultList();
		return calis;
	}

}
