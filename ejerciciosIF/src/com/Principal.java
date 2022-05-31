package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Ejercicio e= new Ejercicio();
		String r="";
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("ingresa el umero de ejercicio que desea visualizar");
			System.out.println("1.-Numero mayor\n2.-Numero par\n3.-"
					+ "division\n4.-Mayusculas\n5.-solicitud\n"
					+ "6.-Precio uvas\n7.-Excursion\n"
					+ "8.-Dado\n9.-Dias de la semana\n10.-"
					+ "Dias del mes\n11.-Transporte de paquete\n"
					+ "12.-Indice de Masa Corporal\n"
					+ "13.-Donacion\n14.-Salario");
			r=scan.nextLine();
			
			switch(r) {
			case "1":
				e.mayor();
				break;
			case "2":
				e.par();
				break;
			case "3":
				e.division();
				break;
			case "4":
				e.mayuscula();
				break;
			case "5":
				e.solicitud();
				break;
			case "6":
				e.precio();
				break;
			case "7":
				e.cuota();
				break;
			case "8":
				e.dado();
				break;
			case "9":
				e.dia();
				break;
			case "10":
				e.mes();
				break;
			case "11":
				e.transporte();
				break;
			case "12":
				e.IMC();
				break;
			case "13":
				e.donacion();
				break;
			case "14":
				e.salario();
				break;
				
				default:
					System.out.println("opcion invalida");
			}
			
			System.out.println("deseas realizar otro ejercicio?");
			r=scan.nextLine();
			
		}while("si".equalsIgnoreCase(r));
	}
}
