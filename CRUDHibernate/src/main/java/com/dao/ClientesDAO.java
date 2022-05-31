package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Clientes;
import com.general.Metodos;



public class ClientesDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Clientes cliente = null;
	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(cliente);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Cliente insertado");
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
    	 cliente = (Clientes) ob;
    	 Clientes clientedb = em.find(Clientes.class, cliente.getClienteId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 clientedb.setRfc(cliente.getRfc());
    		 clientedb.setCorreo(cliente.getCorreo());
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
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
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
		cliente = em.find(Clientes.class, id);
		return cliente;
	}


	@Override
	public List mostrar() {
		List<Clientes> ls = em.createQuery("from Clientes").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}
