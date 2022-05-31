package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.dao.ProvedorDao;

import com.entity.Provedor;
import com.general.Status;
@Path("provedor")
public class ProvedorServices {
	
		Provedor prov=null;
		ProvedorDao provDao=null;

		@Path("guardarprov")
		@POST
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		public Status guardar(Provedor ca) {
		 System.out.println("Categoria a guardar: "+prov);
		 Status st= new Status();
		
		 st.setoB(prov);
		 
		 provDao= new ProvedorDao();
		 String res = provDao.guardar(prov);
		 
		 if (res.equals("1")) {
			 st.setMensaje("Se guardo proveedor");
			 st.setRespuesta(res);
		 }else {
			 st.setMensaje("Fallo al guardar proveedor");
			 st.setRespuesta(res);
		 }
		 return st;
		 
		}
		
		@Path("editarprov")
		@POST
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		public Status editar(Provedor prov) {
			Status st = new Status();
			st.setoB(prov);
			provDao = new ProvedorDao();
			String res = provDao.editar(prov);
			
			if (res.equals("1")) {
				 st.setMensaje("Se atualizo proveedor");
				 st.setRespuesta(res);
			 }else {
				 st.setMensaje("Fallo al actualizar proveedor");
				 st.setRespuesta(res);
			 }
			 return st;
		}
		@Path("eliminarprov/{id}")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public Status eliminar(@PathParam("id")int id) {
			Status st = new Status();
			provDao = new ProvedorDao();
			String res =provDao.eliminar(id);
			if (res.equals("1")) {
				 st.setMensaje("Se eleimino proveedor");
				 st.setRespuesta(res);
			 }else {
				 st.setMensaje("Fallo al eliminar proveedor");
				 st.setRespuesta(res);
			 }
			 return st;
		}
		
		@Path("buscar-por-idca/{id}")
		@GET
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		public Provedor buscar(@PathParam("id")int id) {
			provDao = new ProvedorDao();
			prov = (Provedor) provDao.buscar(id);
			System.out.println("Se encontro proveedor");
			return prov;
		}
		
		//http://localhots:8085/Hibernate_MAFM/Hibernate_MAFM/monstrarca
		@Path("mostrarca")
		@GET//operaciones de solo lectura
		@Produces({MediaType.APPLICATION_JSON})
		public List<Provedor> mostrar(){
			provDao=new ProvedorDao();
			List<Provedor> provlist =provDao.mostrar();
			System.out.println("datos "+provlist);
					return provlist;
		}
}
