package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Inventario;
import com.entity.Producto;
import com.general.Metodos;

public class InventarioDao implements Metodos{

	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Inventario inventario=null;
	@Override
	public String guardar(Object oB) {
		inventario = (Inventario) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(inventario);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro inventario");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro inventario");
		}
		em.close();
		return resultado;	
	}

	@Override
	public String editar(Object oB) {
		inventario = (Inventario) oB;
		Inventario inventarioDb= em.find(Inventario.class, inventario.getInventarioId());
		Producto produc= em.find(Producto.class, inventario.getProdcuto().getProductoId() );
		String res= null;
		em.getTransaction().begin();
		try {
			inventarioDb.setProdcuto(produc);
			inventarioDb.setiStatus(inventario.getiStatus());
			inventarioDb.setiTotal(inventario.getiTotal());
						
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
		inventario =em.find(Inventario.class, id);
		em.getTransaction().begin();
		try {
			em.remove(inventario);
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
		inventario = em.find(Inventario.class, id);
		return inventario;
	}

	@Override
	public List mostrar() {
		List<Inventario> calis =em.createQuery("from Inventario").getResultList();
		return calis;
	}

}
