package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		/*Ejercicio 1
		 * crea un programa que permita ingresar un numero de alumnos, 
		 * sus respectivas calificaciones de  sus 3 parciales y su calificacion final
		 * promediada de los 3 parciales
		 */
		
		/*Ejercicio 2
		 * crea un programa que acepte numeros de cualquier tipo y muestre al final
		 * cuales son los numeros pares e impares que se ingresaron
		 */
		
		Ejercicio1 e1 = new Ejercicio1();
		Ejercicio2 e2 = new Ejercicio2();
		Matriz m = new Matriz();
		Scanner scan=new Scanner(System.in);
		int r;
		String res="";
		
		do {
			System.out.println("ingresa el numero de ejercicio que deseas realizar:\n"
					+"1.-Promedio de calificacciones de alumnos\n2.-Numeros pares e impares"
					+ "\n3.-Matrices");
			r = scan.nextInt();
			
			switch(r) {
			case 1:
				e1.alumnos();
				break;
			case 2:
				e2.numeros();
				break;
			case 3:
				m.sumaMatrices();
				break;
				default:
					System.out.println("numero de ejercicio invalido");
			}
			
			System.out.println("deseas realizar otro ejercicio?");
			res=scan.nextLine();
			res=scan.nextLine();
		}while("si".equalsIgnoreCase(res));
	}

}
