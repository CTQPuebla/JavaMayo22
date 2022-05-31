package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClienteDAO;
import com.dao.EmpleadoDAO;
import com.entity.Cliente;
import com.entity.Empleado;
import com.general.Status;

@Path("clientes/")
public class ClienteService {

	Cliente c = null;
	ClienteDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Cliente> mostrar() {
		dao = new ClienteDAO();
		List<Cliente> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Cliente c) {
		System.out.println("producto a guardar" + c);
		Status st = new Status();
		st.setO(c);
		dao = new ClienteDAO();
		String res = dao.guardar(c);

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
	public Status editar(Cliente c) {

		Status st = new Status();
		st.setO(c);
		dao = new ClienteDAO();
		String res = dao.actualizar(c);

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
		
		dao = new ClienteDAO();
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
	public Cliente buscar(@PathParam("id") int id) {

		dao = new ClienteDAO();
		c = (Cliente) dao.buscar(id);
		System.out.println("registro encontrado");
		return c;
	}
	
}
