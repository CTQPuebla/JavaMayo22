package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k1,k2;
		Agenda a1 = new Agenda ();
		HashMap<String, Contacto> llenarA = new HashMap<>();
		llenarA.put("Jorge", new Contacto("Jorge", "jorge@gmail.com","2278905467"));
		llenarA.put("Ricardo", new Contacto("Ricardo", "ricardo@gmail.com","2256432156"));
		llenarA.put("Hector", new Contacto("Hector", "hector@gmail.com","2209764873"));
		llenarA.put("Omar", new Contacto("Omar", "omar@gmail.com","2283497218"));
		
	
		HashMap<String, Contacto> llenarB = new HashMap<>();
		llenarB.put("jorge@gmail.com", new Contacto("Jorge", "jorge@gmail.com","2278905467"));
		llenarB.put("ricardo@gmail.com", new Contacto("Ricardo", "ricardo@gmail.com","2256432156"));
		llenarB.put("hector@gmail.com", new Contacto("Hector", "hector@gmail.com","2209764873"));
		llenarB.put("omar@gmail.com", new Contacto("Omar", "omar@gmail.com","2283497218"));

		
		a1.llenar1(llenarA);
		a1.llenar2(llenarB);
		System.out.println(llenarA);
		System.out.println("Introduzca el correo del contacto que desea borrar:");
		k2 = sc.next();
		k1 = a1.getAgendaC().get(k2).getNombre();
		a1.llenar3(k1, k2);
		a1.borrar();
		System.out.println(a1.getAgendaN());
	}

}
