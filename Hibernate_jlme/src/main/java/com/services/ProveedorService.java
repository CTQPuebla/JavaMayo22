package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProveedorDAO;
import com.entity.Proveedor;
import com.general.Status;

@Path("proveedores/")
public class ProveedorService {

	Proveedor p = null;
	ProveedorDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Proveedor> mostrar() {
		dao = new ProveedorDAO();
		List<Proveedor> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Proveedor p) {
		System.out.println("producto a guardar" + p);
		Status st = new Status();
		st.setO(p);
		dao = new ProveedorDAO();
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
	public Status editar(Proveedor p) {

		Status st = new Status();
		st.setO(p);
		dao = new ProveedorDAO();
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
	public Status eliminar(@PathParam("id") int id) {

		Status st = new Status();

		dao = new ProveedorDAO();
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
	public Proveedor buscar(@PathParam("id") int id) {

		dao = new ProveedorDAO();
		p = (Proveedor) dao.buscar(id);
		System.out.println("registro encontrado");
		return p;
	}

}
