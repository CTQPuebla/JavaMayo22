package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProPrecioDao;
import com.entity.ProPrecio;
import com.entity.Producto;
import com.general.Status;
@Path("proPrecio")
public class ProPrecioServices {
	ProPrecio proPre=null;
	ProPrecioDao proPreDao=null;
	//http://localhost:8085/Hibernate_MAFM/Hibernate_MAFM/producto/guardarpr
	@Path("guardarprop")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(ProPrecio pr) {
	 System.out.println("Categoria a guardar: "+proPre);
	 Status st= new Status();
	
	 st.setoB(proPre);
	 
	 proPreDao= new ProPrecioDao();
	 String res = proPreDao.guardar(proPre);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo categoria");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar categoria");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarprop")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Producto proPre) {
		Status st = new Status();
		st.setoB(proPre);
		proPreDao = new ProPrecioDao();
		String res = proPreDao.editar(proPre);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo categoria");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar categoria");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarpr/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		proPreDao = new ProPrecioDao();
		String res = proPreDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino precio nproducto");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar precio producto");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("buscar-por-idprop/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public ProPrecio buscar(@PathParam("id")int id) {
		proPreDao = new ProPrecioDao();
		proPre = (ProPrecio) proPreDao.buscar(id);
		System.out.println("Se encontro producto");
		return proPre;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarpr")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<ProPrecio> mostrar(){
		proPreDao=new ProPrecioDao();
		List<ProPrecio> proPlist =proPreDao.mostrar();
		System.out.println("datos "+proPlist);
				return proPlist;
	}
}
