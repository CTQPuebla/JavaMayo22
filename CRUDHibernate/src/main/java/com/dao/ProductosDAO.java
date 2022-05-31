package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Productos;
import com.general.Metodos;



public class ProductosDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Productos producto = null;
	@Override
	public String guardar(Object ob) {
		producto = (Productos) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(producto);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Producto insertado");
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
    	 producto = (Productos) ob;
    	 Productos productosdb = em.find(Productos.class, producto.getProductoId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 productosdb.setCategoria(producto.getCategoria());
    		 productosdb.setNombre(producto.getNombre());
    		 productosdb.setPresentacion(producto.getPresentacion());
    		 productosdb.setPrecio(producto.getPrecio());
    		 productosdb.setProveedores(producto.getProveedores());
    		
    		 
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
		producto = em.find(Productos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(producto);
			em.getTransaction().commit();
		System.out.println("Se ha eliminado el producto");
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
		producto = em.find(Productos.class, id);
		
		return producto;
	}


	@Override
	public List mostrar() {
		List<Productos> ls = em.createQuery("from Productos").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}