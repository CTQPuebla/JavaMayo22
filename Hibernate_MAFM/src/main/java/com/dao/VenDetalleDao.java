package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.Producto;
import com.entity.VenDetalle;
import com.entity.Venta;
import com.general.Metodos;

public class VenDetalleDao implements Metodos {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	VenDetalle venDet=null;
	@Override
	public String guardar(Object oB) {
		venDet = (VenDetalle) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(venDet);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro detalle de venta");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro detalle de venta");
		}
		em.close();
		return resultado;	
	}
	@Override
	public String editar(Object oB) {
		venDet = (VenDetalle) oB;
		VenDetalle venDetDb= em.find(VenDetalle.class, venDet.getvDetId());
		Venta venta= em.find(Venta.class, venDet.getVenta().getVentaId());
		Producto produc=em.find(Producto.class, venDet.getProducto().getProductoId());
		String res= null;
		em.getTransaction().begin();
		try {
			venDetDb.setVenta(venta);
			venDetDb.setProducto(produc);
			venDetDb.setVdCantidad(venDet.getVdCantidad());
			venDetDb.setVdImporte(venDet.getVdImporte());
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
		venDet =em.find(VenDetalle.class, id);
		em.getTransaction().begin();
		try {
			em.remove(venDet);
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
		venDet = em.find(Producto.class, id);
		return venDet;
	}

	@Override
	public List mostrar() {
		List<VenDetalle> venDlis =em.createQuery("from VenDetalle").getResultList();
		return venDlis;
	}
}
