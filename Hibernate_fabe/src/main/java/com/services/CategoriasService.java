package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CategoriasDAO;

import com.entity.Categorias;

import com.general.Status;



@Path("categoriass")
public class CategoriasService {
	
	Categorias categorias = null;
	CategoriasDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Categorias> mostrar(){
		dao = new CategoriasDAO();
		List<Categorias> list = dao.mostrar();
		System.out.println("datos"+list);
		return list;	
	}
	
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar (Categorias c) {
		System.out.println("cliente a guardar :"+c);
		Status state = new Status();
		state.setOb(c);
		
		dao = new CategoriasDAO();
		String res = dao.guardar(c);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}

	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON}) 
	public Status eliminar (@PathParam("id")int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new CategoriasDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar");
			state.setRespuesta(res);
		}
		return state;	
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar (Categorias c) {
	Status state = new Status();
	state.setOb(c);
	
	dao = new CategoriasDAO();
	String res = dao.editar(c);
	
	if(res.equals("1")) {
		state.setMensaje("Actualizado correctamente");
		state.setRespuesta(res);
	}else {
		state.setMensaje("No fue posible actualizar");
		state.setRespuesta(res);
	}
		
		return state;
		
	}
	
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Categorias buscar (@PathParam("id") int id) {
		dao = new CategoriasDAO();
		categorias = (Categorias)dao.buscar(id);
		System.out.println("Se encontro el registro");
		
		return categorias;
		
	
	}
	
	
}
