package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Clientes;

import com.general.Metodos;

public class ClientesDAO implements Metodos {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Clientes clientes = null;
	
	
	
	@Override
	public String guardar(Object ob) {
		clientes = (Clientes) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(clientes);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");	
		}em.close();	
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		clientes =(Clientes) ob;
		Clientes clientesdb = em.find(Clientes.class, clientes.getClientesId());
		String r = null;
		em.getTransaction().begin();
			
			try {
				clientesdb.setRfcCliente(clientes.getRfcCliente());
				clientesdb.setCorreo(clientes.getCorreo());
				
				em.getTransaction().commit();
				System.out.println("Editado correctamente");
				r = "1";	
			}catch(Exception e) {
				em.getTransaction().rollback();
				System.out.println("No se pued editar");
				r = e.getMessage();
			}
			return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		clientes = em.find(Clientes.class, id);
		em.getTransaction().begin();
		try {
			em.remove(clientes);
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
		clientes = em.find(Clientes.class, id);
		return clientes;
		}


	@Override
	public List mostrar() {
		List<Clientes> ls = em.createQuery("from clientes").getResultList();
		return ls;
	}
}
