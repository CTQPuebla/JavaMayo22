package ceteq;

import java.util.ArrayList;
import java.util.List;

public class Concesionario implements AccionesConcesionario{
	private String nombre;
	private int numAutos;

	private Auto auto;
	private Cliente cliente;
	private List<Cliente> clientes = new ArrayList<>();
	private List<Auto> autos = new ArrayList<>();;
	
	public Concesionario() {
		
	}
	
	public Concesionario(String nombre, int numAutos, Auto auto, Cliente cliente) {
		super();
		this.nombre = nombre;
		this.numAutos = numAutos;
		this.auto = auto;
		this.cliente = cliente;
	}

	public Concesionario(String nombre, int numAutos, Auto auto, Cliente cliente, List<Cliente> clientes,
			List<Auto> autos) {
		this.nombre = nombre;
		this.numAutos = numAutos;
		this.auto = auto;
		this.cliente = cliente;
		this.clientes = clientes;
		this.autos = autos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumAutos() {
		return numAutos;
	}

	public void setNumAutos(int numAutos) {
		this.numAutos = numAutos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	@Override
	public String toString() {
		return "Concesionario [nombre=" + nombre + ", numAutos=" + numAutos + ", auto=" + auto + ", cliente=" + cliente
				+ ", clientes=" + clientes + ", autos=" + autos + "]";
	}

	@Override
	public void registrarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		try {
			this.clientes.add(new Cliente(cliente.getNombre(), cliente.getNumTelefono(), cliente.getPresupuesto()));
//			System.out.println("Cliente registrado");
		} catch (Exception e) {
			System.out.println("Error r clientes: " + e);
		}
	}
	
	@Override
	public void registrarAutos(Auto auto) {
		// TODO Auto-generated method stub
		try {
			this.autos.add(new Auto(auto.getIdentificador(), auto.getModelo(), auto.getMarca(), auto.getPrecio()));
//			System.out.println("Auto registrado");
		} catch (Exception e) {
			System.out.println("Error r autos: " + e);
		}
	}

	@Override
	public void seleccionarAuto(String identificador, String nombreCliente) {
		// TODO Auto-generated method stub
		int contador = 0;
		buscarCliente(nombreCliente);
		if (!this.autos.isEmpty()) {
			if (!this.clientes.isEmpty()) {
				for (Auto auto : autos) {
					contador++;
					if (auto.getIdentificador().equals(identificador)) {
						if (this.cliente != null) {
							if (this.cliente.getPresupuesto() >= auto.getPrecio()) {
								this.cliente.setPresupuesto(this.cliente.getPresupuesto() - auto.getPrecio());
								this.auto = auto;
								venderAuto();
								System.out.println("Auto vendido");
							}else {
								System.out.println("Ya no tiene presupuesto");
							}
						}
						break;
					}else if (contador == autos.size()) {
						System.out.println("Auto no encontrado");
					}
				}
			} else {
				System.out.println("No hay clientes");
			}
		} else {
			System.out.println("No hay autos");
		}
	}
	
	public void buscarCliente(String nombreCliente) {
//		System.out.println(nombreCliente);
		int contador = 0;
		if (!this.clientes.isEmpty()) {
			for (Cliente cliente : this.clientes) {
				contador++;
				if (cliente.getNombre().equals(nombreCliente)) {
					this.cliente = cliente;
					break;
				}else if (clientes.size() == contador) {
					System.out.println("El cliente no existe");
					this.cliente = null;
				}
			}
		}
//		System.out.println(this.cliente);
	}
	
	@Override
	public void venderAuto() {
		// TODO Auto-generated method stub
		
		if (!autos.isEmpty()) {
			if (!(this.cliente.getAutosComprados().size() == 5)) {
				this.cliente.getAutosComprados().add(this.auto);
				eliminarAuto();
				
			} else {
				System.out.println("Ya no se le pueden vender mas autos");
				
			}
		} else {
			System.out.println("Ya no hay autos");
			
		}
		
	}

	@Override
	public void eliminarAuto() {
		// TODO Auto-generated method stub
		this.autos.remove(this.auto);
	}
	
	
}
