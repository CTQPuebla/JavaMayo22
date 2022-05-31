package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Categorias;
import com.entity.Productos;
import com.general.Metodos;

public class ProductosDAO implements Metodos{
	//carga los objetos (las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//cargas todas las operaciones (insert,update,delete,select,contar,etc)
	EntityManager em = emf.createEntityManager();
	Productos producto = null;

	@Override
	public String guardar(Object ob) {
		producto = (Productos)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(producto);
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
		producto = (Productos) ob;
		Productos productodb = em.find(Productos.class, producto.getProductoId());
		Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
			productodb.setCategoria(cat);
			productodb.setProveedorId(producto.getProveedorId());
			productodb.setNombre(producto.getNombre());
			productodb.setPresentacion(producto.getPresentacion());
			productodb.setPrecio(producto.getPrecio());
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
		producto = em.find(Productos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
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
		producto = em.find(Productos.class, id);
		return producto;
	}

	@Override
	public List mostrar() {
		List<Productos> ls = em.createQuery("from Productos").getResultList();
		return ls;
	}
	
	

}
