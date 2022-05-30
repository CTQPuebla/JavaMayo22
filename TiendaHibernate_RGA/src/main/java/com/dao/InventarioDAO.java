package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.Inventario;
import com.entity.Producto;
import com.general.Metodos;

public class InventarioDAO implements Metodos{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Inventario inventario = null;
	
	@Override
	public String guardar(Object ob) {
		inventario = (Inventario) ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(inventario);
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
		inventario = (Inventario) ob;
		Inventario inventariodb = em.find(Inventario.class, inventario.getInventarioId());
		Producto productodb = em.find(Producto.class, inventario.getProductoId().getProductoId());
		em.getTransaction().begin();
		String resultado = "";
		try {
			inventariodb.setProductoId(inventario.getProductoId());
			inventariodb.setStock(inventario.getStock());
			inventariodb.setCaducidad(inventario.getCaducidad());
			inventariodb.setFechaResurtido(inventario.getFechaResurtido());
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
		inventario = em.find(Inventario.class, id);
		em.getTransaction().begin();
		try {
			em.remove(inventario);
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
		return em.find(Inventario.class, id);
	}

	@Override
	public List mostrar() {
		return em.createQuery("from Inventario").getResultList();
	}
	
}
