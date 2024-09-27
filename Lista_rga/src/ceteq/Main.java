package ceteq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		HashMap<Integer, String> hash = new HashMap<Integer, String>();
//	
//		hash.put(10, "once");
//		hash.put(11, "hola");
//		hash.put(12, "java");
//		hash.put(13, "huawei");
//		hash.put(10, "ioioioioi");
//		System.out.println(hash);
//		System.out.println(hash.get(13));
//		hash.remove(11);
//		System.out.println(hash);
		
		Concesionario cons = new Concesionario();
		
//		List<Auto> listAutos = new ArrayList<>();
//		listAutos.add(new Auto("A1", "F-150", "Ford", 20000.00));
		cons.registrarCliente(new Cliente("RUBEN", "5517909951", 1000000));
		cons.registrarCliente(new Cliente("JUAN", "583495839", 2000000));
		cons.registrarCliente(new Cliente("PEDRO", "3453453", 1000000));
		cons.registrarCliente(new Cliente("DILAN", "64757577", 500000));
		cons.registrarCliente(new Cliente("JOSE", "757675675", 1000000));
//		cons.registrarAutos(new Auto("A1", "F-150", "Ford", 500000.00));
//		cons.registrarAutos(new Auto("A2", "Lobo", "Ford", 500000.00));
		cons.registrarAutos(new Auto("A3", "Maverick", "Ford", 30000.00));
		cons.registrarAutos(new Auto("A1", "F-150", "Ford", 10000.00));
		cons.registrarAutos(new Auto("A2", "Lobo", "Ford", 10000.00));
		cons.registrarAutos(new Auto("A4", "F-250 Super Duty", "Ford", 500000.00));
		cons.registrarAutos(new Auto("A5", "Ranger", "Ford", 10000.00));
		cons.registrarAutos(new Auto("A6", "Cheyenne Cabina Regular 4X2", "Chevrolet", 10000.00));
		cons.registrarAutos(new Auto("A7", "Silverado Doble Cabina 4X4", "Chevrolet", 10000.00));
//		System.out.println(cons.getAutos());
//		System.out.println(cons.getClientes());
		cons.seleccionarAuto("A1","RUBEN");
//		cons.seleccionarAuto("A2");
//		cons.seleccionarAuto("A3");
//		cons.seleccionarAuto("A6");
		System.out.println("Compra de RUBEN: " + cons.getCliente().getAutosComprados() + " le sobra: " + cons.getCliente().getPresupuesto());
		cons.seleccionarAuto("A7","a");
		cons.seleccionarAuto("A1", "JUAN");
		System.out.println("Compra de: JUAN " + cons.getCliente().getAutosComprados() + " le sobra: " + cons.getCliente().getPresupuesto());
		System.out.println(cons.getAutos());
		
	}
}
