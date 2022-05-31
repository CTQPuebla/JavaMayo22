package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.InventarioDAO;
import com.entity.Inventario;
import com.general.Status;

@Path("inventario/")
public class InventarioService {

	Inventario inv = null;
	InventarioDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Inventario> mostrar() {
		dao = new InventarioDAO();
		List<Inventario> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Inventario inv) {

		System.out.println("inventario a guardar" + inv);
		Status st = new Status();
		st.setO(inv);
		dao = new InventarioDAO();
		String res = dao.guardar(inv);

		if (res.equals("1")) {

			st.setMen("registro guardado");
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
	public Status editar(Inventario inv) {

		Status st = new Status();
		st.setO(inv);
		dao = new InventarioDAO();
		String res = dao.actualizar(inv);

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
	public Status eliminar(@PathParam("id") int id) {

		Status st = new Status();
		
		dao = new InventarioDAO();
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
	public Inventario buscar(@PathParam("id") int id) {

		dao = new InventarioDAO();
		inv = (Inventario) dao.buscar(id);
		System.out.println("registro encontrado");
		return inv;
	}

}
