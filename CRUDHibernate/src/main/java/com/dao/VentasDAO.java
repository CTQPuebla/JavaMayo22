package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Ventas;
import com.general.Metodos;



public class VentasDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Ventas ventas = null;
	@Override
	public String guardar(Object ob) {
		ventas = (Ventas) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(ventas);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Venta insertada");
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
    	 ventas = (Ventas) ob;
    	 Ventas ventasdb = em.find(Ventas.class, ventas.getVentasId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 ventasdb.setEmpleado(ventas.getEmpleado());
    		 ventasdb.setCliente(ventas.getCliente());
    		 ventasdb.setDetallesVentas(ventas.getDetallesVentas());
    		 ventasdb.setFechaVenta(ventas.getFechaVenta());
    		 ventasdb.setSubtotal(ventas.getSubtotal());
    		
    		 
    		 em.getTransaction().commit();
    		 System.out.print("Editado correctamente");
    		 r = "1";
    	 }catch(Exception e) {
    		 em.getTransaction().rollback();
    		 System.out.println("No se puede editar");
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
		System.out.println("Se ha eliminado la venta");
		r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se puedo eliminar");
			r = e.getMessage();
	}
	return r;
}
	

	@Override
	public Object buscar(int id) {
		ventas = em.find(Ventas.class, id);
		
		return ventas;
	}


	@Override
	public List mostrar() {
		List<Ventas> ls = em.createQuery("from Ventas").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}