package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categorias;
import com.entity.Productos;
import com.entity.Venta;
import com.general.Metodos;

public class VentaDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Venta venta = null;

	@Override
	public String guardar(Object ob) {
		venta = (Venta)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(venta);
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
		venta = (Venta) ob;
		Venta ventadb = em.find(Venta.class, venta.getVentaId());
		//Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
//			ventadb.setCategoria(cat);
//			ventadb.setProveedorId(producto.getProveedorId());
//			ventadb.setNombre(producto.getNombre());
//			ventadb.setPresentacion(producto.getPresentacion());
//			ventadb.setPrecio(producto.getPrecio());
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
		venta = em.find(Venta.class, id);
		em.getTransaction().begin();
		try {
			em.remove(venta);
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
		venta = em.find(Venta.class, id);
		return venta;
	}

	@Override
	public List mostrar() {
		List<Venta> ls = em.createQuery("from Venta").getResultList();
		return ls;
	}

}
