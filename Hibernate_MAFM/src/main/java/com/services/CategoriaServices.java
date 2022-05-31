package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CategoriaDao;
import com.entity.Categoria;
import com.general.Status;

@Path("categoria")
public class CategoriaServices  {
	Categoria ca=null;
	CategoriaDao caDao=null;

	@Path("guardarca")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Categoria ca) {
	 System.out.println("Categoria a guardar: "+ca);
	 Status st= new Status();
	
	 st.setoB(ca);
	 
	 caDao= new CategoriaDao();
	 String res = caDao.guardar(ca);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo categoria");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar categoria");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarca")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Categoria ca) {
		Status st = new Status();
		st.setoB(ca);
		caDao = new CategoriaDao();
		String res = caDao.editar(ca);
		
		if (res.equals("1")) {
			 st.setMensaje("Se atualizo categoria");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al actualizar categoria");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("eliminarca/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status st = new Status();
		caDao = new CategoriaDao();
		String res = caDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino categoria");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar categoria");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	
	@Path("buscar-por-idca/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Categoria buscar(@PathParam("id")int id) {
		caDao = new CategoriaDao();
		ca = (Categoria) caDao.buscar(id);
		System.out.println("Se encontro categoria");
		return ca;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarca")
	@GET//operaciones de solo lectura
	@Produces({MediaType.APPLICATION_JSON})
	public List<Categoria> mostrar(){
		caDao=new CategoriaDao();
		List<Categoria> calist =caDao.mostrar();
		System.out.println("datos "+calist);
				return calist;
	}
}


