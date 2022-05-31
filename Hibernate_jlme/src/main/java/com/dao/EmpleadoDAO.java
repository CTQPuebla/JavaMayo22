package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Empleado;
import com.general.Metodos;

public class EmpleadoDAO implements Metodos{

	// carga los objetos(las clases definidas en el persistence)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
		// Carga todas las operaciones(insert, update, select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Empleado e= null;

		@Override
		public String guardar(Object o) {

			e = (Empleado) o;
			em.getTransaction().begin();
			String res = null;

			try {
				em.persist(e); //este es el insert
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
			e = (Empleado) o;
			Empleado empleadodb = em.find(Empleado.class , e.getEmpleadoId());
			String res = null;
			em.getTransaction().begin();
			
			try {
				
				empleadodb.setNombre(e.getNombre());
				empleadodb.setFecReg(e.getFecReg());
				empleadodb.setEdad(e.getEdad());
				empleadodb.setDir(e.getDir());
				empleadodb.setRol(e.getRol());
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
			e = em.find(Empleado.class, id);
			em.getTransaction().begin();
			
			try {
				em.remove(e);
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
			
			e = em.find(Empleado.class, id);
			return e;
		}

		@Override
		public List mostrar() {
			
			List<Empleado> lista = em.createQuery("from Empleado").getResultList();
			return lista;
		}
	
}
