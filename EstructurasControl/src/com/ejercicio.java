package com;

import java.util.Scanner;

public class ejercicio {
	public static void main(String[] args) {
		//Un Numero
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Ingresa un numero");
		//int h = sc.nextInt();
		
	//------------------------------------------------------------------------
		
		//Cadena de caracteres
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Ingresa un nombre");
		//String h = sc.nextLine();
		
	//------------------------------------------------------------------------
		
		//Realiza un programa que reciba dos n�meros por teclado e indique cu�l 
		//es mayor o si son iguales.
		
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Ingresa el primer numero");
		//int h = sc.nextInt();
		//System.out.println("Ingresa el segundo numero");
		//int i = sc.nextInt();
		//if(h>i) {
			//System.out.println("El Primer Valor es el Mayor");
		//}else if(h<i){
			//System.out.println("El Segundo Valor es el Mayor");
			//
			
		//}
		
	//------------------------------------------------------------------------------------
		//Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		
		//Scanner sc =new Scanner(System.in);
				//System.out.println("Ingresa el numero");
				//int a = sc.nextInt();
				// if (a % 2 == 0) {
				   //  System.out.printf( "ES PAR" );
			        //}
			        //else
			        //{
			         //   System.out.printf( "ES IMPAR" );
			        
				
				    //}
				 
	//--------------------------------------------------------------------------------------
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error.	
		
		
		//Scanner reader =new Scanner(System.in);
		//int h =0;
		//int i =0;
		
			//	System.out.println("Ingresa el primer numero");
				// h = reader.nextInt();
			//	System.out.println("Ingresa el segundo numero");
				// i = reader.nextInt();
				
				//if(i==0) {
					//System.out.println("Error");
				//}else {
					//Jerarquia de operadores
				//	int resultado =h/i;
					//System.out.println("La divisi�n es " + h + " / " + i + " = " + resultado);
				//}
		
		//---------------------------------------------------------------------------------------
		
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Ingresa una letra");
		//String letra = sc.nextLine();
		
 		//if(letra.equals(letra.toUpperCase())) {
			//System.out.println("Si es Mayuscula");
		//}else {
			//System.out.println("No es Mayuscula");
		//}
		
		//---------------------------------------------------------------------------------------
		
		//Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes 
		//par�metros: edad, nota y sexo.
		//* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		//Scanner sc =new Scanner(System.in);
		//int nota=0;
		//int edad=0;
		//String sexo = "";
		//System.out.println("Ingresa la nota");
		//nota=sc.nextInt();
		//System.out.println("Ingresa la edad");
		//edad=sc.nextInt();
		//sc.nextLine();
		//System.out.println("Ingresa el sexo");
		//sexo = sc.nextLine();
		
		//if(nota>=5 && edad>=18 && sexo.equals("M")) {
			//System.out.println("Solicitud posible");
		//}else if(nota>=5 && edad>=18 && sexo.equals("F")) {
			//System.out.println("Solicitud aceptada");
		//}else {
			//System.out.println("No aceptada");
		//}
		
		//-------------------------------------------------------------------------------------------
		
		
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la 
		//venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cuanto recibir� 
		//un productor por la uva que entrega en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 
		//c�ntimos si es de tama�o 2.
		//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es 
		//de tama�o 2.

//		Scanner scanner = new Scanner(System.in);
//	    int kilos;
//	    double precioInicial;
//	    String tipo;
//	    int tamano;
//	// Solicitud de datos al usuario
//	    System.out.println("Este programa calcula la ganancia seg�n el tipo de vino, tama�o y cantidad vendida:");
//	    System.out.print("Introduce los Kg. de uva entregada: ");
//	    kilos = scanner.nextInt();
//	    System.out.print("Precio por Kg. inicial: ");
//	    precioInicial = scanner.nextDouble();
//	    System.out.print("Uva de valor \"A\" � \"B\": ");
//	    tipo = scanner.next(); scanner.nextLine();
//	    System.out.print("Tamano de uva \"1\" � \"2\": ");
//	    tamano = scanner.nextInt();
//	// Realizamos C�lculos y mostramos en pantalla
//	    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
//	        (tamano == 1 || tamano == 2))) {
//	      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
//	    } else {
//	      if (tipo.toUpperCase().equals("A") && tamano == 1) {
//	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
//	      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
//	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
//	      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
//	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
//	      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
//	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
//	      }
	    //}
		
		//-----------------------------------------------------------------------------------------
		
//		El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma 
//		de cobrar es la siguiente:
//			* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el 
//			n�mero de alumnos.
//			Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//			pagar cada alumno por el viaje.
		
//		
//		Si n >= 100 Entonces
//				total = n * 65
//			SiNo
//				Si n >= 50 Entonces
//					total = n * 70
//				SiNo
//					Si n >= 30 Entonces
//						total = n * 95
//					SiNo
//						total = 4000
//					FinSi
//				FinSi
//			FinSi
//			Escribir "El total a pagar por alumno es: $", total / n
//			Escribir "El total a pagar por la renta del autobus es: $",total
//		FinAlgoritmo
		
//CODIGO-PROGRAMA---------------------------------------------------------------------------------
		
//		  Scanner scanner = new Scanner(System.in);
//		    int numeroAlumnos;
//		// Solicitud de datos al usuario
//		   
//		    System.out.print("N�mero de alumnos: ");
//		    numeroAlumnos = scanner.nextInt();
//		// Realizamos C�lculos y mostramos en pantalla
//		    if (numeroAlumnos >= 100) {
//		      System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
//		          + "euros y cada alumno debe pagar 65 euros");
//		    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
//		      System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
//		          + "euros y cada alumno debe pagar 70 euros");
//		    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
//		      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
//		          + "euros y cada alumno debe pagar 95 euros");
//		    } else {
//		      System.out.println("El coste del autob�s es de 4000 euros y cada alumno "
//		          + "debe pagar " + (4000/numeroAlumnos) + " euros.");
//		    } 
//		  }
//				
//	  }
		
		
		//----------------------------------------------------------------------------------------
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al 
//		resultado obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el 
//		mensaje: �ERROR: n�mero incorrecto�.
//
//		Scanner scanner = new Scanner(System.in);
//	    int dado;
//	// Solicitud de datos al usuario
//	    
//	    System.out.print("Resultado de la cara obtenida: ");
//	    dado = scanner.nextInt();
//	// Realizamos comparaciones y mostramos el resultado
//	    switch (dado) {
//	    case 1:
//	      System.out.println("En la cara opuesta est� el \"seis\".");
//	      break;
//	    case 2:
//	      System.out.println("En la cara opuesta est� el \"cinco\".");
//	      break;
//	    case 3:
//	      System.out.println("En la cara opuesta est� el \"cuatro\".");
//	      break;
//	    case 4:
//	      System.out.println("En la cara opuesta est� el \"tres\".");
//	      break;
//	    case 5:
//	      System.out.println("En la cara opuesta est� el \"dos\".");
//	      break;
//	    case 6:
//	      System.out.println("En la cara opuesta est� el \"uno\".");
//	      break;
//	    default:
//	      System.out.println("ERROR: n�mero incorrecto.");
//	    }
//	  }
//	}
		
		//----------------------------------------------------------------------------------------
		
//		Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. 
//		Si introducimos otro n�mero nos da un error.
//  
//		Scanner scanner = new Scanner(System.in);
//	    int semana;
//	    System.out.print("Introduce el numero de la semana: ");
//	    semana = scanner.nextInt();
// 
//	    switch (semana) {
//	    case 1:
//	      System.out.println("Lunes");
//	      break;
//	    case 2:
//	      System.out.println("Martes");
//	      break;
//	    case 3:
//	      System.out.println("Miercoles");
//	      break;
//	    case 4:
//	      System.out.println("Juevez");
//	      break;
//	    case 5:
//	      System.out.println("Viernes");
//	      break;
//	    case 6:
//	      System.out.println("Sabado");
//	      break;
//	    case 7:
//		  System.out.println("Domingo");
//		  break;
//	    default:
//	      System.out.println("ERROR: n�mero incorrecto.");
//	    }
//	  }
//	}

//---------------------------------------------------------------------------------------------------
//		//ealiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que 
//		//tiene el mes correspondiente.
//
//
//		Scanner scanner = new Scanner(System.in);
//	    int mes;
//	// Solicitud de datos al usuario
//	   
//	    System.out.println(" 1.- Enero.");
//	    System.out.println(" 2.- Febreo.");
//	    System.out.println(" 3.- Marzo.");
//	    System.out.println(" 4.- Abril.");
//	    System.out.println(" 5.- Mayo.");
//	    System.out.println(" 6.- Junio.");
//	    System.out.println(" 7.- Julio.");
//	    System.out.println(" 8.- Agosto.");
//	    System.out.println(" 9.- Septiembre.");
//	    System.out.println("10.- Octubre.");
//	    System.out.println("11.- Noviembre.");
//	    System.out.println("12.- Diciembre.");
//	    mes = scanner.nextInt();
//	// Realizamos comparaciones y mostramos el resultado
//	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
//	      System.out.println("El mes seleccionado tiene 31 d�as");
//	    } else if (mes ==2){
//	      System.out.println("Febrero tiene 28 d�as");
//	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
//	      System.out.println("El mes seleccionado tiene 30 d�as");
//	    } else {
//	      System.out.println("Error, el mes debe estar entre 1-12.");
//	    } 
//	  }                
//	}
//	
		//------------------------------------------------------------------------------------------------
		
//		Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica Central, 
//		Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la 
//		que va dirigida. Lo anterior se muestra en la siguiente tabla:
//		
//		 Scanner scanner = new Scanner(System.in);
//		    int peso;
//		    int zona;
//		// Solicitud de datos al usuario
//		    
//		    System.out.println("Zonas de env�o:");
//		    System.out.println("1.- Am�rica del Norte");
//		    System.out.println("2.- Am�rica Central");
//		    System.out.println("3.- Am�rica del Sur");
//		    System.out.println("4.- Europa");
//		    System.out.println("5.- Asia");
//		    zona = scanner.nextInt();
//		    System.out.println("Introduce el peso del paquete en gramos: ");
//		    peso = scanner.nextInt();
//		// Realizamos comparaciones y mostramos el resultado
//		    if (peso > 5){
//		      System.out.println("El paquete no puede ser admitido por motivos de seguridad.");
//		    } else if (peso < 1) {
//		      System.out.println("El peso del paquete debe ser un entero positivo.");
//		    } else {
//		      switch (zona) {
//		      case 1:
//		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica del Norte sale por " +(peso*24) + " euros.");
//		        break;
//		      case 2:
//		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica Central sale por " +(peso*20) + " euros.");
//		        break;
//		      case 3:
//		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica del Sur sale por " +(peso*21) + " euros.");
//		        break;
//		      case 4:
//		        System.out.println("El paquete de " + peso + " kilogramos enviado a Europa sale por " +(peso*10) + " euros.");
//		        break;
//		      case 5:
//		        System.out.println("El paquete de " + peso + " kilogramos enviado a Asia sale por " +(peso*18) + " euros.");
//		        break;
//		      default:
//		        System.out.println("ERROR: zona elegida incorrecta.");
//		        break;
//		      }
//		    }
//		  }
//		}

//----------------------------------------------------------------------------------------------------
		
		//Construir un programa que calcule el �ndice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) 
		//e indique el estado en el que se encuentra esa persona en funci�n del valor de IMC:
		
		
		Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduce el peso (en kg): ");
		 double peso = entrada.nextDouble();
		 System.out.print("Introduce la altura (en centimetros): ");
		 double altura = entrada.nextDouble()/100;
		 double imc = peso/(altura*altura);
		 System.out.println("Para un peso de "+ peso +" kilogramos y");
		 System.out.println("una altura de "+ altura + " metros");
		 System.out.println("el indice de masa corporal es de "+ (int)imc);
		 if (imc<16) { System.out.println("Necesita ingresar en un hospital");
		 } else if (imc<17) { System.out.println("Usted tiene infrapeso");
		 } else if (imc<18) { System.out.println("Usted tiene bajo peso");
		 } else if (imc<26) { System.out.println("Usted tiene un peso saludable");
		 } else if (imc<30) { System.out.println("Tiene sobrepeso de grado I");
		 } else if (imc<35) { System.out.println("Tiene obesidad de grado II");
		 } else if (imc<40) { System.out.println("Tiene obesidad premorbida (III)");
		 } else { System.out.println("Usted tiene obesidad morbida o de grado IV");
		 }
		 }
		}

