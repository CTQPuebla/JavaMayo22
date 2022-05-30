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
import com.general.Status;

@Path("inventario")
public class InventarioService {

	Inventario inventario =  null;
	InventarioDAO dao= null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Inventario> mostrar(){
		dao = new InventarioDAO();
		List<Inventario> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	

	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Inventario i) {
		System.out.println("Inventario a guardar:" +i);
		Status state = new Status();
		state.setOb(i);
		
		dao =  new InventarioDAO();
		String resultado = dao.guardar(i);
		
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
		
		dao= new InventarioDAO();
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
	public Status editar(Inventario i) {
		Status state =  new Status();
		state.setOb(i);
		
		dao = new InventarioDAO();
		String resultado = dao.editar(i);
		
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
	public Inventario buscar(@PathParam("id") int id) {
		dao = new InventarioDAO();
		inventario = (Inventario) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return inventario;
	}
	
	
}
