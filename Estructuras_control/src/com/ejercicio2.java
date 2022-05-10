package com;

import java.util.Scanner;

public class ejercicio2 {
	private static String ln;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* par o impar 
		System.out.println("ingrese un numero");
		int a = sc.nextInt();
		if ((a%2) == 0) {
			System.out.println("Par");
		}else {
			System.out.println("impar");
		} */
		
		/* ejercicio tres 
		System.out.println("ingrese un numero");
		double a = sc.nextInt();
		System.out.println("ingrese un segundo numero diferente de cero ");
		double b = sc.nextInt();
		if (b != 0) {
			double c = a/b;
			System.out.println(c);
		} else {
			System.out.println("error");
		} */
		
		/* ejercicio 4
		System.out.println("ingrese una letra");
		String a = sc.nextLine();
		if (Character.isUpperCase(a.charAt(0))){
			System.out.println("Mayuscula");
		} else{
			System.out.println("Minuscula");
		} */
		
		/* ejercicio 5
		
		int n = 5; 
		int e = 18;
		char s = 'F';
		
		if ((n == 5) && (e == 18) && (s == 'M')) {
			System.out.println("Posible");
		} else if ((n == 5) && (e == 18) && (s == 'F')) {
			System.out.println("Aceptada");
		} else {
				System.out.println("No aceptada");
		}  */
		
		/* ejercicio 6
		System.out.println("ingrese el tipo de uva");
		String tu = sc.nextLine();
		double pi = 10;
		double pf;
		System.out.println("ingrese el tamaño de uva");
		int tm = sc.nextInt();
		int tm1 = 1;
		int tm2 = 2;
		String tu1 = "A";
		String tu2 = "B";
		if ((tu.equals(tu1)) && (tm == tm1)) {
			pf = pi + 0.20;
			System.out.println("El precio final es " + pf);
		} else if ((tu.equals(tu1)) && (tm == tm2)){
			
			pf = pi + 0.30;
			System.out.println("El precio final es " + pf);
		} else if ((tu.equals(tu2)) && (tm == tm1)){
			
			pf = pi - 0.30;
			System.out.println("El precio final es " + pf);
		} else if ((tu.equals(tu2)) && (tm == tm2)){
			
			pf = pi - 0.50;
			System.out.println("El precio final es " + pf);
		} else {
			System.out.println("Ingreso un dato invalido");
		} */
		
		/* ejercicio 7
	System.out.println("ingrese el numero de alumnos que asistiran al viaje");
	int na = sc.nextInt();
	if (na >= 100) {
		System.out.println("Costo por alumno de 65 Euros");
	}else if ((na>=50) && (na<=99)) {
		System.out.println("Costo por alumno de 70 Euros");
	} else if ((na>=30) && (na<=49)) {
		System.out.println("Costo por alumno de 95 Euros");
	} else {
		System.out.println("Costo por renta del autobus 4000 Euros");
	} */
	
	/* ejercicio 8
	String n1 = "Uno";
	String n2 = "Dos";
	String n3 = "Tres";
	String n4 = "Cuatro";
	String n5 = "Cinco";
	String n6 = "Seis";
	String n = "";
	System.out.println("ingrese el numero obtenido al lanzar el dado");
	int no = sc.nextInt();
	if((no < 1) && (no>6)) {
		System.out.println("ERROR Numero incorrecto");
	}
	if ((no == 1) || (no == 6)) {
		if (no == 1) {
			n = n6;
			System.out.println(n);
		} else {
			n = n1;
			System.out.println(n);
		}
		
	} else if ((no == 2) || (no == 5)) {
		if (no == 2) {
			n = n5;
			System.out.println(n);
		} else {
			n = n2;
			System.out.println(n);
		}
		
	} else if ((no == 3) || (no == 4)) {
		if (no == 3) {
			n = n4;
			System.out.println(n);
		} else {
			n = n3;
			System.out.println(n);
		}
		
	} */
	
		/* ejercicio 9
		System.out.println("ingrese el numero correspondiente al dia de la semana");
		int nd = sc.nextInt();
		if ((nd < 1) || (nd > 7)) {
			System.out.println("ERROR");
		}
		switch (nd) {
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		} */
		
		/* ejercicio 10
		
		System.out.println("ingrese el numero de un mes");
		int nd = sc.nextInt();
		if ((nd < 1) || (nd > 12)) {
			System.out.println("ERROR");
		}
		switch (nd) {
		
		case 1:
			System.out.println(" Enero 31 dias ");
			break;
		case 2:
			System.out.println("Febrero 28 dias");
			break;
		case 3:
			System.out.println("Marzo 31 dias");
			break;
		case 4:
			System.out.println("Abril 30 dias ");
			break;
		case 5:
			System.out.println("Mayo 31 dias");
			break;
		case 6:
			System.out.println("Junio 30 dias");
			break;
		case 7:
			System.out.println("Julio 31 dias");
			break;
		case 8:
			System.out.println("Agosto 31 dias");
			break;
		case 9:
			System.out.println("Septiembre 30 dias");
			break;
		case 10:
			System.out.println("Octubre 31 dias");
			break;
		case 11:
			System.out.println("Noviembre 30 dias");
			break;
		case 12:
			System.out.println("Diciembre 31 dias");
			break;
		} */
	}
}
