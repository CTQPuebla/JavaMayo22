package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota = 0;
		int edad =0;
		String sexo = "";
		
		System.out.println("Ingresa la nota");
		nota=sc.nextInt();
		System.out.println("Ingresa la edad");
		edad=sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa el sexo");
		sexo = sc.nextLine();
		
		if(nota>=5 && edad>=18 && sexo.equals("M")) {
			System.out.println("Solicitud posible");
		}else if(nota>=5 && edad>=18 && sexo.equals("F")) {
			System.out.println("Solicitud aceptada");
		}else {
			System.out.println("No aceptada");

		}
	}

}
