package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categorias;
import com.entity.Productos;
import com.general.Metodos;

public class CategoriasDAO implements Metodos{
	
	//carga los objetos (las clases definidas en el persistence)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
		//cargas todas las operaciones (insert,update,delete,select,contar,etc)
		EntityManager em = emf.createEntityManager();
		Categorias categoria = null;
		
		@Override
		public String guardar(Object ob) {
			categoria = (Categorias)ob;
			em.getTransaction().begin();
			String resultado = "";
			try {
				em.persist(categoria);
				em.getTransaction().commit();
				resultado = "1";
				System.out.println("Registro insertado");
			}catch(Exception ex) {
				em.getTransaction().rollback();
				resultado = ex.getMessage();
				System.out.println("No pudo insertar");
			}
			em.close();
			return resultado;
		}
		@Override
		public String editar(Object ob) {
			categoria = (Categorias) ob;
			Categorias categoriadb = em.find(Categorias.class, categoria.getIdCategoria());
			String r = "";
			em.getTransaction().begin();
			try {
				categoriadb.setDescripcion(categoria.getDescripcion());
				em.getTransaction().commit();
				r = "1";
			}catch(Exception ex) {
				em.getTransaction().rollback();
				System.out.println("No se pudo editar");
				r = ex.getMessage();
			}
			return r;
		}
		@Override
		public String eliminar(int id) {
			String r = "";
			categoria = em.find(Categorias.class, id);
			em.getTransaction().begin();
			try {
				em.remove(categoria);
				em.getTransaction().commit();
				System.out.println("Se ha eliminado el registro");
				r = "1";
			}catch(Exception ex) {
				em.getTransaction().rollback();
				System.out.println("No se pudo eliminar");
				r = ex.getMessage();
			}
			return r;
		}
		@Override
		public Object buscar(int id) {
			categoria = em.find(Categorias.class, id);
			return categoria;
		}
		@Override
		public List mostrar() {
			List<Categorias> ls = em.createQuery("from Categorias").getResultList();
			return ls;
		}

}
