package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Proveedor;
import com.general.Metodos;

public class ProveedorDAO implements Metodos {

	// carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones(insert, update, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Proveedor p = null;

	@Override
	public String guardar(Object o) {

		p = (Proveedor) o;
		em.getTransaction().begin();
		String res = null;

		try {
			em.persist(p); // este es el insert
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
		p = (Proveedor) o;
		Proveedor proveedordb = em.find(Proveedor.class, p.getProveedorId());
		String res = null;
		em.getTransaction().begin();

		try {

			proveedordb.setNombre(p.getNombre());
			proveedordb.setRfc(p.getRfc());
			proveedordb.setNumCuenta(p.getNumCuenta());
			proveedordb.setTelefono(p.getTelefono());
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
		p = em.find(Proveedor.class, id);
		em.getTransaction().begin();

		try {
			em.remove(p);
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

		p = em.find(Proveedor.class, id);
		return p;
	}

	@Override
	public List mostrar() {

		List<Proveedor> lista = em.createQuery("from Proveedor").getResultList();
		return lista;
	}

}
