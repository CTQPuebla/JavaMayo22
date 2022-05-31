package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Proveedores;
import com.general.Metodos;

public class ProveedoresDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Proveedores proveedor = null;

	@Override
	public String guardar(Object ob) {
		proveedor = (Proveedores)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(proveedor);
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
		proveedor = (Proveedores) ob;
		Proveedores proveedordb = em.find(Proveedores.class, proveedor.getProveedorId());
		//Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
//			proveedor.setCategoria(cat);
//			proveedor.setProveedorId(producto.getProveedorId());
//			proveedor.setNombre(producto.getNombre());
//			proveedor.setPresentacion(producto.getPresentacion());
//			proveedor.setPrecio(producto.getPrecio());
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
		proveedor = em.find(Proveedores.class, id);
		em.getTransaction().begin();
		try {
			em.remove(proveedor);
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
		proveedor = em.find(Proveedores.class, id);
		return proveedor;
	}

	@Override
	public List mostrar() {
		List<Proveedores> ls = em.createQuery("from Proveedores").getResultList();
		return ls;
	}

}
