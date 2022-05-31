package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.Provedor;
import com.general.Metodos;

public class ProvedorDao implements Metodos {

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Provedor provedor=null;
	@Override
	public String guardar(Object oB) {
		provedor = (Provedor) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(provedor);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro Proveedor");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro Proveedor");
		}
		em.close();
		return resultado;	
	}

	@Override
	public String editar(Object oB) {
		provedor = (Provedor) oB;
		Provedor provedorDb= em.find(Provedor.class, provedor.getProvedorId());
		String res= null;
		em.getTransaction().begin();
		try {
			provedorDb.setpNombre(provedor.getpNombre());
			provedorDb.setpNumCuenta(provedor.getpNumCuenta());
			provedorDb.setpRfc(provedor.getpRfc());
			provedorDb.setpTelefono(provedor.getpTelefono());
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
		provedor =em.find(Provedor.class, id);
		em.getTransaction().begin();
		try {
			em.remove(provedor);
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
		provedor = em.find(Provedor.class, id);
		return provedor;
	}

	@Override
	public List mostrar() {
		List<Provedor> provlis =em.createQuery("from Provedor").getResultList();
		return provlis;
	}
}
