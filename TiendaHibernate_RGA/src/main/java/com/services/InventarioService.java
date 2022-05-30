package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.InventarioDAO;
import com.entity.Inventario;
import com.general.Estatus;

@Path("/inventario")
public class InventarioService{

	Inventario inventario = null;
	InventarioDAO inventarioDAO = null;
	
	@Path("/guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Estatus guardar(Inventario inventario) {
		Estatus estatus = new Estatus();
		inventarioDAO = new InventarioDAO();
		estatus.setOb(inventario);
		String respuesta = inventarioDAO.guardar(inventario);
		if (respuesta.equals("1")) {
			estatus.setMensaje("OK");
			estatus.setRespuesta(respuesta);
		} else {
			estatus.setMensaje("Fallo al guardar");
			estatus.setRespuesta(respuesta);
		}
		return estatus;
	}

	@Path("/mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Inventario> mostrar() {
		inventarioDAO = new InventarioDAO();
		return inventarioDAO.mostrar();
	}

	@Path("/actualizar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Estatus actualizar(Inventario inventario) {
		Estatus estatus = new Estatus();
		inventarioDAO = new InventarioDAO();
		estatus.setOb(inventario);
		String respuesta = inventarioDAO.editar(inventario);
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
	@Produces({ MediaType.APPLICATION_JSON })
	public Estatus eliminar(@PathParam("id") int id) {
		Estatus estatus = new Estatus();
		inventarioDAO = new InventarioDAO();
		String respuesta = inventarioDAO.eliminar(id);
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
	@Produces({ MediaType.APPLICATION_JSON })
	public Inventario buscarProducto(@PathParam("id") int id) {
		inventarioDAO = new InventarioDAO();
		return (Inventario) inventarioDAO.buscar(id);
	}
}
