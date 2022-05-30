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
import com.general.Estatus;

@Path("/categoria")
public class CategoriaService {
	
	Categoria categoria = null;
	CategoriaDAO categoriaDAO = null;
	//CRUD
	@Path("/guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Estatus guardar(Categoria categoria) {
		Estatus estatus = new Estatus();
		categoriaDAO = new CategoriaDAO();
		estatus.setOb(categoria);
		String respuesta = categoriaDAO.guardar(categoria);
		if (respuesta.equals("1")) {
			estatus.setMensaje("OK");
			estatus.setRespuesta(respuesta);
		}else {
			estatus.setMensaje("Fallo al guardar");
			estatus.setRespuesta(respuesta);
		}
		return estatus;
	}
	
	@Path("/mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Categoria> mostrar(){
		categoriaDAO = new CategoriaDAO();
		return categoriaDAO.mostrar();
	}
	
	@Path("/actualizar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Estatus actualizar(Categoria categoria) {
		Estatus estatus = new Estatus();
		categoriaDAO = new CategoriaDAO();
		estatus.setOb(categoria);
		String respuesta = categoriaDAO.editar(categoria);
		if (respuesta.equals("1")) {
			estatus.setMensaje("OK");
			estatus.setRespuesta(respuesta);
		} else {
			estatus.setMensaje("Fallo al actualizar");
			estatus.setRespuesta(respuesta);
		}
		return estatus;
	}
	
	@Path("/eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Estatus eliminar(@PathParam("id") int id) {
		Estatus estatus = new Estatus();
		categoriaDAO = new CategoriaDAO();
		String respuesta = categoriaDAO.eliminar(id);
		if (respuesta.equals("1")) {
			estatus.setMensaje("OK");
			estatus.setRespuesta(respuesta);
		} else {
			estatus.setMensaje("Fallo al eliminar");
			estatus.setRespuesta(respuesta);
		}
		return estatus;
	}
	
	@Path("/buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Categoria buscarCategoria(@PathParam("id") int id) {
		categoriaDAO = new CategoriaDAO();
		return (Categoria) categoriaDAO.buscar(id);
	}
}
