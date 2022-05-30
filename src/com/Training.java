package com;

import java.util.Scanner;

public class Training {

	public static void main (String[] args) {
		
//6._El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
// compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
			
//	Scanner sc= new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int z=sc.nextInt();
//		int n=sc.nextInt();
//				
//	System.out.println("Numero de niños que asistiran al viaje");
//				
//		if(x>100) {
//	System.out.println("Si son 100 alumnos el costo sera de" +65 );
//		}

//------------------------------------------------------------------------------------------------------------------------------------------				
//	Hacer un programa que calcule el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int horas ;
//		int salario;
//		double salarioporhora;
//		double salariosemanal;
//		int x = 48;
//		
//		System.out.println("Ingrese el numero de horas trabajadas por semana ");
//		
//		horas = sc.nextInt();
//		
//		System.out.println("Ingrese el salario que se ganara por semana ");
//		
//		salario = sc.nextInt();
//		
//		salarioporhora= salario/x;
//		
//		System.out.println("El pago por hora del empleado en cuestión sera de " +salarioporhora);
//		//Por ley solo se puede trabajar 48 horas por semana**
//		
//		salariosemanal= salarioporhora*horas;
//		
//		System.out.println("El salario semanal del trabajador sera de :" +salariosemanal+ " pesos " + "por " +horas+ " horas " );
		
//Ejercicio 4._ Un compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comision de $150 por cada carro 
//vendido, mas 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la 
//computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensaual de un vendedor dado
		
//		Scanner sc = new Scanner (System.in);
//		
//		
//		int salario = 1000;
//		int comision= 150;
//		double porcentaje=.05;
//		
//		System.out.println("Ingresa el valor del carro ");
//		double valordelcarro = sc.nextDouble();
//		
//		double porcentajedeganacia =(valordelcarro*porcentaje);
//		
//		System.out.println("La comisión por el carro vendido es de: " +comision+ " pesos");
//			System.out.println("Mas el 5% del valor del carro que es de " +porcentajedeganacia+ " pesos " );
//		double salariomascomisiones= salario+comision+porcentajedeganacia;
//
//				System.out.println("Por lo que el salario mensual del vendedor sera de " +salariomascomisiones);
		
		
// Hacer un programa que calcule el cuadrado de una suma (a+b) =a^2 +b^2+ 2ab
		
		
//		Scanner sc= new Scanner(System.in);
//		
//
//		System.out.println("Ingresar el valor de a");
//		
//		int a = sc.nextInt();
//		
//		System.out.println("Ingresa el valor de b");
//		
//		int b= sc.nextInt();
//		
//		int cuadrado1= a*a;
//		int cuadrado2= b*b;
//		
//		System.out.println("El valor del cuadrado del programa es: "+cuadrado1+ "+"+cuadrado2+"+"+2*a*b);
//		
//		int Suma= cuadrado1 + cuadrado2 + (2*a*b);
//				
//		System.out.println("El total de la suma es de: " +Suma );
		
//	1000 horas = 5 semanas, 6 dias y 16 horas
		
//		Scanner sc= new Scanner(System.in);
//		
//		
//		System.out.println("Ingresar el numero de horas que se transformaran a Semanas, dias y horas");
//		
//		int x= sc.nextInt();
//		
//		int s = x/168;
//		int d = (x %168 / 24);
//		int h= x % 24;
//		
//				System.out.println("Se tienen:" + s+ " Semanas");
//				
//				System.out.println(d+ " días");
//				System.out.println("y " +h+ " horas ");
//				System.out.println("en " +x+ " horas" );
			
//------------------------------------------------------------------------------------
// Pedir 2 numeros y decidir cual es mayor o si son iguales
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Ingresa dos numero para determinar cual es mayor");
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		
		if ( x > y) {
			System.out.println(x+" Es mayor que " + y);
		
		} else if (y == x) {
		System.out.println("Los numeros son iguales");
		
		}else if (x < y) {
			System.out.println(y+ " Es mayor que " +x);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
				


