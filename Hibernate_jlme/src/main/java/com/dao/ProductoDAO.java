package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.Producto;
import com.entity.Proveedor;
import com.general.Metodos;

public class ProductoDAO implements Metodos {

	// carga los objetos(las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones(insert, update, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Producto p = null;

	@Override
	public String guardar(Object o) {

		p = (Producto) o;
		em.getTransaction().begin();
		String res = null;

		try {
			em.persist(p); //este es el insert
			em.getTransaction().commit();
			res = "1";

		} catch (Exception ex) {
			em.getTransaction().rollback();
			res = ex.getMessage();
			System.out.println("Hubo un error al añadir el registro");
		}
		em.close();
		return res;
	}

	@Override
	public String actualizar(Object o) {
		p = (Producto) o;
		Producto productodb = em.find(Producto.class , p.getProductoId());
		Categoria cat = em.find(Categoria.class, p.getCat().getCatId());
		Proveedor prov = em.find(Proveedor.class, p.getProv().getProveedorId());
		String res = null;
		em.getTransaction().begin();
		
		try {
			
			productodb.setProv(prov);
			productodb.setCat(cat);
			productodb.setNombre(p.getNombre());
			productodb.setPresentacion(p.getPresentacion());
			productodb.setPrecio(p.getPrecio());
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
		p = em.find(Producto.class, id);
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
		
		p = em.find(Producto.class, id);
		return p;
	}

	@Override
	public List mostrar() {
		
		List<Producto> lista = em.createQuery("from Producto").getResultList();
		return lista;
	}

}
