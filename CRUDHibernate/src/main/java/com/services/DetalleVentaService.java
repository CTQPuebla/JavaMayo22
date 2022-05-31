package com.services;

import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.DetallesVentasDAO;
import com.entity.DetallesVentas;
import com.general.Status;


@Path("detallesventas/")
public class DetalleVentaService {

	DetallesVentas detallesVentas = null; // Modelo de datos
	DetallesVentasDAO dao = null; // Objeto de acceso a datos

	//guardar
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(DetallesVentas c) {
		System.out.println("Detalles de ventas a guardar: "+c);
		Status state = new Status();
		state.setOb(c);

		dao = new DetallesVentasDAO();
		String res = dao.guardar(c);

		if (res.equals("1")) {
			state.setMensaje("Guardado Exitosamente");
		} else {
			state.setMensaje("No fue posible guardar");
		}
		state.setRespuesta(res);
		return state;
	}
		
	
	@Path("mostrar")
	@GET //para operaciones de solo lectura
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesVentas> mostrar(){		
		dao = new DetallesVentasDAO();
		List<DetallesVentas> list = dao.mostrar();
		System.out.println("datos: "+list);
		return list;
	}
	
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(DetallesVentas c) {
		Status state = new Status();
		state.setOb(c);
		dao = new DetallesVentasDAO();
		String res = dao.editar(c);
		if (res.equals("1")) {
			state.setMensaje("Actualizado Exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible actualizar");
			state.setRespuesta(res);
		}
		
		return state;
	}
	
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public DetallesVentas buscar(@PathParam("id")int id) {		
		dao = new DetallesVentasDAO();
		detallesVentas = (DetallesVentas) dao.buscar(id);
		System.out.println("Si existe el registro");		
		return detallesVentas;
	}
	
	
	
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		dao = new DetallesVentasDAO();
		String res = dao.eliminar(id);
		if (res.equals("1")) {
			state.setMensaje("Eliminado Exitosamente");
			state.setRespuesta(res);
		} else {
			state.setMensaje("No fue posible eliminar");
			state.setRespuesta(res);
		}
		
		return state;		
	}

}