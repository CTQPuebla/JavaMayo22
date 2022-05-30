package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Producto;
import com.general.Metodos;

public class ProductoDAO implements Metodos{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Producto producto = null;
	
	@Override
	public String guardar(Object ob) {
		producto = (Producto) ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(producto);
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
		producto = (Producto) ob;
		Producto productodb = em.find(Producto.class, producto.getProductoId());
		em.getTransaction().begin();
		String resultado = "";
		try {
			productodb.setCategoriaId(producto.getCategoriaId());
			productodb.setProveedorId(producto.getProveedorId());
			productodb.setNombre(producto.getNombre());
			productodb.setPresentacion(producto.getPresentacion());
			productodb.setPrecio(producto.getPrecio());
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
		producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
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
		return em.find(Producto.class, id);
	}

	@Override
	public List mostrar() {
		return em.createQuery("from Producto").getResultList();
	}

}
