package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categorias;
import com.entity.Empleados;
import com.entity.Productos;
import com.general.Metodos;

public class EmpleadosDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Empleados empleado = null;

	@Override
	public String guardar(Object ob) {
		empleado = (Empleados)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(empleado);
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
		empleado = (Empleados) ob;
		Empleados empleadodb = em.find(Empleados.class, empleado.getEmpleadoId());
		//Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
//			empleadodb.setCategoria(empleado);
//			empleadodb.setProveedorId(producto.getProveedorId());
//			empleadodb.setNombre(producto.getNombre());
//			empleadodb.setPresentacion(producto.getPresentacion());
//			empleadodb.setPrecio(producto.getPrecio());
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
		empleado = em.find(Empleados.class, id);
		em.getTransaction().begin();
		try {
			em.remove(empleado);
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
		empleado = em.find(Empleados.class, id);
		return empleado;
	}

	@Override
	public List mostrar() {
		List<Empleados> ls = em.createQuery("from Empleados").getResultList();
		return ls;
	}

}
