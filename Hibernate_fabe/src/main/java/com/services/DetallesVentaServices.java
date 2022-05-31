package com.services;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.DetallesVentaDAO;
import com.entity.DetallesVenta;
import com.general.Status;


@Path("detallesVenta")
public class DetallesVentaServices {
	
	DetallesVenta detallesVenta = null;
	DetallesVentaDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesVenta> mostrar(){
		dao = new DetallesVentaDAO();
		List<DetallesVenta> list = dao.mostrar();
		System.out.println("datos"+list);
		return list;	
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar (DetallesVenta i) {
		System.out.println("cliente a guardar :"+i);
		Status state = new Status();
		state.setOb(i);
		
		dao = new DetallesVentaDAO();
		String res = dao.guardar(i);
		
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
		
		dao = new DetallesVentaDAO();
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
	public Status editar (DetallesVenta i) {
	Status state = new Status();
	state.setOb(i);
	
	dao = new DetallesVentaDAO();
	String res = dao.editar(i);
	
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
	public DetallesVenta buscar (@PathParam("id") int id) {
		dao = new DetallesVentaDAO();
		detallesVenta = (DetallesVenta)dao.buscar(id);
		System.out.println("Se encontro el registro");
		
		return detallesVenta;
		
	}
	}
	



