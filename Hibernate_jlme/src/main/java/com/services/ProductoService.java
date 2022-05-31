
package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductoDAO;
import com.entity.Producto;
import com.general.Status;

@Path("productos/")
public class ProductoService {

	Producto p = null;
	ProductoDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Producto> mostrar() {
		dao = new ProductoDAO();
		List<Producto> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Producto p) {
		System.out.println("producto a guardar" + p);
		Status st = new Status();
		st.setO(p);
		dao = new ProductoDAO();
		String res = dao.guardar(p);

		if (res.equals("1")) {

			st.setMen("Guardado con Exito");
			st.setRes(res);

		} else {

			st.setMen("Fallo al guardar");
			st.setRes(res);

		}
		return st;
	}

	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status editar(Producto p) {

		Status st = new Status();
		st.setO(p);
		dao = new ProductoDAO();
		String res = dao.actualizar(p);

		if (res.equals("1")) {
			st.setMen("registro editado");
			st.setRes(res);
		} else {
			st.setMen("Fallo al editar");
			st.setRes(res);
		}

		return st;
	}

	@Path("eliminar/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Status eliminar(@PathParam("id")int id) {

		Status st = new Status();
		
		dao = new ProductoDAO();
		String res = dao.eliminar(id);

		if (res.equals("1")) {
			st.setMen("registro eliminado");
			st.setRes(res);
		} else {
			st.setMen("Fallo al eliminar");
			st.setRes(res);
		}
		
		return st;
	}

	@Path("buscar-por-id/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Producto buscar(@PathParam("id") int id) {

		dao = new ProductoDAO();
		p = (Producto) dao.buscar(id);
		System.out.println("registro encontrado");
		return p;
	}

}
