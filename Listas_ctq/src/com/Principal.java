package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

//		//Instanciar una lista
//		List<String> lista = new ArrayList<>();
//		
//		
//		
//		//Añadir elementos a un lista
//		lista.add("etgdfg");
//		lista.add("uno");
//		lista.add("2");
//		lista.add("4");
//		lista.add("seis");
//		
//		System.out.println(lista);
//		
//		//Pedirle elementos a la lista
//		System.out.println(lista.get(3));
//		
//		
//		//Eliminar elementos de la lista
//		lista.remove(2);  //indice
//		System.out.println(lista);
//		
//		
//		lista.remove("seis");  //copia del objeto a eliminar
//		System.out.println(lista);
//		
//		//ver el tamaño de la lista
//		System.out.println(lista.size());
//		
//		//Colocar un valor en una determinada posicion
//		lista.add(2, "5");
//		System.out.println(lista);
//	
//		//Ver el indice de un determinado valor de la lista
//		System.out.println(lista.indexOf("uno"));
//		
//		//Reemplazar un valor con otro en una posicion especifica
//		lista.set(2, "hola");
//		System.out.println(lista);

		// Autos
		Auto a1 = new Auto("Corvette", "Chevrolet", 10000);
		Auto a2 = new Auto("Demon", "Dodge", 8000);
		Auto a3 = new Auto("P1", "Mclaren", 10000);
		Auto a4 = new Auto("GT", "Ford", 10050);
		Auto a5 = new Auto("SLR", "Mercedes", 11000);
		Auto a6 = new Auto("M5", "BMW", 20000);
		Auto a7 = new Auto("Grand Prix", "Pontiac", 5000);
		Auto a8 = new Auto("Diablo", "Lamborghini", 150000);
		Auto a9 = new Auto("F40", "Ferrari", 200000);
		Auto a10 = new Auto("Camaro", "Chevrolet", 7000);
		Auto a11 = new Auto("R8", "Audi", 100000);
		Auto a12 = new Auto("Carrera GT", "Porsche", 110000);
		Auto a13 = new Auto("Veyron", "Bugatti", 1000000);
		Auto a14 = new Auto("Tsuru", "Nissan", 10);
		Auto a15 = new Auto("Versa", "Nissan", 11);

		List<Auto> autosConcesionario = new ArrayList<Auto>();

		autosConcesionario.add(a1);
		autosConcesionario.add(a2);
		autosConcesionario.add(a3);
		autosConcesionario.add(a4);
		autosConcesionario.add(a5);
		autosConcesionario.add(a6);
		autosConcesionario.add(a8);
		autosConcesionario.add(a9);
		autosConcesionario.add(a10);
		autosConcesionario.add(a11);
		autosConcesionario.add(a12);
		autosConcesionario.add(a13);
		autosConcesionario.add(a14);
		autosConcesionario.add(a15);

		Cliente c1 = new Cliente("Irving", 458383088);
		Cliente c2 = new Cliente("Fernanda", 10);
		Cliente c3 = new Cliente("Manuel", 9957459);
		Cliente c4 = new Cliente("Luis", 9584958);
		Cliente c5 = new Cliente("Sandra", 85840949);

		List<Cliente> clientes = new ArrayList<Cliente>();

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);

		Concesionario con = new Concesionario("Calle 1", autosConcesionario, clientes);

		con.venderAuto("Fernanda", "Diablo");
		con.venderAuto("Fernanda", "Diablo");
		con.venderAuto("Fernanda", "Diablo");
		con.venderAuto("Fernanda", "Carrera GT");
		con.venderAuto("Fernanda", "M5");
		con.venderAuto("Fernanda", "Veyron");


		System.out.println(con.getClientes().get(1).getNombre());
		System.out.println(con.getClientes().get(1).getCredito());

	}

}
