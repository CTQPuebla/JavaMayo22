package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.ProPrecio;
import com.entity.Producto;
import com.general.Metodos;

public class ProPrecioDao implements Metodos{
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	ProPrecio proPre=null;
	@Override
	public String guardar(Object oB) {
		proPre = (ProPrecio) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(proPre);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro producto");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro producto");
		}
		em.close();
		return resultado;	
	}
	@Override
	public String editar(Object oB) {
		proPre = (ProPrecio) oB;
		ProPrecio proPreDb= em.find(ProPrecio.class, proPre.getProPreId());
		Producto produc= em.find(Producto.class, proPre.getProducto().getProductoId());
		String res= null;
		em.getTransaction().begin();
		try {
			proPreDb.setProducto(produc);
			proPreDb.setPpPrecio(proPre.getPpPrecio());;
			proPreDb.setPpFechaI(proPre.getPpFechaI());;
			proPreDb.setPpFechaF(proPre.getPpFechaF());;
			
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
		proPre =em.find(ProPrecio.class, id);
		em.getTransaction().begin();
		try {
			em.remove(proPre);
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
		proPre = em.find(ProPrecio.class, id);
		return proPre;
	}

	@Override
	public List mostrar() {
		List<ProPrecio> proPlis =em.createQuery("from ProPrecio").getResultList();
		return proPlis;
	}

}
