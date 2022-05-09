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
		int tamañoUva;
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
//		Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
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

		
//		Realiza un programa que pida un número por teclado y nos indique si es par o impar.
//		System.out.print("Ingresa un numero: ");
//		num1 = sc.nextInt();
//		
//		if (num1 % 2 == 0) {
//			System.out.println("Es par");
//		}else {
//			System.out.println("No es par");
//		}
		
//		Crea un programa que pida al usuario dos números y muestre el resultado de su división.
//		Si el segundo número es 0, debe mostrar un mensaje de error.
//		System.out.print("Ingresa un numero: ");
//		num1 = sc.nextInt();
//		System.out.print("Ingresa otro numero: ");
//		num2 = sc.nextInt();
//		
//		if (num2 != 0) {
//			System.out.println("El resultado de la operación es: " + (num1 / num2));
//		}else{
//			System.out.println("No se puede realizar esta operación");
//		}
		
//		Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
//		System.out.print("Ingresa una cadena de texto: ");
//		cadena = sc.nextLine();
//		
//		if (!cadena.equals(cadena.toLowerCase())) {
//			System.out.println("Es mayuscula");
//		}else {
//			System.out.println("Es minuscula");
//		}
		
//		Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
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
		
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
//		la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
//		se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando 
//		lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos 
//		si es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		
//		System.out.print("Precio inicial: ");
//		precioInicial = sc.nextDouble();
//		System.out.print("Tamaño de uva: ");
//		sc = new Scanner(System.in);
//		tamañoUva = sc.nextInt();
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
//				if (tamañoUva == 1) {
//					precioFinal += 0.20;
//				}else if (tamañoUva == 2) {
//					precioFinal += 0.30;
//				}
//			break;
//		case "B":
//			if (tamañoUva == 1) {
//				precioFinal -= 0.30;
//			}else if (tamañoUva == 2) {
//				precioFinal -= 0.50;
//			}
//			break;
//
//		default:
//			System.out.println("Tamaño no encontrado");
//			break;
//		}
//		System.out.println("Esto se le dará al productor: " + precioFinal);
		
//		El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe 
//		cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
//		La forma de cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número 
//		de alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
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
//		System.out.println("El precio total del autobús es: " + precioPagar);
//		System.out.println("El precio por alumno es: " + precioAlumno);
		
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
//		se mostrará el mensaje: “ERROR: número incorrecto”.
		
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
//			System.out.println("ERROR: número incorrecto");
//		}
		
//		Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
//		Si introducimos otro número nos da un error.
		
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
		
//		Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que 
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
