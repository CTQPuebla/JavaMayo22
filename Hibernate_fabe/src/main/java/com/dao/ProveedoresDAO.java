package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Productos;
import com.entity.Proveedores;
import com.general.Metodos;

public class ProveedoresDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Proveedores proveedores = null;

	
	@Override
	public String guardar(Object ob) {
		proveedores = (Proveedores) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(proveedores);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");	
		}em.close();	
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		proveedores =(Proveedores) ob;
		Proveedores proveedoresdb = em.find(Proveedores.class, proveedores.getProductosId());
		String r = null;
		em.getTransaction().begin();
			
			try {
				proveedoresdb.setNombreProveedor(proveedores.getNombreProveedor());
				proveedoresdb.setRfcProveedores(proveedores.getRfcProveedores());
				proveedoresdb.setNumCuenta(proveedores.getNumCuenta());
				proveedoresdb.setTelefono(proveedores.getNumCuenta());
				
				em.getTransaction().commit();
				System.out.println("Editado correctamente");
				r = "1";	
			}catch(Exception e) {
				em.getTransaction().rollback();
				System.out.println("No se pued editar");
				r = e.getMessage();
			}
			return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		proveedores = em.find(Proveedores.class, id);
		em.getTransaction().begin();
		try {
			em.remove(proveedores);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado correctamente");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();	
		}
		return r;	}

	@Override
	public Object buscar(int id) {
		proveedores= em.find(Proveedores.class, id);
		return proveedores;
		}
	

	@Override
	public List mostrar() {
		List<Proveedores> ls = em.createQuery("from Proveedores").getResultList();
		return ls;
	}
	}


