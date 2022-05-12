package com;

import java.util.*;

public class Concesionaria {
	String nombre;
	List<Auto> autos = new ArrayList<>();
	List<Cliente> clientes = new ArrayList<>();
	HashMap<Cliente,Auto> ventas = new HashMap<>();
	Scanner sc=new Scanner(System.in);

	public Concesionaria(String nombre) {
		this.nombre=nombre;
		
		autos.add(new Auto("Chevrolet","Picup 1",245324.99));
		autos.add(new Auto("Chevrolet","Picup 2",245324.99));
		autos.add(new Auto("Chevrolet","Picup 3",245324.99));
		autos.add(new Auto("Chevrolet","Picup 4",245324.99));
		autos.add(new Auto("Chevrolet","Picup 5",245324.99));
		autos.add(new Auto("Ford","Lobo 1",245324.99));
		autos.add(new Auto("Ford","Lobo 2",245324.99));
		autos.add(new Auto("Ford","Lobo 3",245324.99));
		autos.add(new Auto("Ford","Lobo 4",245324.99));
		autos.add(new Auto("Ford","Lobo 5",245324.99));
		autos.add(new Auto("Tesla","Model A",245324.99));
		autos.add(new Auto("Tesla","Model B",245324.99));
		autos.add(new Auto("Tesla","Model C",245324.99));
		autos.add(new Auto("Tesla","Model D",245324.99));
		autos.add(new Auto("Tesla","Model E",245324.99));
		
		clientes.add(new Cliente("Arnold",0));
		clientes.add(new Cliente("Donovan",0));
		clientes.add(new Cliente("Ruben",0));
		clientes.add(new Cliente("Ricardo",0));
		clientes.add(new Cliente("Luis",0));
	}
	
	private void autosDisp() {
		System.out.println("Autos disponibles: ");
		for(int i=0;i<autos.size();i++) {
			System.out.println("auto "+i+": "+ "marca "+autos.get(i).marca+ " y modelo "+ autos.get(i).modelo+" con un precio de $"+autos.get(i).precio);
		}
	}
	
	private int pedirAuto() {
		System.out.println("Escribe el numero del auto que deseas adquirir");
		int aux= sc.nextInt();
		
		return aux;
	}
	
	private double pedirDinero() {
		System.out.println("Ingresa la cantidad de pago");
		double aux= sc.nextDouble();
		
		return aux;
	}
	
	private void venta(int indice) {
		
		String nom = pedirNomClien();
		boolean exisCliente=false;
		boolean	ventaMax=false;
		int indiceCl=0;
		
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).nombre.equals(nom)) {
				exisCliente=true;
				indiceCl=i;
				ventaMax=ventaMaxClien(clientes.get(i));
			}
		}
		
		if(exisCliente) {
			if(ventaMax) {
				Double dinero=pedirDinero();
				if(dinero>=autos.get(indice).getPrecio()) {
					venderAuto(indice, dinero, clientes.get(indiceCl));
				}else {
					System.out.println("Tu dinero no es suficiente pobre");
					iniciar();
				}
			}else {
				System.out.println("no podemos venderte mas, porque has superado el limite de 5 autos");
			}
		
		}else {
			System.out.println("No te encuentras en nuestra lista de clientes, no podemos venderte un auto");
			iniciar();
		}
	}
	
	private void venderAuto(int indice, double pago, Cliente clien) {
		System.out.println("has adquirido el auto: ");
		System.out.println(autos.get(indice).marca+ " "+ autos.get(indice).modelo+" con un precio de $"+autos.get(indice).precio);
		System.out.println("tu cambio es: "+ cambio(pago, autos.get(indice).precio));
		System.out.println("tu autos comprados: "+ (clien.autosAdquiridos+1));
		System.out.println("Muchas Gracias Por Tu Compra, Regresa Pronto");
		
		agregarAutoCliente(clien);
		ventas.put(clien, autos.get(indice));
		autos.remove(indice);
		iniciar();
	}
	
	private double cambio(double pago, double precio) {
		return pago-precio;
	}
	
	private String pedirNomClien() {
		String aux;
		System.out.println("Introduce tu nombre: ");
		aux=sc.next();
		
		return aux;
	}
	
	
	private boolean ventaMaxClien(Cliente clien) {
		boolean aux=false;
		
		if(clien.autosAdquiridos<5) {
			aux=true;
		}
		return aux;
	}
	
	private void agregarAutoCliente(Cliente cl){
		
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).equals(cl)) {
				clientes.get(i).sumaAutosAdquiridos();
			}
		}
	}
	
	public void iniciar() {
		System.out.println("Bienvenido a Auto Loco");
		autosDisp();
		venta(pedirAuto());
	}

}
