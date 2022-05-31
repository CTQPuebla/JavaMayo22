package com.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Categorias;

import com.general.Metodos;



public class CategoriasDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Categorias categoria = null;
	@Override
	public String guardar(Object ob) {
		categoria = (Categorias) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(categoria);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Categoria insertada");
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
    	 categoria = (Categorias) ob;
    	 Categorias categoriadb = em.find(Categorias.class, categoria.getCategoriaId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 categoriadb.setDescripcion(categoria.getDescripcion());
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
		categoria = em.find(Categorias.class, id);
		em.getTransaction().begin();
		try {
			em.remove(categoria);
			em.getTransaction().commit();
		System.out.println("Se ha eliminado la categoria");
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
		categoria = em.find(Categorias.class, id);
		return categoria;
	}


	@Override
	public List mostrar() {
		List<Categorias> ls = em.createQuery("from Categorias").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}

