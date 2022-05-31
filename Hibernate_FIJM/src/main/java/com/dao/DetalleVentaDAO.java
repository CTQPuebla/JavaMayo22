package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.DetalleVenta;
import com.general.Metodos;

public class DetalleVentaDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	DetalleVenta detalle = null;

	@Override
	public String guardar(Object ob) {
		detalle = (DetalleVenta)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(detalle);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No pudo insertar");
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		detalle = (DetalleVenta) ob;
		DetalleVenta detalledb = em.find(DetalleVenta.class, detalle.getTicketId());
		//Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
//			detalledb.setCategoria(cat);
//			detalledb.setProveedorId(producto.getProveedorId());
//			detalledb.setNombre(producto.getNombre());
//			detalledb.setPresentacion(producto.getPresentacion());
//			detalledb.setPrecio(producto.getPrecio());
			em.getTransaction().commit();
			r = "1";
		}catch(Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = ex.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = "";
		detalle = em.find(DetalleVenta.class, id);
		em.getTransaction().begin();
		try {
			em.remove(detalle);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch(Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = ex.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		detalle = em.find(DetalleVenta.class, id);
		return detalle;
	}

	@Override
	public List mostrar() {
		List<DetalleVenta> ls = em.createQuery("from DetalleVenta").getResultList();
		return ls;
	}

}
