package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductoDao;
import com.dao.VenDetalleDao;
import com.entity.Producto;
import com.entity.VenDetalle;
import com.general.Status;

@Path("venDetalle")
public class VenDetalleServices {
	VenDetalle venDet=null;
	VenDetalleDao venDetDao=null;
	//http://localhost:8085/Hibernate_MAFM/Hibernate_MAFM/producto/guardarpr
	@Path("guardarvenD")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(VenDetalle venDet) {
	 System.out.println("Categoria a guardar: "+venDet);
	 Status st= new Status();
	
	 st.setoB(venDet);
	 
	 venDetDao= new VenDetalleDao();
	 String res = venDetDao.guardar(venDet);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo detalle de venta");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al detalle de venta");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarvenD")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(VenDetalle venDet) {
		Status st = new Status();
		st.setoB(venDet);
		venDetDao = new VenDetalleDao();
		String res = venDetDao.editar(venDet);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo detalle de venta");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar detalle de venta");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarpr/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		venDetDao = new VenDetalleDao();
		String res = venDetDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino detalle de venta");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar detalle de venta");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("buscar-por-idvenD/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VenDetalle buscar(@PathParam("id")int id) {
		venDetDao = new VenDetalleDao();
		venDet = (VenDetalle) venDetDao.buscar(id);
		System.out.println("Se encontro detalle de venta");
		return venDet;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarvenD")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<VenDetalle> mostrar(){
		venDetDao=new VenDetalleDao();
		List<VenDetalle> venDetlist =venDetDao.mostrar();
		System.out.println("datos "+venDetlist);
				return venDetlist;
	}
}
