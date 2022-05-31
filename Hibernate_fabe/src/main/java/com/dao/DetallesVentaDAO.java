package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.DetallesVenta;
import com.general.Metodos;

public class DetallesVentaDAO implements Metodos {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	DetallesVenta detallesVenta = null;

	@Override
	public String guardar(Object ob) {
		detallesVenta =(DetallesVenta) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(detallesVenta);
			em.getTransaction().commit();
			resultado ="1";
			System.out.println("Registro insertado");
		}catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No se pudo insetar");
		}
		em.close();
		return resultado;
		
		
	}

	@Override
	public String editar(Object ob) {
		detallesVenta =(DetallesVenta) ob;
		DetallesVenta detallesVentadb = em.find(DetallesVenta.class, detallesVenta.getDetalleVentaId());
		String r = null;
		em.getTransaction().begin();
		try {
			detallesVentadb.setVentas(detallesVenta.getVentas());
			detallesVentadb.setProductos(detallesVenta.getProductos());
			detallesVentadb.setCantidad(detallesVenta.getCantidad());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
			return r;
			
	}

	@Override
	public String eliminar(int id) {
		 String r = null;
	    detallesVenta = em.find(DetallesVenta.class, id);
	     em.getTransaction().begin();
	     try {
	    	 em.remove(detallesVenta);
	    	 em.getTransaction().commit();
	    	 System.out.println("Se ha eliminado correctamente");
	    	 r = "1";
	     }catch(Exception e) {
	    	 em.getTransaction().rollback();
	    	 System.out.println("No se pudo eliminar");
	    	 r = e.getMessage();
	     }
	      return r;
			}
	

	@Override
	public Object buscar(int id) {
		detallesVenta = em.find(DetallesVenta.class, id);
		
		return detallesVenta;
	}
	

	@Override
	public List mostrar() {
		List<DetallesVenta> ls = em.createQuery("from Detalles_Venta").getResultList();
		
		return ls;
	}
	

}
