package com;

import java.util.Scanner;

public class Operaciones {
	
	Scanner sc = new Scanner(System.in);
	
	//primer ejercicio
	public void mayorIgual() {
		
		int var1 = 0;
		int var2 = 0;
		
		System.out.println("Ingrese el primer valor");
		var1 = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		var2 = sc.nextInt();
		
		if(var1 == var2) {
			System.out.println("Las variables son iguales");
		}else {
			System.out.println("No aplica");
		}
		
	}
	//segundo ejercicio
	public void parImpar() {
		
		int numero = 0;
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}
	//tercer ejercicio
	public void division() {
		
		int var1 = 0;
		int var2 = 0;
		int resultado = 0;
		var1 = sc.nextInt();
		var2 = sc.nextInt();
		
		
		if(var1 != 0 && var2 == 0) {
			System.out.println("El segundo numero es 0");
		}else if(var1 != 0 && var2 != 0){
			resultado = var1 / var2;
			System.out.println("El resultado es:" + resultado);
		}else {
			System.out.println("Numeros no validos");
		}
		
	}
	//cuarto ejercicio
	public void validaLetra() {
		char var1 = 'a';
		var1 = sc.next().charAt(0);
		
		if(Character.isUpperCase(var1)) {
			System.out.println("Es mayuscula");
		}else {
			System.out.println("Es minuscula");
		}
		
	}
	//quinto ejercicio
	public void solicitud() {
		
		int nota = 0;
		int edad = 0;
		char sexo = 'a';
		
		nota = sc.nextInt();
		edad = sc.nextInt();
		sexo = sc.next().charAt(0);
		
		if(nota == 5 && edad == 18 && sexo == 'M') {
			System.out.println("Posible");
		}else if(nota == 5 && edad == 18 && sexo == 'F') {
			System.out.println("Aceptada");
		}else {
			System.out.println("No aceptada");
		}
		
	}
	
	//sexto ejercicio
	public void vinicultores() {
		String tipo = "";
		int tamaño = 0;
		double precio = 10.00;
		double resultado = 0;
		
		tipo = sc.nextLine();
		tamaño = sc.nextInt();
		precio = sc.nextDouble();
		
		if(tipo == "A" && tamaño == 1) {
			resultado = precio + .20;
			System.out.println("El resultado es: " + resultado);
		}else if(tipo == "A" && tamaño == 2){
			resultado = precio + .30;
			System.out.println("El resultado es: " + resultado);
		}else if(tipo == "B" && tamaño == 1){
			resultado = precio - .30;
			System.out.println("El resultado es: " + resultado);
		}else if(tipo == "B" && tamaño == 2){
			resultado = precio - .50;
			System.out.println("El resultado es: " + resultado);
		}else {
			System.out.println("Datos no validos");
		}
		
	}
	
	//septimo ejercicio
	public void dado() {
		int resultado = 0;
		resultado = sc.nextInt();
		
		switch(resultado) {
		case 1:
			System.out.println("La cara opuesta es 6");
			break;
		case 2:
			System.out.println("La cara opuesta es 5");
			break;
		case 3:
			System.out.println("La cara opuesta es 4");
			break;
		case 4:
			System.out.println("La cara opuesta es 3");
			break;
		case 5:
			System.out.println("La cara opuesta es 2");
			break;
		case 6:
			System.out.println("La cara opuesta es 1");
			break;
			default:
				System.out.println("Error: numeros incorrectos");
				break;
		}
		
	}
	
