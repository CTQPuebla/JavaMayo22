package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.Ventas;
import com.general.Metodos;

public class VentasDAO implements Metodos {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Ventas ventas = null;
	
	
	@Override
	public String guardar(Object ob) {
	
			ventas =(Ventas) ob;
			em.getTransaction().begin();
			String resultado = null;
			try {
				em.persist(ventas);
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
		ventas =(Ventas) ob;
		Ventas Ventadb = em.find(Ventas.class, ventas.getVentaId());
		String r = null;
		em.getTransaction().begin();
		try {
			Ventadb.setClientes(ventas.getClientes());
			Ventadb.setFechaVenta(ventas.getFechaVenta());
			Ventadb.setEmpleadoId(ventas.getEmpleadoId());
			Ventadb.setSubtotal(ventas.getSubtotal());
			Ventadb.setTotal(ventas.getTotal());
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
		    ventas = em.find(Ventas.class, id);
		     em.getTransaction().begin();
		     try {
		    	 em.remove(ventas);
		    	 em.getTransaction().commit();
		    	 System.out.println("Se ha eliminado correctamente");
		    	 r = "1";
		     }catch(Exception e) {
		    	 em.getTransaction().rollback();
		    	 System.out.println("No se pudo eliminar");
		    	 r = e.getMessage();
		     }
		      return r;	}
	@Override
	public Object buscar(int id) {
ventas = em.find(Ventas.class, id);
		
		return ventas;
	}
	
	
	@Override
	public List mostrar() {
List<Ventas> ls = em.createQuery("from Ventas").getResultList();
		
		return ls;
	}


}
