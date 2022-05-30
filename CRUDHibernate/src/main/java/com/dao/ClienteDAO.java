package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cliente;
import com.general.Metodos;

public class ClienteDAO implements Metodos {
	//Carga los objetos(las clases definidas en el persistence)
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
			//Carga toas las operaciones (insert, update, delete, select, contar, etc)
			EntityManager em = emf.createEntityManager();
			Cliente cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente =(Cliente) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(cliente);
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
		cliente = (Cliente) ob;
		Cliente clientedb = em.find(Cliente.class, cliente.getClienteId());
		//Producto pr = em.find(Producto.class, inventario.getProducto().getProductoId());
		String r= null;
		em.getTransaction().begin();
		try {
			clientedb.setRfc(cliente.getRfc());
			clientedb.setCorreo(cliente.getCorreo());
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
		cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
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
		cliente = em.find(Cliente.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Cliente> ls = em.createQuery("from Cliente").getResultList();
		return ls;
	}

}
