package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.dao.VentaDao;

import com.entity.Venta;
import com.general.Status;
@Path("venta")
public class VentaServices {
	Venta ven=null;
	VentaDao venDao=null;
	//http://localhost:8085/Hibernate_MAFM/Hibernate_MAFM/producto/guardarpr
	@Path("guardarven")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Venta ven) {
	 System.out.println("Categoria a guardar: "+ven);
	 Status st= new Status();
	
	 st.setoB(ven);
	 
	 venDao= new VentaDao();
	 String res = venDao.guardar(ven);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo venta");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar venta");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarven")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Venta ven) {
		Status st = new Status();
		st.setoB(ven);
		venDao = new VentaDao();
		String res = venDao.editar(ven);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo venta");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar venta");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarven/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		venDao = new VentaDao();
		String res = venDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino venta");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar venta");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("buscar-por-idven/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Venta buscar(@PathParam("id")int id) {
		venDao = new VentaDao();
		ven = (Venta) venDao.buscar(id);
		System.out.println("Se encontro venta");
		return ven;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarven")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Venta> mostrar(){
		venDao=new VentaDao();
		List<Venta> venlist =venDao.mostrar();
		System.out.println("datos "+venlist);
				return venlist;
	}
}
