package com;

import java.util.Scanner;

public class Ejercicios {
	Scanner scan=new Scanner(System.in);
	
	public void tabla() {
		
		int res;
		int base;
		
		System.out.println("ingresa la base de la tabla a multiplicar");
		base = scan.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			res = i * base;
			System.out.println(i+" x " + base +" :" + res);
		}
	}	
	
	public void tablaDinamica() {
		int res;
		int base;
		int tope;
		
		System.out.println("ingresa la base de la tabla a multiplicar");
		base = scan.nextInt();
		System.out.println("ingresa el numero limite al que desea visualizar la tabla de multiplicar");
		tope = scan.nextInt();
		
		for (int i = 0; i <= tope; i++) {
			res = i * base;
			System.out.println(i +" x " + base +" :" + res);
		}
	}
	
	public void palindromo() {
		String cadena;
		String cadenaInvertida="";
		
		System.out.println("ingresa la palabra que desea verificar");
		cadena = scan.nextLine();
		
		cadena=cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida+= cadena.charAt(i);
		}
		
		if(cadenaInvertida.equalsIgnoreCase(cadena)) {
			System.out.println("la plabara si es polindroma");
		}else {
			System.out.println("la palabra no es polindroma");
		}
		
	}
	
	public void contador() {
		String frase;
		char letra ;
		int  contador=0;
		char temp;
		
		System.out.println("ingresa una frase");
		frase = scan.nextLine();
		
		System.out.println("ingresa la letra que deseas contar dentro de la frase");
		letra = scan.next().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			
			temp=frase.charAt(i);
			if (letra == temp) {
				contador++;
			}
		}
		if (contador > 0) {
			System.out.println("la letra se repite " + contador + " veces");
		}else {
			System.out.println("la letra no existe en la frase");
		}
	}
	
	public void reloj() {
		
		for (int i = 0; i < 24; i++) {
			if(i < 24) {
				for(int j=0; j < 60;j++) {
					if(j < 60) {
						for (int y = 0; y < 60; y++) {
							if(i<10 || j<10 || y<10) {
								System.out.println("son las 0" + i + ":0" + j+ ":0" + y + " horas");;
							}else {
								System.out.println("son las " + i + ":" + j+ ":" + y + " horas");
							}
						}
					}
				
				}
			}
		}
	}
	
	public void inversion() {
		double dinero;
		double interes;
		double invFinal=0;
		
		
		System.out.println("ingresa la cantidad de dinero a invertir");
		dinero = scan.nextDouble();
		System.out.println("ingresa la tasa de intereses generada que ofrece el banco");
		interes = scan.nextDouble();
		
		interes=interes/100;
		for (int i = 1; i <= 12; i++) {
			dinero+= dinero * interes;
		}
		System.out.println("la inversion generada despues de 1 año es de: " + dinero);
	}
	
	public void inversion2() {
		double dinero;
		double interes;
		int cont=0;
		
		
		System.out.println("ingresa la cantidad de dinero a invertir");
		dinero = scan.nextDouble();
		System.out.println("ingresa la tasa de intereses generada que ofrece el banco");
		interes = scan.nextDouble();
		
		interes=interes/100;
		for (int i = 1; dinero <= 1500 ; i++) {
			dinero+= dinero * interes;
			cont++;
		}
		System.out.println("necesita " + cont + " meses para tener mas de 1500");
	}

	public void numeros() {
		int n1;
		int n2;
		int mayor;
		int menor;
		
		System.out.println("ingresa el primer numero");
		n1 = scan.nextInt();
		System.out.println("ingresa el segundo numero");
		n2 = scan.nextInt();
		
		if(n1 < n2) {
			mayor = n2;
			menor = n1;
		}else {
			mayor = n1;
			menor = n2;
		}
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println(menor);
			menor++;
		}
		
		
	}
	
	public void numerosPares() {
		int n1;
		int n2;
		int mayor;
		int menor;
		
		System.out.println("ingresa el primer numero");
		n1 = scan.nextInt();
		System.out.println("ingresa el segundo numero");
		n2 = scan.nextInt();
		
		if(n1 < n2) {
			mayor = n2;
			menor = n1;
		}else {
			mayor = n1;
			menor = n2;
		}
		
		for (int i = menor; i <= mayor; i++) {
			if(menor%2==0) {
				System.out.println(menor);	
			}
			menor++;
		}
	}

	public void sumaNumeros() {
		int n=0;
		int cont=1;
		int sumPos=0;
		int sumImp=0;
		String res="";
		String positivos="";
		String negativos="";
		String pares="";
		String impares="";
		
		System.out.println("ingresa 10 numeros disgtintos");
		n=scan.nextInt();
		do {
			
			if(n%2==0) {
				pares+="\n" +n;
			}else {
				impares+="\n" + n;
				sumImp+=n;
			}
			
			if(n > 0) {
				positivos+="\n" + n;
				sumPos+=n;
			}else {
				negativos+="\n" + n;
			}
			
			n=scan.nextInt();
			cont++;
		}while(cont<10);
		
		if("".equalsIgnoreCase(pares)) {
			System.out.println("no se ingresaron numeros pares");
		}else {
			System.out.println("la lista de numero pares ingresados es:" + pares + "\n" );
		}
		
		if("".equalsIgnoreCase(impares)) {
			System.out.println("no se ingresaron numeros impares");
		}else {
			System.out.println("la lista de numero impares ingresados es:" + impares + "\n");
			System.out.println("la sumatoria de los numeros impares es: " +sumImp + "\n");
		}
		
		if("".equalsIgnoreCase(positivos)) {
			System.out.println("no se ingresaron numeros positivos");
		}else {
			System.out.println("la lista de numero positivos ingresados es:" + positivos + "\n");
			System.out.println("la sumatoria de los numeros positivos es: " +sumPos + "\n" );
		}
		
		if("".equalsIgnoreCase(negativos)) {
			System.out.println("no se ingresaron numeros negativos");
		}else {
			System.out.println("la lista de numero negativos ingresados es:" + negativos + "\n" );
		}
		
	}

	public void media(){
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
			caracter = scan.nextLine();			
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
	
	public void cuadrado() {
		int altura;
		int ancho;
		
		System.out.println("ingresa la altura de la figura");
		altura = scan.nextInt();
		System.out.println("ingresa el ancho de la figura");
		ancho=scan.nextInt();
		
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < altura; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}
	}
	
	public void edades() {
		int edad;
		int n=0;
		int sum=0;
		double prom=0;
		
		do {
			n++;
			System.out.println("ingresa edad");
			edad=scan.nextInt();
			sum+=edad;
			prom=sum/n;
			System.out.println(prom);
			
		}while(prom<25);
		System.out.println(prom);
	}
	
	
}
