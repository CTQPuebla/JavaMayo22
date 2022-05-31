package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.InvDetalleDao;
import com.entity.InvDetalle;
import com.general.Status;
@Path("invDetalle")
public class InvDetalleServices {
	InvDetalle invD=null;
	InvDetalleDao invDDao=null;
	//http://localhost:8085/Hibernate_MAFM/Hibernate_MAFM/producto/guardarpr
	@Path("guardarinvd")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(InvDetalle invD) {
	 System.out.println("Categoria a guardar: "+ invD);
	 Status st= new Status();
	
	 st.setoB(invD);
	 
	 invDDao= new InvDetalleDao();
	 String res = invDDao.guardar(invD);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo Detalle de inventario");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar Detalle de inventario");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarinvd")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(InvDetalle invD) {
		Status st = new Status();
		st.setoB(invD);
		invDDao = new InvDetalleDao();
		String res = invDDao.editar(invD);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo Detalle de inventario");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar Detalle de inventario");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarind/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		invDDao = new InvDetalleDao();
		String res = invDDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino Detalle de inventario");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar Detalle de inventario");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("buscar-por-idinvd/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public InvDetalle buscar(@PathParam("id")int id) {
		invDDao = new InvDetalleDao();
		invD = (InvDetalle) invDDao.buscar(id);
		System.out.println("Se encontro producto");
		return invD;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarinvd")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<InvDetalle> mostrar(){
		invDDao=new InvDetalleDao();
		List<InvDetalle> invDlist =invDDao.mostrar();
		System.out.println("datos "+invDlist);
				return invDlist;
	}

}
