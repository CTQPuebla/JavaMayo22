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
import com.dao.ProductoDao;
import com.entity.Categoria;
import com.entity.Producto;
import com.general.Status;
@Path("producto")
public class ProductoServices {
	Producto pr=null;
	ProductoDao prDao=null;
	//http://localhost:8085/Hibernate_MAFM/Hibernate_MAFM/producto/guardarpr
	@Path("guardarpr")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Producto pr) {
	 System.out.println("Categoria a guardar: "+pr);
	 Status st= new Status();
	
	 st.setoB(pr);
	 
	 prDao= new ProductoDao();
	 String res = prDao.guardar(pr);
	 
	 if (res.equals("1")) {
		 st.setMensaje("Se guardo categoria");
		 st.setRespuesta(res);
	 }else {
		 st.setMensaje("Fallo al guardar categoria");
		 st.setRespuesta(res);
	 }
	 return st;
	 
	}
	
	@Path("editarpr")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Producto pr) {
		Status st = new Status();
		st.setoB(pr);
		prDao = new ProductoDao();
		String res = prDao.editar(pr);
		
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
		prDao = new ProductoDao();
		String res = prDao.eliminar(id);
		if (res.equals("1")) {
			 st.setMensaje("Se eleimino producto");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al eliminar producto");
			 st.setRespuesta(res);
		 }
		 return st;
	}
	@Path("buscar-por-idpr/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Producto buscar(@PathParam("id")int id) {
		prDao = new ProductoDao();
		pr = (Producto) prDao.buscar(id);
		System.out.println("Se encontro producto");
		return pr;
	}
	
	//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
	@Path("mostrarpr")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Producto> mostrar(){
		prDao=new ProductoDao();
		List<Producto> prlist =prDao.mostrar();
		System.out.println("datos "+prlist);
				return prlist;
	}
}
