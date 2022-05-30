package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.VentaDAO;
import com.entity.Venta;
import com.general.Status;

@Path("venta")
public class VentaService {
	
	Venta venta = null;
	VentaDAO dao = null;
	
	//http://localhost:8090/CRUDHibernate/CRUDHibernate/producto/mostrar
	@Path ("mostrar")
	@GET
	@Produces ({MediaType.APPLICATION_JSON})
	public List<Venta>mostrar(){
		dao = new VentaDAO();
		List<Venta> list = dao.mostrar();
		System.out.println("datos:" + list);
		return list;
	}
	
	@Path ("guardar")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status guardar (Venta v) {
		System.out.println("venta a guardar: "+v);
		Status state= new Status();
		state.setOb(v);
		
		dao = new VentaDAO();
		String res = dao.guardar(v);
		
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
		
		dao = new VentaDAO();
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
	public Status editar (Venta v) {
		Status state= new Status();
		state.setOb(v);
		
		dao = new VentaDAO();
		String res = dao.editar(v);
		
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
		public Venta buscar (@PathParam ("id") int id) {
			dao = new VentaDAO();
			venta = (Venta) dao.buscar(id);
			System.out.println("Se encontro el registo ");
			return venta;
		}

}
