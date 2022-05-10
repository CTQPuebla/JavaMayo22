package Scanner;

import java.util.Scanner;

public class Problemario {
	private static Scanner sc;

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa un nombre");
//		String m = sc.nextLine();
//		System.out.println(m);		
		
		//-------------------------------------------------------------------------------------------------------

		//1._Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
//		Scanner sc =new Scanner(System.in); //Leer valores del teclado
//		System.out.println("Ingresa dos numeros para saber si son mayores, menores o iguales");
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		//Proceso
//		if (x < y) {
//			System.out.println("El segundo numero es mayor");
//		}else if (y < x) {
//				System.out.println("El primer numero es mayor");
//		}else if (x == y)
//				System.out.println("Ambos numeros son iguales");
//------------------------------------------------------------------------------------------	
		//2. Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa un numero para saber si es par o impar");
//		
//		int n = sc.nextInt(); 
//		
//		if (n % 2 == 0) {
//			System.out.println("El numero es par");
//		
//		}else {
//			System.out.println("El numero es impar");
//		}
//--------------------------------------------------------------------------------------------
		//3._ Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa el numero 1");
//		double xx = sc.nextDouble();
//		System.out.println("Ingresa el numero 2");
//		double xy = sc.nextDouble();
//		
//		if(xy==0) {
//			System.out.println("Error");
//		}else {
//			//Jerarquia de operadores
//			double aa=xx/xy;
//			System.out.println("Resultado: "+ aa);
//		}
//-----------------------------------------------------------------------------
		//4._ Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa una letra");
//		String letra = sc.nextLine();
//		
// 		if(letra.equals(letra.toUpperCase())) {
//			System.out.println("Si es mayuscula");
//		}else {
//			System.out.println("No es mayuscula");
//		}
//-------------------------------------------------------------------------
		//5._
//		Scanner sc =new Scanner(System.in); 
//		
//		int nota = 0;
//		int edad = 0;
//		String sexo = "";
//		
//		System.out.println("Ingresa la nota");
//		nota = sc.nextInt();
//		System.out.println("Ingresa la edad");
//		edad=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Ingresa el sexo");
//		sexo = sc.nextLine();
//		
//		if(nota>=5 && edad>=18 && sexo.equals("M")) {
//			System.out.println("Solicitud posible");
//		}else if(nota>=5 && edad>=18 && sexo.equals("F")) {
//			System.out.println("Solicitud aceptada");
//		}else {
//			System.out.println("No aceptada");
//		}
		
//--------------------------------------------------------------------------------------------------
//6._ La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

//		Scanner sc = new Scanner(System.in);
//		
//  System.out.println("Ingresar los kg de uva entregada");
//  
//  int x= sc.nextInt();
//  System.out.println("Primer precio por kg de uvas");
//  
//  Boolean y= sc.hasNextDouble();
//  System.out.println("Uva tipo \"A\" o \"B\":");
//  
//  int z= sc.nextInt();
//  System.out.println("Tamaño de uva \"1\" o \"2\":");
//  
//	      }

		
//7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
		//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		//* De 50 a 99 alumnos, el costo es de 70 euros.
		//* De 30 a 49 alumnos, el costo es de 95 euros.
		//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Ingresar numero de niños que iran al viaje escolar");
//		int x = sc.nextInt();
//		
//		//Proceso
//		if (x>=100) {
//			System.out.println("Se pagara a la compañia " +x*65+ " euros");
//			
//		}else if (x<99 && x>=50) {
//			System.out.println("Se pagara a la compañia " +x*70+ " euros");
//			
//		}else if (x<49 && x>=30) {
//			System.out.println("Se pagara a la compañia " +x*95+ " euros");
//			
//		}else if (x<30) {
//			System.out.println("Se pagara a la compañia 4000 euros, dando igual a " +4000/x+ " euros por alumno");
//				}
//----------------------------------------------------------------------------------------------------------------------------------------		
//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla 
//el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero opuesto a la cara que desea conocer");
		
		String x = sc.toString();
		
		
		switch(x) {
		
		case "1":
			System.out.println("El resultado es seis");
		break;
		case "2":
			System.out.println("El resultado es cinco");
			break;
		case "3":
			System.out.println("El resultado es cuatro");
			break;
		case "4":
			System.out.println("El resultado es tres");
			break;
		case "5":
			System.out.println("El resultado es dos");
			break;
		case "6":
			System.out.println("El resultado es uno");
			break;
		
			default:
				System.out.println("ERROR: número incorrecto");
		

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//---------------------------------------------------------------------------------------------------------------------------

//12._Construir un programa que calcule el índice de masa corporal de una persona 
//(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se 
//encuentra esa persona en función del valor de IMC:
		 
//    Scanner sc=new Scanner(System.in);
//    
//       System.out.println("Ingrese su peso");
//       int x= sc.nextInt();
//       
//       System.out.println("Ingrese su altura");
//       double y = sc.nextDouble();
//       
//       double imc =(x/y*y);
//       
//       if(imc<16) {
//    	   System.out.println("Criterio de ingreso al hosítal");
//       }else if (imc<17) {
//    	   System.out.println("Infrapeso");
//    	   
//       }else if (imc<18) {
//    	   System.out.println("Bajo peso");
//    	   
//       }else if (imc<25) {
//    	   System.out.println("Peso Normal (Saludable)");
//    	   
//       }else if (imc<30) {
//    	   System.out.println("sobrepeso (Obesidad de 1° Grado)");
//    	   
//       }else if (imc<35) {
//    	   System.out.println("sobrepeso cronico (Obesidad de 2° Grado)");
//    	   
//       }else if (imc<39) {
//    	   System.out.println("obesidad premorbico (Obesidad de 3° Grado)");
//    	   
//       }else if (imc<40) {
//    	   System.out.println("obesidad morbida (Obesidad de 4° Grado)");
//       }
       
       
//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

//System.out.println("Ingresa un numero del 1 al 12");
//		
//		int mes = sc.nextInt();
//		
//		switch (mes) {
//		
//		case 1:
//			System.out.println("31 días");
//			break;
//			
//		case 2:
//			System.out.println("28 días");
//			break;
//			
//			default:
//				System.out.println("No existe ese mes");
//			
//		}
       
       
       
       


			
		
		}
}
