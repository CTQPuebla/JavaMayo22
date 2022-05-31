package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmpleadoDAO;
import com.entity.Empleado;
import com.general.Status;

@Path("empleados/")
public class EmpleadoService {

	Empleado e = null;
	EmpleadoDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Empleado> mostrar() {
		dao = new EmpleadoDAO();
		List<Empleado> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Empleado e) {
		System.out.println("producto a guardar" + e);
		Status st = new Status();
		st.setO(e);
		dao = new EmpleadoDAO();
		String res = dao.guardar(e);

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
	public Status editar(Empleado e) {

		Status st = new Status();
		st.setO(e);
		dao = new EmpleadoDAO();
		String res = dao.actualizar(e);

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
		
		dao = new EmpleadoDAO();
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
	public Empleado buscar(@PathParam("id") int id) {

		dao = new EmpleadoDAO();
		e = (Empleado) dao.buscar(id);
		System.out.println("registro encontrado");
		return e;
	}
	
}
