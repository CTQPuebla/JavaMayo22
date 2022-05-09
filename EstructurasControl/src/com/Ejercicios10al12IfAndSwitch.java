package com;

import java.util.Scanner;

public class Ejercicios10al12IfAndSwitch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
/*	System.out.println("------ Ejercicio 10 ---------");
//	Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

	System.out.println("Mes:");
	int mes=sc.nextInt();
	String tex;
	
	
	switch (mes) {
	case 1:
		System.out.println("ENERO" );
		break;
	case 2:
		System.out.println("FEBRERO" );
		break;
	case 3: 
		System.out.println("MARZO" );
		break;
	case 4:
		System.out.println("ABRIL" );
		break;
	case 5: 
		System.out.println("MAYO" );
		break;
	case 6: 
		System.out.println("JUNIO" );
		break;
	case 7: 
		System.out.println("JULIO" );
		break;
	case 8: 
		System.out.println("AGOSTO" );
		break;
	case 9: 
		System.out.println("SEPTIEMBRE" );
		break;
	case 10: 
		System.out.println("OCTUBRE" );
		break;
	case 11: 
		System.out.println("NOVIEMBRE" );
		break;
	case 12: 
		System.out.println("DICIEMBRE" );
		break;
		default:
			System.out.println("SOLO EXISTEN 12 MESES EN EL CALENDARIO" );
			break;
	}*/
	
	
	//--------------------------------------------------------------------------
	
	
	System.out.println("------ Ejercicio 11 ---------");
	
	System.out.println("TABLA DE COSTOS: \n 1.- América del Norte --> €24.00 \n 2.- América Central --> €20.00 \n 3.- América del Sur --> €21.00 \n 4.- Europa --> €10.00 \n 5.- Asia --> €18.00");
	
	System.out.println("Peso de paquete en Kg:");
	double Kg=sc.nextDouble();
	double total;
	if (Kg<5) {
	System.out.println("Ingrese el numero del destino:");
	int destino=sc.nextInt();
	

			
	switch (destino) {
	case 1:
		total= Kg*24;
		System.out.println("El total es: "+total);
		break;
	case 2:
		total= Kg*20;
				System.out.println("El total es: "+total);
		break;
	case 3: 
		total= Kg*21;
		System.out.println("El total es: "+total);
		break;
	case 4:
		total= Kg*10;
		System.out.println("El total es: "+total);
		break;
	case 5: 
		total= Kg*18;
		System.out.println("El total es: "+total);
		break;

		default:
			System.out.println("No existe ese destino" );
			break;
	}
	}else {
		System.out.println("El peso supera lo permitido" );
	}
	
	}

}
