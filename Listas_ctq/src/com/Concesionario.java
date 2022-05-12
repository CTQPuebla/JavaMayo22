package com;

import java.util.List;

public class Concesionario {

	String direccion;
	List<Auto> autosDisponibles;
	List<Cliente> clientes;

	public Concesionario(String direccion, List<Auto> autosDisponibles, List<Cliente> clientes) {
		this.direccion = direccion;
		this.autosDisponibles = autosDisponibles;
		this.clientes = clientes;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Auto> getAutosDisponibles() {
		return autosDisponibles;
	}

	public void setAutosDisponibles(List<Auto> autosDisponibles) {
		this.autosDisponibles = autosDisponibles;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Object[] buscarCliente(String nombre) {
		Object[] respuesta = { -1, null };

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNombre().equals(nombre)) {

				respuesta[0] = i;
				respuesta[1] = clientes.get(i);
				break;
			}
		}
		return respuesta;
	}

	public Object[] buscarAuto(String modelo) {

		Object[] respuesta = { -1, null };
		for (int i = 0; i < autosDisponibles.size(); i++) {
			if (autosDisponibles.get(i).getModelo().equals(modelo)) {
				respuesta[0] = i;
				respuesta[1] = autosDisponibles.get(i);
				break;
			}
		}
		return respuesta;
	}

	public void venderAuto(String nombre, String modelo) {

		if (this.buscarAuto(modelo)[1] != null && this.buscarCliente(nombre)[1] != null) { // Si existe el cliente y el
																							// auto
																							// aun
			// esta disponible
			Cliente cliente = (Cliente) this.buscarCliente(nombre)[1];
			Auto auto = (Auto) this.buscarAuto(modelo)[1];

//			cliente.getAutos().size()

			if (cliente.getAutos().size() <= 4 && cliente.getCredito() >= auto.getPrecio()) { // Compruebo que el
																								// cliente tenga hasta 4
																								// autos para venderle
																								// // uno mas
				cliente.getAutos().add(auto); // añado un auto mas a la lista de autos del cliente

				// Actualizo la lista de autos
				autosDisponibles.remove(this.buscarAuto(modelo)[0]);

				// Actualizo el dinero del cliente (resta)
				int indexCliente = (int) this.buscarCliente(nombre)[0];
				clientes.get(indexCliente).setCredito(clientes.get(indexCliente).getCredito() - auto.getPrecio());

			} else {
				System.out.println("Ya tiene 5 autos o el credito es insuficiente");
			}

		} else {
			System.out.println("El cliente no existe o el auto ya se ha vendido");
		}

	}

}
