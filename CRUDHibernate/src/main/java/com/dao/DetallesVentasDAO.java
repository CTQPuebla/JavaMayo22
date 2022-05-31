package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.DetallesVentas;
import com.entity.Productos;
import com.general.Metodos;



public class DetallesVentasDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	DetallesVentas detallesVentas = null;
	@Override
	public String guardar(Object ob) {
		detallesVentas = (DetallesVentas) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(detallesVentas);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Detalles de Ventas insertado");
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
    	 detallesVentas = (DetallesVentas) ob;
    	 
    	 DetallesVentas detallesVentasdb = em.find(DetallesVentas.class, detallesVentas.getDetallesVentasId());
    	 Productos pr=em.find(Productos.class, detallesVentas.getProducto().getProductoId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 detallesVentasdb.setProducto(pr);
    		 detallesVentasdb.setVentasId(detallesVentas.getVentasId());
    		 detallesVentasdb.setCantidad(detallesVentas.getCantidad());
    		
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
		detallesVentas = em.find(DetallesVentas.class, id);
		em.getTransaction().begin();
		try {
			em.remove(detallesVentas);
			em.getTransaction().commit();
		System.out.println("Se ha eliminado el inventario");
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
		detallesVentas = em.find(DetallesVentas.class, id);
		return detallesVentas;
	}


	@Override
	public List mostrar() {
		List<DetallesVentas> ls = em.createQuery("from DetallesVentas").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}
