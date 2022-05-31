package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cliente;
import com.general.Metodos;

public class ClienteDAO implements Metodos{


	// carga los objetos(las clases definidas en el persistence)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
		// Carga todas las operaciones(insert, update, select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Cliente c= null;

		@Override
		public String guardar(Object o) {

			c = (Cliente) o;
			em.getTransaction().begin();
			String res = null;

			try {
				em.persist(c); //este es el insert
				em.getTransaction().commit();
				res = "1";

			} catch (Exception ex) {
				em.getTransaction().rollback();
				res = ex.getMessage();
				System.out.println("Hubo un error al añadir el registro " + ex.getMessage());
			}
			em.close();
			return res;
		}

		@Override
		public String actualizar(Object o) {
			c = (Cliente) o;
			Cliente clientedb = em.find(Cliente.class , c.getClienteId());
			String res = null;
			em.getTransaction().begin();
			
			try {
				
				clientedb.setRfc(c.getRfc());
				clientedb.setCorreo(c.getCorreo());
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
			c = em.find(Cliente.class, id);
			em.getTransaction().begin();
			
			try {
				em.remove(c);
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
			
			c = em.find(Cliente.class, id);
			return c;
		}

		@Override
		public List mostrar() {
			
			List<Cliente> lista = em.createQuery("from Cliente").getResultList();
			return lista;
		}
	
}