	//octavo ejercicio
	public void diasSemana() {
		int dia = 0;
		dia = sc.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Error:El numero de dia no fue encontrado");
				break;
		}
	}
	
	public void diasMes() {
		
		int mes = 0;
		mes = sc.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Enero cuenta con 30 dias");
			break;
		case 2:
			System.out.println("Febrero cuenta con 28 dias");
			break;
		case 3:
			System.out.println("Marzo cuenta con 31 dias");
			break;
		case 4:
			System.out.println("Abril cuenta con 30 dias");
			break;
		case 5:
			System.out.println("Mayo cuenta con 31 dias");
			break;
		case 6:
			System.out.println("Junio cuenta con 30 dias");
			break;
		case 7:
			System.out.println("Julio cuenta con 31 dias");
			break;
		case 8:
			System.out.println("Agosto cuenta con 31 dias");
			break;
		case 9:
			System.out.println("Septiembre cuenta con 30 dias");
			break;
		case 10:
			System.out.println("Octubre cuenta con 31 dias");
			break;
		case 11:
			System.out.println("Noviembre cuenta con 30 dias");
			break;
		case 12:
			System.out.println("Diciembre cuenta con 31 dias");
			break;
			default:
				System.out.println("Error:El numero de mes no fue encontrado");
				break;
		}
		
	}
	
	public void kilogramos() {
		
		int pais = 0;
		pais = sc.nextInt();
		int pesoPaquete = 0;
		double precioKilo = 0;
		double resultado = 0;
		
		switch(pais) {
		case 1:
			pesoPaquete = sc.nextInt();
			
			if(pesoPaquete < 5) {
				precioKilo = 2400;
				resultado = precioKilo * pesoPaquete;
				System.out.println("El importe a pagar es: " + resultado);
			}else {
				System.out.println("El paquete fue rechazado");
			}
			break;
		case 2:
			pesoPaquete = sc.nextInt();
			
			if(pesoPaquete < 5) {
				precioKilo = 2000;
				resultado = precioKilo * pesoPaquete;
				System.out.println("El importe a pagar es: " + resultado);
			}else {
				System.out.println("El paquete fue rechazado");
			}
			break;
		case 3:
			pesoPaquete = sc.nextInt();
			
			if(pesoPaquete < 5) {
				precioKilo = 2100;
				resultado = precioKilo * pesoPaquete;
				System.out.println("El importe a pagar es: " + resultado);
			}else {
				System.out.println("El paquete fue rechazado");
			}
			break;
		case 4:
			pesoPaquete = sc.nextInt();
			
			if(pesoPaquete < 5) {
				precioKilo = 1000;
				resultado = precioKilo * pesoPaquete;
				System.out.println("El importe a pagar es: " + resultado);
			}else {
				System.out.println("El paquete fue rechazado");
			}
			break;
		case 5:
			pesoPaquete = sc.nextInt();
			
			if(pesoPaquete < 5) {
				precioKilo = 1800;
				resultado = precioKilo * pesoPaquete;
				System.out.println("El importe a pagar es: " + resultado);
			}else {
				System.out.println("El paquete fue rechazado");
			}
			break;
			default:
				System.out.println("Error:El numero de mes no fue encontrado");
				break;
		}
		
	}
	
	public void masaCorporal() {
		
		double imc = 0;
		double peso = 0;
		double altura = 0;
		
		peso = sc.nextDouble();
		altura = sc.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc >= 16 || imc < 17) {
			System.out.println("Infrapeso");
		}else if(imc >= 17 && imc < 18) {
			System.out.println("Bajo peso");
		}else if(imc >= 18 && imc < 25) {
			System.out.println("Peso normal(saludable)");
		}else if(imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso (obesidad de grado 1)");
		}else if(imc >= 30 && imc < 35) {
			System.out.println("Sobre peso cronico (Obesidad de grado 2)");
		}else if(imc >= 35 && imc <= 40) {
			System.out.println("Obesidad premorbida(obesidad de grado 3)");
		}else if(imc > 40) {
			System.out.println("Obesidad morbida(Obesidad de grado 4)");
		}else {
			System.out.println("Error:Datos no validos");
		}
		
	}
	
	public void beneFica() {
		double monto = 0;
		double centroSalud = 0;
		double comedorNiños = 0;
		double bolsa = 0;
		monto = sc.nextDouble();
		
		if(monto >= 10000) {
			centroSalud = monto * .30;
			comedorNiños = monto * .50;
			bolsa = monto - centroSalud - centroSalud;
			
			System.out.println("Centro de salud: " + centroSalud + "Comedor de niños: " + comedorNiños + "Bolsa: " + bolsa);
		}else if(monto < 10000) {
			centroSalud = monto * .25;
			comedorNiños = monto * .60;
			bolsa = monto - centroSalud - centroSalud;
		}else {
			
		}
	}
	
	public void sueldoHoras() {
		int numeroHoras = 0;
		double resultado = 0;
		numeroHoras = sc.nextInt();
		
		if(numeroHoras <= 40) {
			resultado = numeroHoras * 16;
			System.out.println("Su salario es el siguiente: " + resultado);
		}else {}
	}

}
