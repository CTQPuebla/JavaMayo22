package com;

import java.io.IOException;
import java.util.Scanner;

public class ejercicios2_ciclos {
	public static void main(String[] args) {
		//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
	
//for (int i = 0; i < 11 ; i++) {
//			
//			System.out.println("12 X" +i + "="  +i* 12);
//}
//}
//}
		
		//------------------------------------------------------------------------------------------
		
//		Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
//		hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//		23 x 95 = ???;
//
//		
//		int t=0;
//		int n=0;
//		Scanner sc = new Scanner(System.in);
//		Scanner ts=new Scanner(System.in);
//
//		System.out.println("introduce un numero entero" );
//		n=sc.nextInt();
//		System.out.println("introduce otro numero");
//		t=ts.nextInt();
//
//		for(int i=1;i<=t; i++){
//
//		int s=n*i;
//		System.out.println(n+"*"+i+"="+s);
//
//		}
//	}
//}

		//----------------------------------------------------------------------------------------------------
		
//		3. Realiza un programa para determinar si un String es pal�ndromo.
//		
//		String cadena = null;
//		
//		String n = cadena;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa la cadena de caracteres" );
//		n=sc.next();
//        
//        System.out.println();
//		String[] cadenas = { n };
//		for (String cadena1 : cadenas) {
//			System.out.println("�'" + cadena1 + "' es pal�ndromo? " + esPalindromo(cadena1));
//		}
//	}
//
//	/**
//		Comprobar si es pal�ndromo en Java
//		@author parzibyte
//	*/
//	public static boolean esPalindromo(String cadena) {
//		// Convertir a min�scula y quitar espacios " ", puntos "." y comas ","
//		// Tambi�n remplazar palabras con acento p.ej. � => i
//
//		cadena = cadena.toLowerCase().replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o")
//				.replace("�", "u").replace(" ", "").replace(".", "").replace(",", "");
//		// Invertir la cadena, y si es igual que la original entonces
//		// son pal�ndromos
//		String invertida = new StringBuilder(cadena).reverse().toString();
//		// Para invertir recomiendo ver
//		// https://parzibyte.me/blog/2019/02/20/invertir-cadena-string-java/
//		return invertida.equals(cadena);
//	}
//}
		
		//------------------------------------------------------------------------------------------------------------
		
//	Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un d�a desde las 00:00:00 
//	horas hasta las 23:59:59 horas
//	
//	public static void main(String[] args) throws InterruptedException {
//
//		        //Variables
//		        int horas = 0, minutos = 0, segundos = 0;
//
//		        while (true) {
//
//		            //Mostrar
//		            //Si es menor que 10, escribimos un cero delante
//		            if (horas < 10) {
//		                System.out.print("0");
//		            }
//
//		            System.out.print(horas + ":");
//
//		            if (minutos < 10) {
//		                System.out.print("0");
//		            }
//
//		            System.out.print(minutos + ":");
//
//		            if (segundos < 10) {
//		                System.out.print("0");
//		            }
//
//		            //salto de linea
//		            System.out.println(segundos);
//
//		            //Aumentar el tiempo
//		            segundos++;
//
//		            //Comprobar el tiempo
//		            if (segundos == 60) {
//		                //reinicio los segundos
//		                segundos = 0;
//		                //aumento los minutos
//		                minutos++;
//		                if (minutos == 60) {
//		                    //Reinicio los minutos
//		                    minutos = 0;
//		                    //Aumento las horas
//		                    horas++;
//		                    if (horas == 24) {
//		                        //Reinicio las horas
//		                        horas = 0;
//		                    }
//		                }
//		            }
//
//		            Thread.sleep(1000);
//
//		        }
//
//		    }
//
//		}
	
     //--------------------------------------------------------------------------------------------
	
//		Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
//		Cual ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?.
//	
//		double dinero = 1000;
//	int mes = 1;
//
//	while (mes<=12) {
//	dinero = dinero * 1.02;
//	mes++;
//	}
//	System.out.println(dinero);
//	}
//	}
		
		
		
		
	//--------------------------------------------------------------------------------------------------
		
    //Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
	//En cuantos meses tendr� mas de $1500, si reinvierte cada mes todo su dinero?.
//				
//				
//				double dinero = 700;
//		int mes = 1;
//		for (;;) {
//		dinero = dinero * 1.02;
//		if (dinero >= 1500) break;
//		mes++;
//		}	
//		
//		System.out.println(mes);
//		System.out.println(dinero);
//		}
//		
//	}

		//---------------------------------------------------------------------------------------
		
//		//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el mayor
//		 Scanner sc = new Scanner(System.in);
//	        int numero1, numero2, menor, mayor;
//	       
//	        //Lectura de dos n�meros enteros distintos
//	        do {
//	            System.out.print("Introduce un n�mero entero: ");
//	            numero1 = sc.nextInt();
//	            System.out.print("Introduce otro n�mero entero distinto del anterior: ");                   
//	            numero2 = sc.nextInt();
//	            if(numero1 == numero2){
//	                System.out.println("Debes introducir dos n�meros distintos");
//	            }
//	        } while (numero1 == numero2);
//	       
//	        //Calcular cu�l de los n�meros es el mayor y cu�l el menor
//	        if (numero1 > numero2) {
//	            mayor = numero1;
//	            menor = numero2;
//	        } else {
//	            mayor = numero2;
//	            menor = numero1;
//	        }
//	       
//	        //Mostrar por pantalla los n�meros desde el menor hasta el mayor.
//	        System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");
//	        for (int i = menor; i <= mayor; i++) {
//	            System.out.println(i);
//	        }
//	    }
//	}	
				
	//---------------------------------------------------------------------------------------------
		
	//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
//		  Scanner sc = new Scanner(System.in);
//	        int A, B;
//
//	        //Lectura de dos n�meros enteros A Y B
//	        //A debe ser menor que B
//	        do {
//	            System.out.print("Introduce un n�mero entero: ");
//	            A = sc.nextInt();
//	            System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
//	            B = sc.nextInt();
//	            if (A >= B) {
//	                System.out.println("El segundo n�mero debe ser mayor que el primero");                  
//	            }
//	        } while (A >= B);
//
//
//	        //Mostrar los n�meros pares entre A y B.
//	        System.out.println("\nN�meros pares desde " + A + " hasta " + B + " : ");
//	        for (int i = A; i <= B; i++) {
//	            if (i % 2 == 0) {
//	                System.out.println(i);
//	            }
//	        }
//	    }
//	}		
				
	//-------------------------------------------------------------------------------------------
		
		
//		 Scanner sc = new Scanner(System.in);
//	        int numero;
//	        char respuesta = 0;
//           int B;
//	        do {
//
//	            System.out.print("Introduce un n�mero: ");
//	            numero = sc.nextInt();
//	            System.out.print("Introduce otro n�mero: ");
//	            B = sc.nextInt();
//
//	            if (numero != 0) {
//	                if (numero > 0) {
//	                    System.out.print(" Positivo ");
//	                } else {
//	                    System.out.print(" Negativo ");
//	                }
//	                if (numero % 2 == 0) {
//	                    System.out.println(" Par");
//	                } else {
//	                    System.out.println(" Impar");
//	                }
//	                
//	                if (B != 0) {
//		                if (B > 0) {
//		                    System.out.print(" Positivo ");
//		                } else {
//		                    System.out.print(" Negativo ");
//		                    
//		                }
//	                if (B % 2 == 0) {
//	                    System.out.println(" Par ");
//                } else {
//	                    System.out.println(" Impar ");
//	                }
//	            
//	                }
//	            }
//	            
//	        
//	        } if 
//	        
//	        
//	        	        //Mostrar los n�meros pares entre A y B.
//	        	        System.out.println("\nN�meros pares desde " + numero + " hasta " + B + " : ");
//	        	        for (int i = numero; i <= B; i++) {
//	        	            if (i % 2 == 0) {
//	        	                System.out.println(i);
//	        	            }
//	        	        }
//	        
//	
//				Scanner sc = new Scanner(System.in);
//				int cont = 0;
//				int sumImpar = 0;
//				int sumPositivos = 0;
//				
//				while(cont<10) {
//					System.out.println("Ingresa un numero");
//					int num = sc.nextInt();
//					
//					if(num>0) {
//						System.out.println("Es positivo");
//						sumPositivos = sumPositivos + num;
//					}else {
//						System.out.println("Negativo");
//						
//					}
//					if(num%2==0) {
//						System.out.println("Es impar");
//						
//					}
//					cont++;//cambio de valor
//					}
//				System.out.println("Sumatoria de positivos:" +sumPositivos);
//				System.out.println("Sumatoria de impares:" +sumImpar);
//				}
//}
	Scanner sc = new Scanner(System.in);	
	boolean flag = true; //bandera
	String caracter="";
	int sum=0;
	int cont = 0;
	float promedio;
	String aux="";
	int mayores=0;		
	while(flag) {
		//indexOf
		System.out.println("Ingresa un numero");			
		caracter = sc.nextLine();			
		if("0123456789".indexOf(caracter)>=0) {
			//7,4,5,9,1,4,0,8,3
			aux = aux + caracter + ",";
			//convertir el string a int
			//     x  +  7                  "7"
			sum = sum + Integer.parseInt(caracter);
			System.out.println(sum);
			cont++;							
		}else {
			System.out.println("No es un numero");
			flag = false;
		}		
	}			
	promedio = sum/cont;
	System.out.println("Promedio: "+String.format("%.2f", promedio));		
	//7,4,5,9,1,4,0,8,3
	String[] array = aux.split(","); //cortando y separando valores		
	for (int i = 0; i < array.length; i++) {			
		if(Integer.parseInt(array[i])>promedio) {
			mayores++;
		}								
	}
	System.out.println("Mayores que la media: "+mayores);
	
}
}