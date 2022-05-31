package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Inventario;
import com.entity.Productos;
import com.general.Metodos;

public class InventarioDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	
	Inventario inv = null;

	@Override
	public String guardar(Object ob) {
		inv = (Inventario)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(inv);
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
		inv = (Inventario) ob;
		Inventario inventariodb = em.find(Inventario.class, inv.getInventarioId());
		Productos pr = em.find(Productos.class, inv.getProducto().getProductoId());
		String r = "";
		em.getTransaction().begin();
		try {
			inventariodb.setProducto(pr);
			inventariodb.setStock(inv.getStock());
			inventariodb.setCaducidad(inv.getCaducidad());
			inventariodb.setFechaResurtido(inv.getFechaResurtido());
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
		inv = em.find(Inventario.class, id);
		em.getTransaction().begin();
		try {
			em.remove(inv);
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
		inv = em.find(Inventario.class, id);
		return inv;
	}

	@Override
	public List mostrar() {
		List<Inventario> ls = em.createQuery("from Inventario").getResultList();
		return ls;
	}

}
