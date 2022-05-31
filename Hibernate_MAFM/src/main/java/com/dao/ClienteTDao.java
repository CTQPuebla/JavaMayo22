package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categoria;
import com.entity.ClienteT;
import com.general.Metodos;

public class ClienteTDao implements Metodos {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	ClienteT clienteT=null;
	@Override
	public String guardar(Object oB) {
		clienteT = (ClienteT) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(clienteT);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro cliente");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro cliente");
		}
		em.close();
		return resultado;	
	}

	@Override
	public String editar(Object oB) {
		clienteT = (ClienteT) oB;
		ClienteT clienteTDb= em.find(ClienteT.class, clienteT.getClienteTId());
		String res= null;
		em.getTransaction().begin();
		try {
			clienteTDb.setCtName(clienteT.getCtName());;
			clienteTDb.setCtEmail(clienteT.getCtEmail());
			clienteTDb.setCtRfc(clienteT.getCtRfc());
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
		clienteT =em.find(ClienteT.class, id);
		em.getTransaction().begin();
		try {
			em.remove(clienteT);
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
		clienteT = em.find(ClienteT.class, id);
		return clienteT;
	}

	@Override
	public List mostrar() {
		List<ClienteT> calis =em.createQuery("from CleinteT").getResultList();
		return calis;
	}

}

