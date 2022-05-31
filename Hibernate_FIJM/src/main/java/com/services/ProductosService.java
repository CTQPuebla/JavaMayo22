package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductosDAO;
import com.entity.Productos;
import com.general.Status;

@Path("productos")
public class ProductosService {
	
	Productos producto = null;
	ProductosDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Productos> mostrar(){
		dao = new ProductosDAO();
		List<Productos> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos p) {
		System.out.println("Producto a guardar: " + p);
		Status state = new Status();
		state.setOb(p);
		
		dao = new ProductosDAO();
		String res = dao.guardar(p);
		
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
	public Status eliminar(@PathParam("id")int id) {
		Status state = new Status();
		
		dao = new ProductosDAO();
		String res = dao.eliminar(id);
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Productos p) {
		Status state = new Status();
		state.setOb(p);
		
		dao = new ProductosDAO();
		String res = dao.editar(p);
		
		if(res.equals("1")) {
			state.setMensaje("Actualizado correctamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id")int id) {
		dao = new ProductosDAO();
		producto = (Productos) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return producto;
	}

}
