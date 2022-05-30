package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.Productos;
import com.general.Metodos;

public class ProductosDAO implements Metodos {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Productos productos = null;
	
	
	@Override
	public String guardar(Object ob) {
		productos = (Productos) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(productos);
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
		productos = (Productos) ob;
		Productos productosdb = em.find(Productos.class, productos.getProductoId());
		em.getTransaction().begin();
		String resultado = null;
		Categoria ca = em.find(Categoria.class, productos.getCategoria().getCategoriaId());
		try {
			productosdb.setCategoria(ca);
			productosdb.setProveedorId(productos.getProveedorId());
			productosdb.setNombre(productos.getNombre());
			productosdb.setPresentacion(productos.getPresentacion());
			productosdb.setPrecio(productos.getPrecio());
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
		productos = em.find(Productos.class,id);
		em.getTransaction().begin();
		try {
			em.remove(productos);
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
		productos = em.find(Productos.class, id);
		return productos;
	}

	@Override
	public List mostrar() {
		List<Productos> ls = em.createQuery("from Productos").getResultList();
		return ls;
	}

}
