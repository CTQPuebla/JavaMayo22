package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Empleado;
import com.general.Metodos;

public class EmpleadoDAO implements Metodos {

	//Carga los objetos(las clases definidas en el persistence)
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
		//Carga toas las operaciones (insert, update, delete, select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Empleado empleado = null;
		@Override
		public String guardar(Object ob) {
			empleado =(Empleado) ob;
			em.getTransaction().begin();
			String resultado = null;
			try {
				em.persist(empleado);
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
			empleado = (Empleado) ob;
			Empleado empleadodb = em.find(Empleado.class, empleado.getEmpleadoId());
			//Producto pr = em.find(Producto.class, inventario.getProducto().getProductoId());
			String r= null;
			em.getTransaction().begin();
			try {
				empleadodb.setNombre(empleado.getNombre());
				empleadodb.setFechaRegistro(empleado.getFechaRegistro());
				empleadodb.setEdad(empleado.getEdad());
				empleadodb.setDireccion(empleado.getDireccion());
				empleadodb.setRol(empleado.getRol());
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
			empleado = em.find(Empleado.class, id);
			em.getTransaction().begin();
			try {
				em.remove(empleado);
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
			empleado = em.find(Empleado.class, id);
			return empleado;
		}
		@Override
		public List mostrar() {
			List<Empleado> ls = em.createQuery("from Empleado").getResultList();
			return ls;
		}
		
}
