package com.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Categorias;
import com.general.Metodos;

public class CategoriasDAO implements Metodos{
EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
EntityManager em = emf.createEntityManager();
Categorias categorias = null;

@Override
public String guardar(Object ob) {
	categorias =(Categorias) ob;
	em.getTransaction().begin();
	String resultado = null;
	try {
		em.persist(categorias);
		em.getTransaction().commit();
		resultado ="1";
		System.out.println("Registro insertado");
	}catch (Exception e) {
		em.getTransaction().rollback();
		resultado = e.getMessage();
		System.out.println("No se pudo insetar");
	}
	em.close();
	return resultado;
}
@Override
public String editar(Object ob) {
categorias =(Categorias) ob;
Categorias categoriasdb = em.find(Categorias.class, categorias.getCategoriaId());
String r = null;
em.getTransaction().begin();
try {
	categoriasdb.setDescripcion(categoriasdb.getDescripcion());
	em.getTransaction().commit();
	System.out.println("Editado correctamente");
	r = "1";
}catch(Exception e) {
	em.getTransaction().rollback();
	System.out.println("No se pudo editar");
	r = e.getMessage();
}
	return r;
	
}
@Override
public String eliminar(int id) {
	String r = null;
	categorias = em.find(Categorias.class, id);
	em.getTransaction().begin();
	try {
		em.remove(categorias);
		em.getTransaction().commit();
		System.out.println("Se ha eliminado el registro");
		r = "1";
	}catch (Exception c) {
		em.getTransaction().rollback();
		System.out.println("No se pudo eliminar");
		r = c.getMessage();
	}
	return r;
}


@Override
public Object buscar(int id) {
	categorias = em.find(Categorias.class, id);
	
	return categorias;
}
@Override
public List mostrar() {
	List<Categorias> ls = em.createQuery("from Categorias").getResultList();
	return ls;
}


}
