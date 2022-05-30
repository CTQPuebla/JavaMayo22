package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CategoriaDAO;
import com.entity.Categoria;
import com.general.Status;


@Path("categoria")
public class CategoriaService {

	Categoria categoria =  null;
	CategoriaDAO dao= null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Categoria> mostrar(){
		dao = new CategoriaDAO();
		List<Categoria> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Categoria c) {
		System.out.println("Categoria a guardar:" +c);
		Status state = new Status();
		state.setOb(c);
		
		dao =  new CategoriaDAO();
		String resultado = dao.guardar(c);
		
		if (resultado.contentEquals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(resultado);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(resultado);
		}
		return state;
	}
	
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao= new CategoriaDAO();
		String resultado = dao.eliminar(id);
		
		if(resultado.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(resultado);
		}else {
			state.setMensaje("No fue posible eliminar exitosamente");
			state.setRespuesta(resultado);
		}
		return state;
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Categoria c) {
		Status state =  new Status();
		state.setOb(c);
		
		dao = new CategoriaDAO();
		String resultado = dao.editar(c);
		
		if(resultado.contentEquals("1")) {
			state.setMensaje("Actualizado exitosamente");
			state.setRespuesta(resultado);
		}else {
			state.setMensaje("No fue posible actualizar");
			state.setRespuesta(resultado);
		}
		return state;
	}
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Categoria buscar(@PathParam("id") int id) {
		dao = new CategoriaDAO();
		categoria = (Categoria) dao.buscar(id);
		System.out.println("Se encontro el producto");
		return categoria;
	}
}
