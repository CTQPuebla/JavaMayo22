package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Producto;
import com.general.Metodos;

public class ProductoDAO implements Metodos {
	
	//Carga los objetos(las clases definidas en el persistence)
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
		//Carga toas las operaciones (insert, update, delete, select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Producto producto = null;
	@Override
	public String guardar(Object ob) {
		producto =(Producto) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(producto);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close(); //Es importante cerrar el EntityManager para liberar memoria
		return resultado;
	}
	@Override
	public String editar(Object ob) {
		producto = (Producto) ob;
		Producto productodb = em.find(Producto.class, producto.getProductoId());
		String r= null;
		em.getTransaction().begin();
		try {
			productodb.setCategoria(producto.getCategoria());
			productodb.setProveedorId(producto.getProveedorId());
			productodb.setNombre(producto.getNombre());
			productodb.setPresentacion(producto.getPresentacion());
			productodb.setPrecio(producto.getPrecio());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public String eliminar(int id) {
		String r= null;
		producto = em.find(Producto.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public Object buscar(int id) {
		producto = em.find(Producto.class, id);
		return producto;
	}
	@Override
	public List mostrar() {
		List<Producto> ls = em.createQuery("from Producto").getResultList();
		return ls;
	}

}
