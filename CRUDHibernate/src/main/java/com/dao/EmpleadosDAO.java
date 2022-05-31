package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Empleados;
import com.entity.Clientes;
import com.general.Metodos;



public class EmpleadosDAO implements Metodos {
	//Carga los objetos (las clases definidads en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Empleados empleado = null;
	@Override
	public String guardar(Object ob) {
		empleado = (Empleados) ob;
		em.getTransaction().begin();
		String resultado=null;
		try { 
			em.persist(empleado);
			em.getTransaction().commit();
			resultado = "1";
	System.out.println("Empleado insertado");
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
    	 empleado = (Empleados) ob;
    	 Empleados empleadodb = em.find(Empleados.class, empleado.getEmpleadoId());
    	 String r = null;
    	 em.getTransaction().begin();
    	 try {
    		 empleadodb.setNombre(empleado.getNombre());
    		 empleadodb.setFechaRegistro(empleado.getFechaRegistro());
    		 empleadodb.setEdad(empleado.getEdad());
    		 empleadodb.setDireccion(empleado.getDireccion());
    		 empleadodb.setRol(empleado.getRol());
    		 empleadodb.setStatus(empleado.getStatus());
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
		empleado = em.find(Empleados.class, id);
		em.getTransaction().begin();
		try {
			em.remove(empleado);
			em.getTransaction().commit();
		System.out.println("Se ha eliminado la categoria");
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
		empleado = em.find(Empleados.class, id);
		return empleado;
	}


	@Override
	public List mostrar() {
		List<Empleados> ls = em.createQuery("from Empleados").getResultList();
	
		// TODO Auto-generated method stub
		return ls;
	}

}
