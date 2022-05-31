package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClientesDAO;
import com.entity.Clientes;
import com.general.Status;

@Path("clientes")
public class ClientesService {

	Clientes clientes  = null;
	ClientesDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Clientes> mostrar(){
		dao = new ClientesDAO();
		List<Clientes> list = dao.mostrar();
		System.out.println("datos"+list);
		return list;
	}

		
		@Path("guardar")
		@POST
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		public Status guardar (Clientes p) {
			System.out.println("cliente a guardar :"+p);
			Status state = new Status();
			state.setOb(p);
			
			dao = new ClientesDAO();
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
		public Status eliminar (@PathParam("id")int id) {
			Status state = new Status();
			state.setOb(id);
			
			dao = new ClientesDAO();
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
		public Status editar (Clientes i) {
		Status state = new Status();
		state.setOb(i);
		
		dao = new ClientesDAO();
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
			public Clientes buscar (@PathParam("id") int id) {
				dao = new ClientesDAO();
				clientes = (Clientes) dao.buscar(id);
				System.out.println("Se encontro el registro");
				
				return clientes;
				
			
		
		}

}
