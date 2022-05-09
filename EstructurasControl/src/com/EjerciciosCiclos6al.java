package com;

import java.util.Scanner;

public class EjerciciosCiclos6al {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
	/*	System.out.println("------ Ejercicio 6 ---------");
//		6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
		double inv, total=0;
		int cont=1;
		System.out.println("Ingresa Inverción:");
		inv=sc.nextInt();
		
		do {
			inv+= inv * .02;
			cont++;
		}while (cont<=12);
		
		System.out.println("El total del año es:"+inv);*/
		//--------------------------------------------------------------------------
		/*System.out.println("------ Ejercicio 7 ---------");
		double retorno=700;
		
		
		for (int conta=1; retorno<1500; conta++) {
			retorno+=  retorno * .02;
			
			System.out.println(conta+" "+retorno);
		}*/
		
		//--------------------------------------------------------------------------
		/*System.out.println("------ Ejercicio 8 ---------");
	int num1, num2;
	

	System.out.println("Ingresa el primer numero:");

	num1=sc.nextInt();
	
	System.out.println("Ingresa segundo numero:");
	num2=sc.nextInt();

	if (num1<num2) {
		for (int i=num1; i<=num2;i++) {
			System.out.println(i);
		}
	}else {
		for (int h=num2; h<=num1;h++) {
			System.out.println(h);
		}
		
	}*/

		//--------------------------------------------------------------------------
			/*	System.out.println("------ Ejercicio 9 ---------");
			int num1, num2;
			

			System.out.println("Ingresa el primer numero:");

			num1=sc.nextInt();
			
			System.out.println("Ingresa segundo numero:");
			num2=sc.nextInt();

			
				for (int i=num1; i<=num2;i++) {
					if ((i/2)==0) {
					System.out.println(i);
				}
			
				}*/
		//--------------------------------------------------------------------------
	/*	System.out.println("------ Ejercicio 10 ---------");
		int cont=0;
		int sumImpar=0;
		int sumPositivos=0;
		
		while(cont<10) {
			System.out.println("Ingresa un numero");
			int num = sc.nextInt();
			
			if(num>0) {
				System.out.println("Es positivo");
				sumPositivos = sumPositivos + num;
			}else {
				System.out.println("Negativo");
			}
			
			if(num%2==0) {
				System.out.println("Es par");
			}else {
				sumImpar = sumImpar + num;
				System.out.println("Es impar");
			}			
			cont++;//cambio de valor			
		}
		
		System.out.println("Sumatoria de positivos: "+sumPositivos);
		System.out.println("Sumatoria de impares: "+sumImpar);
		*/
		
		
		//-------------------------------------------------------------------------
		System.out.println("------ Ejercicio 11---------");
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
