package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.general.Metodos;

public class CategoriaDAO implements Metodos {

	// carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones(insert, update, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Categoria cat= null;

	@Override
	public String guardar(Object o) {

		cat = (Categoria) o;
		em.getTransaction().begin();
		String res = null;

		try {
			em.persist(cat); // este es el insert
			em.getTransaction().commit();
			res = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			res = ex.getMessage();
			System.out.println("Hubo un error al añadir el registro" + ex.getMessage());
		}
		em.close();
		return res;
	}

	@Override
	public String actualizar(Object o) {
		cat = (Categoria) o;
		Categoria categoriadb = em.find(Categoria.class, cat.getCatId());
		String res = null;
		em.getTransaction().begin();

		try {

			categoriadb.setDescripcion(cat.getDescripcion());

			em.getTransaction().commit();
			System.out.println("actualizacion exitosa");
			res = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Hubo un error al actualizar" + ex.getMessage());
			res = ex.getMessage();
		}
		em.close();
		return res;
	}

	@Override
	public String eliminar(int id) {

		String res = null;
		cat = em.find(Categoria.class, id);
		em.getTransaction().begin();

		try {
			em.remove(cat);
			em.getTransaction().commit();
			System.out.println("registro eliminado");
			res = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Hubo un error al eliminar el registro seleccionado" + ex.getMessage());
			res = ex.getMessage();
		}
		em.close();
		return res;
	}

	@Override
	public Object buscar(int id) {

		cat = em.find(Categoria.class, id);
		return cat;
	}

	@Override
	public List mostrar() {

		List<Categoria> lista = em.createQuery("from Categoria").getResultList();
		return lista;
	}
}
