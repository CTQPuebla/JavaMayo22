package com;

import java.util.Scanner;

public class OperacionesCiclos {
	
	Scanner sc = new Scanner(System.in);
	//ejercicio uno
	public void multiplicar12() {
		int resultado = 0;
		
		for(int i = 0; i <= 10; i++) {
			resultado = 12 * i;
			System.out.println("Resultado de multiplicar 12 entre " + i + ": " + resultado);
		}
	}
	
	//ejercicio 2
	public void tablasMultiplicar() {
		int limite = 0;
		int multiplicador = 0;
		int resultado = 0;
		System.out.println("Ingresa el limite al que deseas multiplicar");
		limite = sc.nextInt();
		System.out.println("Ingresa el numero que deseas multiplicar");
		multiplicador = sc.nextInt();
		
		for(int i = 0; i <= limite; i++) {
			resultado = multiplicador * i;
			System.out.println(i + " Iteracion: El resultado de multiplicar: " + multiplicador + " es: " + resultado);
		}
	}
	
	//ejercicio 3
	public void palindromo() {
		String cadena = "";
		String cadenaInversa = "";
		System.out.println("Ingresa una palabra:");
		cadena = sc.nextLine();
		
		
		for(int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInversa += cadena.charAt(i);
		}
		if(cadena.contentEquals(cadenaInversa)) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
	}
	
	//ejercicio 4
	public void numeroRepeticiones() {
		String cadena = "";
		char letraIngresada = 'a';
		char letraIterada = 'a';
		int apariciones = 0;
		
		
		System.out.println("Ingresa una palabra");
		cadena = sc.nextLine();
		System.out.println("Ingresa el caracter que deceas contar");
		letraIngresada = sc.next().charAt(0);
		
		for(int i = 0; i < cadena.length(); i++) {
			letraIterada = cadena.charAt(i);
			if (letraIngresada == letraIterada) {
				apariciones++;
			}
			
		}
		
		System.out.println("La letra: " + letraIngresada + " " + apariciones);
	}
	//ejercicio 5
	public void reloj() {
		
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		int miliSegundo = 0;
		
		while(hora < 24) {
			if(hora < 24) {
				miliSegundo++;
			}
			
			if(miliSegundo == 60) {
				segundo++;
				miliSegundo = 0;
			}
			
			if(segundo == 60) {
				minuto++;
				segundo = 0;
			}
			
			if(minuto == 60) {
				hora++;
				minuto = 0;
			}
			
			if(hora == 24) {
				hora = 0;
			}
			
			System.out.println(hora + ":" + minuto + ":" + segundo + ":" + miliSegundo);
			
		}
		
	}
	//ejercicio 6
	public void inversion() {
		
		double cantidad = 0;
		
		System.out.println("Ingresa la cantidad invertida:");
		cantidad = sc.nextDouble();
		
		for(int i = 0; i <= 12; i++) {
			cantidad += cantidad * .02;
			System.out.println(cantidad);
		}
		
		System.out.println(cantidad);
	}
	//ejercicio 7
	public void inversion2() {
		
		double cantidad = 0;
		int meses = 0;
		
		System.out.println("Ingresa la cantidad invertida:");
		cantidad = sc.nextDouble();
		
		while(cantidad <= 1500) {
			
			for(int i = 0; i <= 12; i++) {
				meses++;
				cantidad += cantidad * .02;
			}
		}
		System.out.println("En " + meses + " meses Su cuota sera cumplida");
		
	}
	//ejercicio 8
	public void listadoNumeros() {
		int numero1 = 0;
		int numero2 = 0;
		int inicio = 0;
		int fin = 0;
		System.out.println("Ingresa el primer numero:");
		numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero:");
		numero2 = sc.nextInt();
		
		if(numero1 < numero2) {
			inicio = numero1;
			fin = numero2;
		}else if(numero1 > numero2) {
			inicio = numero2;
			fin = numero1;
		}
		
		for(int i = inicio; i<= fin;i++) {
			System.out.println("numero:" + i);
		}
	}
	//ejercicio 9
	public void numerosPares() {
		int numero1 = 0;
		int numero2 = 0;
		int inicio = 0;
		int fin = 0;
		
		System.out.println("Ingresa el primer numero:");
		numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero:");
		numero2 = sc.nextInt();
		
		if(numero1 < numero2) {
			inicio = numero1;
			fin = numero2;
		}else if(numero1 > numero2) {
			inicio = numero2;
			fin = numero1;
		}
		
		for(int i = inicio; i<= fin;i++) {
			
			if(i % 2 == 0) {
				System.out.println("numero:" + i);
			}
			 
		}
	}
	//ejercicio 10
	public void sumaImpares() {
		int numero;
		int x[];
		
		System.out.println("Introduce un numero, (para terminar ingresa 0)");
		numero = sc.nextInt();
		
		x = new int[numero];
		int sumaPositivos = 0;
		int sumaImpares = 0;
		
		while(numero != 0) {
			
			for(int i = 0; i < x.length; i++) {
				System.out.println("Ingresa un numero:");
				x[i] = sc.nextInt();
			}
			
			for(int i = 0; i < x.length; i++) {
				
				if(x[i] > 0) {
					System.out.println("El numero " + i + " positivo");
					sumaPositivos += x[i];
				}else {
					System.out.println("El numero " + i + " negativo");
				}
				
				if(x[i] % 2 == 0) {
					System.out.println("El numero "+ i +" par");
				}else {
					System.out.println("El numero "+ i +" impar");
					sumaImpares += x[i];
				}
				
			}
			
			System.out.println("Resultado de suma de positivos: " + sumaPositivos);
			System.out.println("Resultado de suma de impares: " + sumaImpares);
			
			System.out.println("Introduce el numero cero(0) para salir");
			numero = sc.nextInt();
		}
	}
	
