package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.DetalleVenta;
import com.general.Metodos;

public class DetalleVentaDAO implements Metodos {
	//Carga los objetos(las clases definidas en el persistence)
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
			//Carga toas las operaciones (insert, update, delete, select, contar, etc)
			EntityManager em = emf.createEntityManager();
			DetalleVenta detalleVenta = null;

	@Override
	public String guardar(Object ob) {
		detalleVenta =(DetalleVenta) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(detalleVenta);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("registro insertado");
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
		detalleVenta = (DetalleVenta) ob;
		DetalleVenta detalleVentadb = em.find(DetalleVenta.class, detalleVenta.getDetalleVentaId());
		//Producto pr = em.find(Producto.class, inventario.getProducto().getProductoId());
		String r= null;
		em.getTransaction().begin();
		try {
			detalleVentadb.setVentaId(detalleVenta.getDetalleVentaId());
			detalleVentadb.setProductoId(detalleVenta.getProductoId());
			detalleVentadb.setCantidad(detalleVenta.getCantidad());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r= null;
		detalleVenta = em.find(DetalleVenta.class, id);
		em.getTransaction().begin();
		try {
			em.remove(detalleVenta);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		detalleVenta = em.find(DetalleVenta.class, id);
		return detalleVenta;
	}

	@Override
	public List mostrar() {
		List<DetalleVenta> ls = em.createQuery("from DetalleVenta").getResultList();
		return ls;
	}
	
}
