package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClienteTDao;
import com.entity.ClienteT;
import com.general.Status;

public class ClienteTServices {
	ClienteT ct=null;
	ClienteTDao ctDao=null;

	@Path("guardarct")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(ClienteT ct) {
	 System.out.println("Categoria a guardar: "+ct);
	 Status st= new Status();
	
	 st.setoB(ct);
	 
	 ctDao= new ClienteTDao();
	 String res = ctDao.guardar(ct);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo cliente");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar cliente");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarct")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(ClienteT ct) {
		Status st = new Status();
		st.setoB(ct);
		ctDao = new ClienteTDao();
		String res = ctDao.editar(ct);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo cliente");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar cliente");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarct/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		ctDao = new ClienteTDao();
		String res = ctDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino cliente");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar cliente");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	
	@Path("buscar-por-idct/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public ClienteT buscar(@PathParam("id")int id) {
		ctDao = new ClienteTDao();
		ct = (ClienteT) ctDao.buscar(id);
		System.out.println("Se encontro cliente");
		return ct;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarct")
	@GET//operaciones de solo lectura
	@Produces({MediaType.APPLICATION_JSON})
	public List<ClienteT> mostrar(){
		ctDao=new ClienteTDao();
		List<ClienteT> calist =ctDao.mostrar();
		System.out.println("datos "+calist);
				return calist;
	}

}