	public void numerosCadena() {
		boolean flag = true;
		String caracter = "";
		double sum = 0;
		int cont = 0;
		String aux = "";
		double promedio = 0;
		int mayores = 0;
		
		while(flag) {
			System.out.println("Ingresa un numero");
			caracter = sc.nextLine();
			
			if("0123456789".indexOf(caracter)>=0) {
				aux = aux + caracter + ",";
				
				sum = sum + Double.parseDouble(caracter);
				cont++;
			}else {
				System.out.println("No es un numero");
				flag = false;
			}
			
			}
			
		promedio = sum/cont;
		System.out.println("Promedio: " + promedio);
		
		String array[] = aux.split(",");
		
		for(int i = 0; i < array.length; i++) {
			if(Double.parseDouble(array[i]) > promedio) {
				mayores++;
			}
			
		}
		
		System.out.println("hola");
	}
	
	//ejercicio 12
	public void dibujarCuadrado() {
		int ancho = 0;
		int alto = 0;
		
		System.out.println("Ingresa el ancho");
		ancho = sc.nextInt();
		
		System.out.println("Ingresa el alto");
		alto = sc.nextInt();
		
		for(int i = 0; i <= ancho; i++) {
			for(int j = 0; j <= alto; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	//ejercicio 13
	public void edades() {
		int edad = 0;
		int contador = 0;
		int promedio = 0;
		int resultado = 0;
		
		do {
			
			System.out.println("Ingresa una edad");
			edad = sc.nextInt();
			contador++;
			
			resultado +=  edad;
			
			promedio = resultado / contador;
			
		}while(promedio <= 25);
		
		
		
		System.out.println("Se llego al promedio establecido");
	}
	//tarea 1
	public void tarea1() {
		int limiteArray = 0;
		int x [];
		int resultado = 0;
		
		System.out.println("Ingresa la cantidad de numeros a ingresas");
		limiteArray = sc.nextInt();
		
		x = new int[limiteArray];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Ingrese los numeros a insertar:");
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Contenido del array " + x[i]);
			resultado += x[i];
			
		}
		
		System.out.println("total de los numeros ingresados: " + resultado);
		
	}
	
	//tarea 2
	public void tarea2() {
		int limiteArray = 0;
		int x[];
		int indiceDelMayor = 0;
		
		System.out.println("Ingrese la cantidad de numeros que desea operar");
		limiteArray = sc.nextInt();
		
		x = new int[limiteArray];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Ingresa un valor");
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			if (x[i] > indiceDelMayor) {
				indiceDelMayor = x[i];
				System.out.println(x[i]);
			}
		}
		
		System.out.println("El numero mayor es: " + indiceDelMayor);
	}
	
	
	
	
	

}
