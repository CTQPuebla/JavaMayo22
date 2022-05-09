package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int diaSemana;
		
		
		System.out.println("Ingresa el numero del dia de la semana: ");
		diaSemana=sc.nextInt();
		
		switch (diaSemana) {
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
	      System.out.println("Jueves.");
	      break;
	    case 5:
	      System.out.println("Viernes");
	      break;
	    case 6:
	      System.out.println("Sabado");
	      break;
	    case 7:
	    	System.out.println("Domingo");
	    default:
	      System.out.println("ERROR: número incorrecto.");
		
	}

	}
}
