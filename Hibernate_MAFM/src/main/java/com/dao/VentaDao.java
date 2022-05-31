package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.ClienteT;
import com.entity.Empleado;
import com.entity.Venta;
import com.general.Metodos;

public class VentaDao implements Metodos{
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	EntityManager em= emf.createEntityManager();
	Venta venta=null;
	@Override
	public String guardar(Object oB) {
		venta = (Venta) oB;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(venta);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Se registro venta");
		}catch(Exception ex) {
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se registro venta");
		}
		em.close();
		return resultado;	
	}
	@Override
	public String editar(Object oB) {
		venta = (Venta) oB;
		Venta ventaDb= em.find(Venta.class, venta.getVentaId());
		ClienteT cliente= em.find(ClienteT.class, venta.getCliente().getClienteTId());
		Empleado empleado= em.find(Empleado.class, venta.getEmpleado().getEmpleadoId());
		String res= null;
		em.getTransaction().begin();
		try {
			ventaDb.setCliente(cliente);
			ventaDb.setEmpleado(empleado);
			ventaDb.setvFecha(venta.getvFecha());
			ventaDb.setvSubt(venta.getvSubt());
			ventaDb.setvIva(venta.getvIva());
			ventaDb.setvTotal(venta.getvTotal());
			em.getTransaction().commit();
			System.out.println("Registor editado");
			res="1";
			
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se actualizo registro");
			res =ex.getMessage();
		}
		return res;
	}
	@Override
	public String eliminar(int id) {
		String res= null;
		venta =em.find(Venta.class, id);
		em.getTransaction().begin();
		try {
			em.remove(venta);
			em.getTransaction().commit();
			System.out.println("Se elimino registro");
			res="1";
		}catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se puedo eliminar");
			res = "1";
		}
		return res;
	}
	@Override
	public Object buscar(int id) {
		venta = em.find(Venta.class, id);
		return venta;
	}

	@Override
	public List mostrar() {
		List<Venta> venlis =em.createQuery("from Venta").getResultList();
		return venlis;
	}
	

}
