package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProveedorDAO;
import com.entity.Proveedor;
import com.general.Status;

@Path("proveedor")
public class ProveedorService {
	
	Proveedor proveedor = null;
	ProveedorDAO dao = null;
	
	//http://localhost:8090/CRUDHibernate/CRUDHibernate/proveedor/mostrar
		@Path ("mostrar")
		@GET
		@Produces ({MediaType.APPLICATION_JSON})
		public List<Proveedor>mostrar(){
			dao = new ProveedorDAO();
			List<Proveedor> list = dao.mostrar();
			System.out.println("datos:" + list);
			return list;
		}
	@Path ("guardar")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status guardar (Proveedor pr) {
		System.out.println("proveedor a guardar: "+pr);
		Status state= new Status();
		state.setOb(pr);
		
		dao = new ProveedorDAO();
		String res = dao.guardar(pr);
		
		if (res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path ("eliminar/{id}")
	@GET
	@Produces ({MediaType.APPLICATION_JSON})
	public Status eliminar (@PathParam("id") int id) {
		Status state= new Status();
		state.setOb(id);
		
		dao = new ProveedorDAO();
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
	
	@Path ("editar")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status editar (Proveedor pr) {
		Status state= new Status();
		state.setOb(pr);
		
		dao = new ProveedorDAO();
		String res = dao.editar(pr);
		
		if (res.equals("1")) {
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
		@Consumes ({MediaType.APPLICATION_JSON})
		@Produces ({MediaType.APPLICATION_JSON})
		public Proveedor buscar (@PathParam ("id") int id) {
			dao = new ProveedorDAO();
			proveedor = (Proveedor) dao.buscar(id);
			System.out.println("Se encontro el registo ");
			return proveedor;
		}

}
