package com;

import java.util.Scanner;

public class ProblemarioCiclos {

	public static void main(String[] args) {
		
//1._Programa un algoritmo que realice la tabla de multiplicar del 12
		
//		int x=0;
//		while(x <= 120) {
//			System.out.println("Tabla del doce " +x*12);
//			x++;
//		}
		
//--------------------------------------------------------------------------------------------------------------------
// 2._Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
//hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???;
		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Ingrese el primer numero que se va a multiplicar");
//		int x = sc.nextInt();
//		
//		System.out.println("Ingrese el limite");
//		int y = sc.nextInt(); 
//		 
//		for(int i=0; i<=y; i++) {
//		    System.out.println("El resultado es " +x+ " * " +i+ " := " +x*i);
//		}
		
//--------------------------------------------------------------------------------------------------------------------
//3._Realiza un programa para determinar si un String es palíndromo.

//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Ingrese una frase");
//		String frase = sc.nextLine();
//		
//		String reversa="";
//		System.out.println(frase.length()-1);
////System.out.println(frase.charAt(3));
//		
//		for(int i=frase.length()-1; i>=0; i--) {
//			System.out.println("posición "+i);
//			
////Aislar un caracter a la vez
//			
////System.out.println(frase.charAt(i));
//			reversa = reversa + frase.charAt(i) ; 
//			System.out.println("Estoy en reversa: "+reversa);
//
//		}
////System.out.println(reversa);
//		
//		if(frase.equals(reversa)) {
//			System.out.println("Si es palindromo");
//		}else {	
//			System.out.println("No es palindromo");
//			
//		}
		
//------------------------------------------------------------------------------------------------------------------
		
//4._Programa que reciba una frase y una letra por teclado. 
//Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
//Si no existe, imprimir un mensaje “Carácter no encontrado”.

//-------------------------------------------------------------------------------------------------------------------
//5._ Simular el comportamiento de un reloj digital, imprimiendo la hora, 
// minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
	
//	System.out.println("Simulación del comportamiento de un reloj");
//	
//	for (int h = 0; h <=23; h++) {
//		
//		for (int m = 0; m <=59; m++) {
//			
//			for (int s = 0; s <=59; s++) {
//	
//	System.out.println("Time: "+h+ ":" +m+ ":"+s);
//			}
//		}
//	}
		
	//Solución de Cesar
		//int segundos=0;
		//int minutos=0;
		//int horas=0;
		
//		for(int horas=0; horas<24; horas++) {
//			
//			for(int minutos=0; minutos<60; minutos++) {
//				
//				for(int segundos=0; segundos<60; segundos++) {
//			
//				System.out.println(horas+ ":" +minutos+ ":" +segundos );
//				}
//			
//			}
//		}
		
//6._ Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 		
//Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.		

//7._Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.

		
//8._Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

//9._Programa Java que lea dos números y muestre los números pares entre ellos
		
//10._ Programa que lea números e indique si son positivos o negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.
	
//		Scanner sc= new Scanner(System.in);
//		
//		int cont=0;
//		int sumImpar =0;
//		int sumPositivos=0;
//		
//		
//		while(cont<10) {
//			System.out.println("Ingresa un numero");
//			int num = sc.nextInt();
//			
//			if(num>0) {
//				System.out.println("Es positivo");
//				sumPositivos= sumPositivos + num;
//			}else {
//				System.out.println("Negativo");
//			}
//				
//				if(num%2==0) {
//					System.out.println("Es par");
//				}else {
//					sumImpar=sumImpar+num;
//					System.out.println("Es impar");
//				}
//				
//				cont++; //cambio de valor
//					
//			}
//			System.out.println("Sumatoria de positivos: " +sumPositivos);
//			System.out.println("Sumatoria de impares: " +sumImpar);
		
//11._ Leer números por teclado hasta introducir una letra.  Calcular la suma, la media y cuántos son mayores que la media.
	
		Scanner sc = new Scanner (System.in);
		
      boolean flag= true; //bandera
      String caracter= "";
      int sum=0;
      int cont =0;
      double promedio = 0.0;
      String aux="";
      int mayores=0;
      
      while (flag) {
    	  //indexOf********************************
    	  System.out.println("Ingresa un numero");
    	  caracter = sc.nextLine();
    	  
    	  if("0123456789".indexOf(caracter)>=0) {
    		  //7,4,5,9,1,0,8,3 
    		  aux = aux + caracter + ",";
    		  //convertir el string a int
    		  //     x + 7                      "7"
    		  sum = sum + Integer.parseInt(caracter);
    		 cont++; 
    	  }else {
    		  System.out.println("No es un numero");
    		  flag = false;
    	  }
    	  
      }
          promedio = sum/cont;
    	  System.out.println("Promedio:" +promedio);
    //7,4,5,9,1,0,8,3
    	  
    	  String[] array = aux.split(","); //cortando y separando valores
    	
    	  for(int i=0; i<array.length; i++) {
    		  if (Integer.parseInt(array[i]>promedio) {
    			  mayores++;
    			  
    			  }
       	  
    		  }

	  
	  
//12._ Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.

// 13._ Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las edades sea superior a 25.

		
		
		
			
		}
		
		
	}
	

