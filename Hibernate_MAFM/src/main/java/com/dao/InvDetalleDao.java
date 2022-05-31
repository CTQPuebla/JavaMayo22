package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.InvDetalle;
import com.entity.Inventario;
import com.general.Metodos;

public class InvDetalleDao implements Metodos{
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	InvDetalle invDetalle=null;
	@Override
	public String guardar(Object oB) {
		invDetalle = (InvDetalle) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(invDetalle);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro categoria");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro categoria");
		}
		em.close();
		return resultado;	
	}

	@Override
	public String editar(Object oB) {
		invDetalle = (InvDetalle) oB;
		InvDetalle invDetalleDb= em.find(InvDetalle.class, invDetalle.getiDetalleId());
		Inventario invent=em.find(Inventario.class, invDetalle.getInventario().getInventarioId());
		String res= null;
		em.getTransaction().begin();
		try {
			invDetalleDb.setInventario(invent);
			invDetalleDb.setIdetCaducidad(invDetalle.getIdetCaducidad());
			invDetalleDb.setIdetCantidad(invDetalle.getIdetCantidad());
			invDetalleDb.setIdetFecha(invDetalle.getIdetFecha());
			invDetalleDb.setIdetMonv(invDetalle.getIdetMonv());
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
		invDetalle =em.find(InvDetalle.class, id);
		em.getTransaction().begin();
		try {
			em.remove(invDetalle);
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
		invDetalle = em.find(InvDetalle.class, id);
		return invDetalle;
	}

	@Override
	public List mostrar() {
		List<InvDetalle> invDlis =em.createQuery("from InvDetalle").getResultList();
		return invDlis;
	}

}
