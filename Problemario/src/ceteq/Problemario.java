package ceteq;

import java.util.Scanner;

public class Problemario {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		String cadena;
		
		int nota;
		int edad;
		String sexo;
		
		String tipoUva;
		int tama�oUva;
		int kilosUva;
		double precioInicial;
		double precioFinal;
		
		int numAlumnos;
		float precioPagar = 0;
		float precioAlumno = 0;
		
		int resultadoDado;
		
		int diaSemana;
		
		int mes;
		
		double pesoPackete;
		String ubicacion;
		double costoKg;
		double costoTotal = 0;
		
		//String sexo;
//		Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
//		System.out.print("Ingresa un numero: ");
//		num1 = sc.nextInt();
//		System.out.print("Ingresa otro numero: ");
//		num2 = sc.nextInt();
//		
//		if (num1 == num2) {
//			System.out.println("Los numeros son iguales");
//		}else if (num1 > num2) {
//			System.out.println("El numero: " + num1 + " es mayor");
//		}else {
//			System.out.println("El numero: " + num2 + " es mayor");
//		}

		
//		Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
//		System.out.print("Ingresa un numero: ");
//		num1 = sc.nextInt();
//		
//		if (num1 % 2 == 0) {
//			System.out.println("Es par");
//		}else {
//			System.out.println("No es par");
//		}
		
//		Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
//		Si el segundo n�mero es 0, debe mostrar un mensaje de error.
//		System.out.print("Ingresa un numero: ");
//		num1 = sc.nextInt();
//		System.out.print("Ingresa otro numero: ");
//		num2 = sc.nextInt();
//		
//		if (num2 != 0) {
//			System.out.println("El resultado de la operaci�n es: " + (num1 / num2));
//		}else{
//			System.out.println("No se puede realizar esta operaci�n");
//		}
		
//		Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
//		System.out.print("Ingresa una cadena de texto: ");
//		cadena = sc.nextLine();
//		
//		if (!cadena.equals(cadena.toLowerCase())) {
//			System.out.println("Es mayuscula");
//		}else {
//			System.out.println("Es minuscula");
//		}
		
//		Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes par�metros: edad, nota y sexo.
//		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
//		System.out.print("Ingresa la nota: ");
//		nota = sc.nextInt();
//		System.out.print("Ingresa la edad: ");
//		edad = sc.nextInt();
//		sc = new Scanner(System.in);
//		System.out.print("Ingresa el sexo: ");
//		sexo = sc.nextLine();
//		
//		if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
//			System.out.println("POSIBLE");
//		}else if(nota >= 5 && edad >= 18 && sexo.equals("F")){
//			System.out.println("ACEPTADA");
//		}else {
//			System.out.println("NO ACEPTADA");
//		}
		
//		La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
//		la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
//		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
//		se requiere determinar cuanto recibir� un productor por la uva que entrega en un embarque considerando 
//		lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos 
//		si es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		
//		System.out.print("Precio inicial: ");
//		precioInicial = sc.nextDouble();
//		System.out.print("Tama�o de uva: ");
//		sc = new Scanner(System.in);
//		tama�oUva = sc.nextInt();
//		System.out.print("Kilo de uva: ");
//		kilosUva = sc.nextInt();
//		System.out.print("Tipo de uva: ");
//		sc = new Scanner(System.in);
//		tipoUva = sc.nextLine();
//		
//		precioFinal = precioInicial * kilosUva;
//		
//		switch (tipoUva) {
//		case "A":
//				if (tama�oUva == 1) {
//					precioFinal += 0.20;
//				}else if (tama�oUva == 2) {
//					precioFinal += 0.30;
//				}
//			break;
//		case "B":
//			if (tama�oUva == 1) {
//				precioFinal -= 0.30;
//			}else if (tama�oUva == 2) {
//				precioFinal -= 0.50;
//			}
//			break;
//
//		default:
//			System.out.println("Tama�o no encontrado");
//			break;
//		}
//		System.out.println("Esto se le dar� al productor: " + precioFinal);
		
//		El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto debe 
//		cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. 
//		La forma de cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero 
//		de alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje.
		
//		System.out.print("Numero de alumnos: ");
//		numAlumnos = sc.nextInt();
//		
//		if (numAlumnos >= 100) {
//			precioAlumno = 65;
//			precioPagar = numAlumnos * precioAlumno;
//		} else if (numAlumnos >= 50 && numAlumnos <= 99) {
//			precioAlumno = 70;
//			precioPagar = numAlumnos * precioAlumno;
//		}else if (numAlumnos >= 30 && numAlumnos <= 49) {
//			precioAlumno = 95;
//			precioPagar = numAlumnos * precioAlumno;
//		}else if (numAlumnos < 30) {
//			precioPagar = 4000;
//			precioAlumno = 4000 / numAlumnos ;
//		}
//
//		System.out.println("El precio total del autob�s es: " + precioPagar);
//		System.out.println("El precio por alumno es: " + precioAlumno);
		
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, 
//		se mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		
//		System.out.print("Resultado del dado: ");
//		resultadoDado = sc.nextInt();
//		
//		if (resultadoDado == 1) {
//			System.out.println("SEIS");
//		} else if(resultadoDado == 2) {
//			System.out.println("CINCO");
//		} else if (resultadoDado == 3) {
//			System.out.println("CUATRO");
//		} else if (resultadoDado < 1 && resultadoDado > 6) {
//			System.out.println("ERROR: n�mero incorrecto");
//		}
		
//		Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. 
//		Si introducimos otro n�mero nos da un error.
		
//		System.out.print("Ingresa el dia de la semana: ");
//		diaSemana = sc.nextInt();
//		
//		switch (diaSemana) {
//		case 1:
//			System.out.println("Lunes");
//			break;
//		case 2:
//			System.out.println("Martes");
//			break;
//		case 3:
//			System.out.println("Miercoles");
//			break;
//		case 4:
//			System.out.println("Jueves");
//			break;
//		case 5:
//			System.out.println("Viernes");
//			break;
//		case 6:
//			System.out.println("Sabado");
//			break;
//		case 7:
//			System.out.println("Domingo");
//			break;
//		default:
//			System.out.println("ERROR");
//			break;
//		}
		
//		Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que 
//		tiene el mes correspondiente.

//		System.out.print("Ingresa un numero del 1 al 12");
//		mes = sc.nextInt();
//		
//		switch (mes) {
//		case 1:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 2:
//			System.out.println("Tiene 28 dias");
//			break;
//		case 3:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 4:
//			System.out.println("Tiene 30 dias");
//			break;
//		case 5:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 6:
//			System.out.println("Tiene 30 dias");
//			break;
//		case 7:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 8:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 9:
//			System.out.println("Tiene 30 dias");
//			break;
//		case 10:
//			System.out.println("Tiene 31 dias");
//			break;
//		case 11:
//			System.out.println("Tiene 30 dias");
//			break;
//		case 12:
//			System.out.println("Tiene 31 dias");
//			break;
//		default:
//			System.out.println("ERROR");
//			break;
//		}
		
		
		System.out.print("Zona a la que va: ");
		ubicacion = sc.nextLine();
		System.out.print("Ingrese el peso del paquete: ");
		pesoPackete = sc.nextDouble();
		
		if (pesoPackete <= 5) {
			switch (ubicacion) {
			case "America del Norte":
				costoKg = 24.00;
				costoTotal = pesoPackete * costoKg;
				break;
			case "America Central":
				costoKg = 20.00;
				costoTotal = pesoPackete * costoKg;
				break;
			case "America del Sur":
				costoKg = 21.00;
				costoTotal = pesoPackete * costoKg;
				break;
			case "Europa":
				costoKg = 10.00;
				costoTotal = pesoPackete * costoKg;
				break;
			case "Asia":
				costoKg = 18.00;
				costoTotal = pesoPackete * costoKg;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			System.out.println("El costo total es de: " + costoTotal);
		} else {
			System.out.println("No se pueden transportar paquetes con mas de 5kg");
		}
		
		
	}
	
}
