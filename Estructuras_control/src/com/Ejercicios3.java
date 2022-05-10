package com;

import java.util.Scanner;

public class Ejercicios3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Uno
		int x = 12;
		int y = 1;
		for (int i=1; i<=10; i++) {
			y = x*i;
			System.out.println(y);
		} */
		
		/* Dos
		System.out.println("Ingrese un numero para obtener su tabla de multiplicacion");
		int x = sc.nextInt();
		int y = 1;
		System.out.println("cuantas veces desea multiplicar este numero?");
		int z = sc.nextInt();
		for (int i=1; i<=z; i++) {
			y = x*i;
			System.out.println(y);
		} */
		
		/* Tres
		System.out.println("Ingrese una palabra");
		String a = sc.nextLine();
		int b = a.length();
		char c;
		char d;
		for (int i=0; i<b; i++) {
			c = a.charAt(i);
			d = a.charAt(b-1);
			
			if (c != d) {
				System.out.println("No es un palindromo");
				break;
			}
			if ((i==b-1) && (c == d)) {
				System.out.println("Palindromo");
			}
			b--;
		} */
		
		/* Cuatro
		System.out.println("Ingrese una palabra");
		String a = sc.nextLine();
		System.out.println("Ingrese una letra");
		String b = sc.nextLine();
		char c = b.charAt(0);
		int d = a.length();
		char e;
		int f = 0;
		for (int i=0; i<d; i++) {
			e = a.charAt(i);
			if (c == e) {
				f++;
			}
			if ((f == 0) && (i == d-1)) {
				System.out.println("caracter no encontrado");
			}
			if ((i == d-1) && (f != 0)) {
				System.out.println("caracter encontrado " + f + " veces");
			}
		} */
		
		/* Cinco
		int h = 0;
		int m = 0;
		int s = 0;
		for (int a = 0; a<60; a++) {
			s = a;
			System.out.println(h +":" + m +":" + s);
			if (s == 59) {
				m++;
				a = 0;
				if (m == 60) {
					h++; 
					m = 0;
				}
			}
			if (h > 23) {
				break;
			}
		} */
		
		/* Seis
		double a = 1000;
		float b = .02f;
		double c;
		for (int i = 1; i < 13; i++) {
			c = a*b;
			a = a+c;
		}
		System.out.println(a); */
		
		/* Siete
		double a = 700;
		float b = .02f;
		double c;
		int d = 0;
		while (a < 1500) {
			c = a*b;
			a = a+c;
			d++;
		}
		System.out.println("en " + d + " meses"); */
		
		/* Ocho
		System.out.println("Ingrese un numero");
		int a = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		int b = sc.nextInt();
		int n1,n2,n3;
		if (a > b) {
			n1 = b;
			n2 = a;
		} else {
			n1 = a;
			n2 = b;
		}
		while ( n1 <= n2) {
			n3 = n1;
			System.out.print(n3 + ",");
			n1++;
		} */
		
		/* Nueve 
		System.out.println("Ingrese un numero");
		int a = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		int b = sc.nextInt();
		int n1,n2,n3;
		if (a > b) {
			n1 = b;
			n2 = a;
		} else {
			n1 = a;
			n2 = b;
		}
		System.out.println("Numeros pares:");
		while (n1<=n2) {
			n3 = n1;
			if ((n3%2) == 0)
			System.out.println(n3);
			n1++;
		} */
		
		/* Diez
		
		System.out.println("Cuantos numeros desea ingresar?");
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int d = 0;
		int[] numeros = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("ingrese un numero");
			b = sc.nextInt();
			numeros [i] = b;
			if (numeros [i]>0) {
				System.out.print("Numero ingresado positivo ");
				c = c + numeros [i];
			}else {
				System.out.print("Numero ingresado negativo ");	
			}
			if ((numeros [i])%2 == 0) {
				System.out.println("y par");
			}else {
				System.out.println("e impar");
				d = d + numeros [i];
			}
		}
		System.out.println("Sumatoria positivos: "+c);
		System.out.println("Sumatoria impares: "+d); */
		
		//Once
		boolean flag = true; //bandera
		String caracter="";
		float sum=0;
		float cont = 0;
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
		
		/* Doce 
		System.out.println("ingrese el tamaño del ancho");
		int a = sc.nextInt();
		System.out.println("Cuantos el tamaño de la altura?");
		int b = sc.nextInt();
		int c = 0;
		int d = 1;
		//int[][] numeros = new int[a][b];
		while (c < b) {
			
			if (d < a) {
				System.out.print("*");
				d++;
			}else {
				d = 1;
				c++;
				System.out.println("*");
			}
		} */
	}
}
