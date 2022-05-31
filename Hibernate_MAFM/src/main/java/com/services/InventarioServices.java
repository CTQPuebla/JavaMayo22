package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.InventarioDao;
import com.entity.Inventario;
import com.general.Status;
@Path("inventario")
public class InventarioServices {
	Inventario inv=null;
	InventarioDao invDao=null;

	@Path("guardarinv")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Inventario inv) {
	 System.out.println("Inventario a guardar: "+ inv);
	 Status st= new Status();
	
	 st.setoB(inv);
	 
	 invDao= new InventarioDao();
	 String res = invDao.guardar(inv);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo inventario");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar inventario");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarinv")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Inventario inv) {
		Status st = new Status();
		st.setoB(inv);
		invDao = new InventarioDao();
		String res = invDao.editar(inv);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo inventario");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar inventario");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarinv/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		invDao = new InventarioDao();
		String res = invDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino inventario");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar inventario");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	
	@Path("buscar-por-idinv/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Inventario buscar(@PathParam("id")int id) {
		invDao = new InventarioDao();
		inv = (Inventario) invDao.buscar(id);
		System.out.println("Se encontro inventario");
		return inv;
	}
	

	@Path("mostrarinv")
	@GET//operaciones de solo lectura
	@Produces({MediaType.APPLICATION_JSON})
	public List<Inventario> mostrar(){
		invDao=new InventarioDao();
		List<Inventario> calist =invDao.mostrar();
		System.out.println("datos "+calist);
				return calist;
	}
}
