package com;

import java.util.Scanner;

public class Ejercicios6al9IfAndSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	//	System.out.println("------ Ejercicio 6 ---------");
//		La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cuanto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
//			* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//			* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
	/*	System.out.println("Ingrasa precio incial:");
		int precio = sc.nextInt();
		System.out.println("Ingrasa cantidad de venta en Kg:");
		double kg = sc.nextDouble();
		sc.nextLine();
	System.out.println("Ingrasa el tipo de uva A/B:");
	
	String tipo= sc.nextLine();
	
	System.out.println("Ingrasa el tama�o 1/2:");
	int tama�o = sc.nextInt();
	double total;
	
	switch (tipo) {
	
	case "A":
		
		if (tama�o == 1) {
			total = (precio * kg)+(kg*0.20);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tama�o "+tama�o+" da un total:"+total);
		}else if (tama�o == 2) {
			total = (precio * kg)+(kg*0.30);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tama�o "+tama�o+" da un total:"+total);
		}
		break;
	case "B":
		if (tama�o == 1) {
			total = (precio * kg)-(kg*0.30);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tama�o "+tama�o+" da un total:"+total);
		}else if (tama�o == 2) {
			total = (precio * kg)-(kg*0.50);
			System.out.println("El total de "+kg+"Kg de uva, tipo "+tipo+" de tama�o "+tama�o+" da un total:"+total);
		} else {
	}
		break;
	default:
		System.out.println("El tipo de uva no existe");
		break;
	}*/
		
		//--------------------------------------------------------------------------
/*		System.out.println("------ Ejercicio 7 ---------");
//		El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de cobrar es la siguiente:
//			* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos.
//			Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.

		System.out.println("Alumnos");
		int alumnos=sc.nextInt();
		
		
			if (alumnos<30) {
				System.out.println("El costo es �4000");
			} else if (alumnos>= 30 && alumnos<=49){
				System.out.println("El costo es �95");
			} else if (alumnos>= 50 && alumnos<=99) {
			
				System.out.println("El costo es �70");
			} else if (alumnos>=100) {
				System.out.println("El costo es �65");
			}*/
		//--------------------------------------------------------------------------
/*		System.out.println("------ Ejercicio 8 ---------");
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		
		System.out.println("N�mero del dado:");
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
	//	Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.



		
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
			System.out.println(" mi�rcoles" );
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
				
				System.out.println("la semana s�lo tiene 7 d�as" );
				break;
		}*/
	}
}

	
	
	
	
	


