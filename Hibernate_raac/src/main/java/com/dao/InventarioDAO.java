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
	Inventario inventario = null;

	@Override
	public String guardar(Object ob) {
		inventario = (Inventario) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(inventario);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception e){
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		inventario = (Inventario) ob;
		Inventario inventariodb = em.find(Inventario.class, inventario.getInventarioId());
		em.getTransaction().begin();
		String resultado = null;
		Productos pr = em.find(Productos.class, inventario.getProducto().getProductoId());
		try {
			inventariodb.setProducto(pr);
			inventariodb.setStock(inventario.getStock());
			inventariodb.setCaducidad(inventario.getCaducidad());
			inventariodb.setFechaResurtido(inventario.getFechaResurtido());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			resultado = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = null;
		inventario = em.find(Inventario.class,id);
		em.getTransaction().begin();
		try {
			em.remove(inventario);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado");
			resultado = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			resultado = e.getMessage();
		}
		
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		inventario = em.find(Inventario.class, id);
		return inventario;
	}

	@Override
	public List mostrar() {
		List<Inventario> ls = em.createQuery("from Inventario").getResultList();
		return ls;
	}

}
