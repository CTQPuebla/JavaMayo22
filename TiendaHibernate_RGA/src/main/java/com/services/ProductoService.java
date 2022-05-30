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
import com.dao.ProductoDAO;
import com.entity.Categoria;
import com.entity.Producto;
import com.general.Estatus;

@Path("/producto")
public class ProductoService {
	
	Producto producto = null;
	ProductoDAO productoDAO = null;
	
	// CRUD
	@Path("/guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Estatus guardar(Producto producto) {
		Estatus estatus = new Estatus();
		productoDAO = new ProductoDAO();
		estatus.setOb(producto);
		String respuesta = productoDAO.guardar(producto);
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
	public List<Producto> mostrar() {
		productoDAO = new ProductoDAO();
		return productoDAO.mostrar();
	}

	@Path("/actualizar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Estatus actualizar(Producto producto) {
		Estatus estatus = new Estatus();
		productoDAO = new ProductoDAO();
		estatus.setOb(producto);
		String respuesta = productoDAO.editar(producto);
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
		productoDAO = new ProductoDAO();
		String respuesta = productoDAO.eliminar(id);
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
	public Producto buscarProducto(@PathParam("id") int id) {
		productoDAO = new ProductoDAO();
		return (Producto) productoDAO.buscar(id);
	}
}
