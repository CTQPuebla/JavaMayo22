package com;

import java.util.Scanner;

public class Ejercicios6al9IfAndSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("------ Ejercicio 6 ---------");
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
//			* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//			* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
	/*	System.out.println("Ingrasa precio incial:");
		int precio = sc.nextInt();
		System.out.println("Ingrasa cantidad de venta en Kg:");
		double kg = sc.nextDouble();
		sc.nextLine();
	System.out.println("Ingrasa el tipo de uva A/B:");
	
	String tipo= sc.nextLine();
	
	System.out.println("Ingrasa el tamaño 1/2:");
	int tamaño = sc.nextInt();
	double total;
	
	switch (tipo) {
	
	case "A":
		
		if (tamaño == 1) {
			total = (precio * kg)+(kg*0.20);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tamaño "+tamaño+" da un total:"+total);
		}else if (tamaño == 2) {
			total = (precio * kg)+(kg*0.30);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tamaño "+tamaño+" da un total:"+total);
		}
		break;
	case "B":
		if (tamaño == 1) {
			total = (precio * kg)-(kg*0.30);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tamaño "+tamaño+" da un total:"+total);
		}else if (tamaño == 2) {
			total = (precio * kg)-(kg*0.50);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tamaño "+tamaño+" da un total:"+total);
		} else {
	}
		break;
	default:
		System.out.println("El tipo de uva no existe");
		break;
	}*/
		
		//--------------------------------------------------------------------------
/*		System.out.println("------ Ejercicio 7 ---------");
//		El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//			Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

		System.out.println("Alumnos");
		int alumnos=sc.nextInt();
		
		
			if (alumnos<30) {
				System.out.println("El costo es €4000");
			} else if (alumnos>= 30 && alumnos<=49){
				System.out.println("El costo es €95");
			} else if (alumnos>= 50 && alumnos<=99) {
			
				System.out.println("El costo es €70");
			} else if (alumnos>=100) {
				System.out.println("El costo es €65");
			}*/
		//--------------------------------------------------------------------------
/*		System.out.println("------ Ejercicio 8 ---------");
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		
		System.out.println("Número del dado:");
		int dado=sc.nextInt();
		String tex;
		
		
		switch (dado) {
		case 1:
			System.out.println("cara contraria seis" );
			break;
		case 2:
			System.out.println("cara contraria cinco" );
			break;
		case 3: 
			System.out.println("cara contraria cuatro" );
			break;
		case 4:
			System.out.println("cara contraria tres" );
			break;
		case 5: 
			System.out.println("cara contraria dos" );
			break;
		case 6: 
			System.out.println("cara contraria uni" );
			break;
			default:
				System.out.println("esa cara no existe en el dado" );
				break;
		}*/
		//--------------------------------------------------------------------------		
	/*	System.out.println("------ Ejercicio  9 ---------");
	//	Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.



		
		System.out.println("dia de la semana:");
		int dia=sc.nextInt();
		String tex;
		
		
		switch (dia) {
		case 1:
			System.out.println("domingo" );
			break;
		case 2:
			System.out.println(" lunes" );
			break;
		case 3: 
			System.out.println(" martes" );
			break;
		case 4:
			System.out.println(" miércoles" );
			break;
		case 5: 
			System.out.println("jueves" );
			break;
		case 6: 
			System.out.println("viernes" );
			break;
		case 7: 
			System.out.println(" sabdo" );
			break;
			default:			
				
				System.out.println("la semana sólo tiene 7 días" );
				break;
		}*/
	}
}

	
	
	
	
	


