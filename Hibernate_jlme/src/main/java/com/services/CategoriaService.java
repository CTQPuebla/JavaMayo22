package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.CategoriaDAO;
import com.entity.Categoria;
import com.general.Status;

@Path("categorias/")
public class CategoriaService {

	Categoria cat = null;
	CategoriaDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Categoria> mostrar() {
		dao = new CategoriaDAO();
		List<Categoria> lista = dao.mostrar();
		System.out.println("datos: " + lista);
		return lista;
	}

	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Categoria cat) {

		System.out.println("categoria a guardar" + cat);
		Status st = new Status();
		st.setO(cat);
		dao = new CategoriaDAO();
		String res = dao.guardar(cat);

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
	public Status editar(Categoria cat) {

		Status st = new Status();
		st.setO(cat);
		dao = new CategoriaDAO();
		String res = dao.actualizar(cat);

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
		
		dao = new CategoriaDAO();
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
	public Categoria buscar(@PathParam("id") int id) {

		dao = new CategoriaDAO();
		cat = (Categoria) dao.buscar(id);
		System.out.println("registro encontrado");
		return cat;
	}
	
}
