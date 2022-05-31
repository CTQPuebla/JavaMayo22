package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Proveedores;
import com.entity.Inventario;
import com.general.Metodos;



public class ProveedoresDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Proveedores proveedores = null;
	@Override
	public String guardar(Object ob) {
		proveedores = (Proveedores) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(proveedores);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Proveedor insertado");
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
    	 proveedores = (Proveedores) ob;
    	 Proveedores proveedoresdb = em.find(Proveedores.class, proveedores.getProveedorId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 proveedoresdb.setNombre(proveedores.getNombre());
    		 proveedoresdb.setRfc(proveedores.getRfc());
    		 proveedoresdb.setNumCuenta(proveedores.getNumCuenta());
    		 proveedoresdb.setTelefono(proveedores.getTelefono());
    		 em.getTransaction().commit();
    		 System.out.print("Editado correctamente");
    		 r = "1";
    	 }catch(Exception e) {
    		 em.getTransaction().rollback();
    		 System.out.println("No se puede editar");
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
		System.out.println("Se ha eliminado el proveedor");
		r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se puedo eliminar");
			r = e.getMessage();
	}
	return r;
}
	

	@Override
	public Object buscar(int id) {
		proveedores = em.find(Proveedores.class, id);
		return proveedores;
	}


	@Override
	public List mostrar() {
		List<Proveedores> ls = em.createQuery("from Proveedores").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}
