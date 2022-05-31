package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.Producto;
import com.general.Metodos;

public class ProductoDao implements Metodos{
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Producto producto=null;
	@Override
	public String guardar(Object oB) {
		producto = (Producto) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(producto);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro producto");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro producto");
		}
		em.close();
		return resultado;	
	}
	@Override
	public String editar(Object oB) {
		producto = (Producto) oB;
		Producto productoDb= em.find(Producto.class, producto.getProductoId());
		Categoria categori= em.find(Categoria.class, producto.getCategori().getCategoriaId());
		String res= null;
		em.getTransaction().begin();
		try {
			productoDb.setProevedorId(producto.getProevedorId());
			productoDb.setCategori(categori);
			productoDb.setPrNombre(producto.getPrNombre());;
			productoDb.setPrUniMed(producto.getPrUniMed());;
			productoDb.setPrCant(producto.getPrCant());
			em.getTransaction().commit();
			System.out.println("Registor editado");
			res="1";
			
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se actualizo registro");
			res =ex.getMessage();
		}
		return res;
	}
	@Override
	public String eliminar(int id) {
		String res= null;
		producto =em.find(Producto.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
			em.getTransaction().commit();
			System.out.println("Se elimino registro");
			res="1";
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se puedo eliminar");
			res = "1";
		}
		return res;
	}
	@Override
	public Object buscar(int id) {
		producto = em.find(Producto.class, id);
		return producto;
	}

	@Override
	public List mostrar() {
		List<Producto> calis =em.createQuery("from Producto").getResultList();
		return calis;
	}
	
}
