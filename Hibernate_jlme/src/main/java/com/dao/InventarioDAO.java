package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder.In;

import com.entity.Inventario;
import com.entity.Producto;
import com.general.Metodos;

public class InventarioDAO implements Metodos {

	// carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones(insert, update, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Inventario inv = null;

	@Override
	public String guardar(Object o) {

		inv = (Inventario) o;
		em.getTransaction().begin();
		String res = null;

		try {
			em.persist(inv); // este es el insert
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
		inv = (Inventario) o;
		Inventario inventariodb = em.find(Inventario.class, inv.getInvId());
		Producto p= em.find(Producto.class, inv.getProdId().getProductoId());
		String res = null;
		em.getTransaction().begin();

		try {

			inventariodb.setProdId(p);
			inventariodb.setStock(inv.getStock());
			inventariodb.setCaducidad(inv.getCaducidad());
			inventariodb.setFecResurtido(inv.getFecResurtido());
			
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
		inv = em.find(Inventario.class, id);
		em.getTransaction().begin();

		try {
			em.remove(inv);
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

		inv = em.find(Inventario.class, id);
		return inv;
	}

	@Override
	public List mostrar() {

		List<Inventario> lista = em.createQuery("from Inventario").getResultList();
		return lista;
	}
}
