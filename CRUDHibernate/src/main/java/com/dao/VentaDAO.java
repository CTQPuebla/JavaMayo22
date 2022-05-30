package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Venta;
import com.general.Metodos;

public class VentaDAO implements Metodos{
	//Carga los objetos(las clases definidas en el persistence)
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
			//Carga toas las operaciones (insert, update, delete, select, contar, etc)
			EntityManager em = emf.createEntityManager();
			Venta venta = null;

	@Override
	public String guardar(Object ob) {
		venta =(Venta) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(venta);
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
		venta = (Venta) ob;
		Venta ventadb = em.find(Venta.class, venta.getVentaId());
		//Producto pr = em.find(Producto.class, inventario.getProducto().getProductoId());
		String r= null;
		em.getTransaction().begin();
		try {
			ventadb.setClienteId(venta.getClienteId());
			ventadb.setEmpleadoId(venta.getEmpleadoId());
			ventadb.setFechaVenta(venta.getFechaVenta());
			ventadb.setSubTotal(venta.getSubTotal());
			ventadb.setTotal(venta.getTotal());
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
		venta = em.find(Venta.class, id);
		em.getTransaction().begin();
		try {
			em.remove(venta);
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
		venta = em.find(Venta.class, id);
		return venta;
	}

	@Override
	public List mostrar() {
		List<Venta> ls = em.createQuery("from Venta").getResultList();
		return null;
	}

}
