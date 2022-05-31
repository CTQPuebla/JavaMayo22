package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Clientes;
import com.general.Metodos;

public class ClientesDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	
	Clientes cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente = (Clientes)ob;
		em.getTransaction().begin();
		String resultado = "";
		try {
			em.persist(cliente);
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
		cliente = (Clientes) ob;
		Clientes productodb = em.find(Clientes.class, cliente.getClienteId());
		//Categorias cat = em.find(Categorias.class, producto.getCategoria().getIdCategoria());
		
		String r = "";
		em.getTransaction().begin();
		try {
//			productodb.setCategoria(cliente);
//			productodb.setProveedorId(cliente.getProveedorId());
//			productodb.setNombre(cliente.getNombre());
//			productodb.setPresentacion(cliente.getPresentacion());
//			productodb.setPrecio(cliente.getPrecio());
//			em.getTransaction().commit();
//			r = "1";
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
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
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
		cliente = em.find(Clientes.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Clientes> ls = em.createQuery("from Clientes").getResultList();
		return ls;
	}
	
	

}
