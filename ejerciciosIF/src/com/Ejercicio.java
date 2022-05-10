package com;
import java.util.Scanner;

public class Ejercicio {
	
	int n1;
	int n2;
	double r;
	char c;
	String cadena;
	Scanner scan = new Scanner(System.in);
	
	public void mayor() {
		System.out.println("ingresa el primer numero: ");
		n1=scan.nextInt();
		System.out.print("ingresa el segundo numero: ");
		n2=scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("el numero mayor es: " + n1);
		}else if(n1 < n2) {
			System.out.println("el numero mayor es: " + n2);
		}else {
		System.out.println("los numero son iguales");
		}
		
	}
	
	public void par() {	
		System.out.println("ingresa un numero entero");
		n1=scan.nextInt();
		
		if(n1%2==0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
	}
	
	public void division() {
		System.out.println("ingresa el numerador: ");
		n1=scan.nextInt();
		System.out.print("ingresa el divisor: ");
		n2=scan.nextInt();
		
		if(n2==0) {
			System.out.println("error, no se puede dividir ningun numero entre 0");
		}else {
			r=n1/n2;
			System.out.println("el resultado de la division es: " + r);
		}
	}
	
	public void mayuscula() {
		System.out.println("ingresa una cadena de texto: ");
		c=scan.next().charAt(0);
		
		if(Character.isUpperCase(c)) {
			System.out.println("es una mayuscula");
		}else {
			System.out.println("no es mayuscula o no es una letra");
		}
	}
	
	public void solicitud() {
		int edad;
		String sexo;
		double nota;
		
		System.out.println("ingresa la edad del solicitante: ");
		edad = scan.nextInt();
		System.out.println("ingresa el sexo del solicitante: ");
		sexo = scan.next();
		System.out.println("ingresa las notas del solicitante: ");
		nota = scan.nextDouble();
		
		
		if(nota > 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("posible aceptado");
		}else if(nota > 5 && edad >= 18 && sexo.equalsIgnoreCase("F")){
			System.out.println("solicitud aceptada");
		}else {
			System.out.println("solicitud rechazada");
		}
	}
	
	public void precio() {
		String tipo;
		int tamaño;
		double precio;
		double cantidad;
		double total;
		
		
		System.out.println("ingresa el precio por kilo de uva");
		precio = scan.nextDouble();
		System.out.println("ingresa la cantidad de kilos de uva");
		cantidad = scan.nextDouble();
		System.out.println("ingresa el tipo de uva");
		tipo = scan.nextLine();
		System.out.println("ingresa el tamaño de la uva: ");
		tamaño = scan.nextInt();
		
		if(tipo.equalsIgnoreCase("A") && tamaño == 1) {
			precio=precio + 0.20;
			total= precio * cantidad;
			System.out.println("el total a recibir el productor es de: $ "
					+ total);
		}else if(tipo.equalsIgnoreCase("A") && tamaño == 2) {
			precio=precio + 0.30;
			total= precio * cantidad;
			System.out.println("el total a recibir el productor es de: $ "
					+ total);
		}else if(tipo.equalsIgnoreCase("B") && tamaño == 1) {
			precio=precio - 0.30;
			total= precio * cantidad;
			System.out.println("el total a recibir el productor es de: $ "
					+ total);
		}else if(tipo.equalsIgnoreCase("B") && tamaño == 1) {
			precio=precio - 0.50;
			total= precio * cantidad;
			System.out.println("el total a recibir el productor es de: $ "
				+ total);
		}else {
			System.out.println("datos incorrectos");
		}
	}

	public void cuota() {
		
		int alumnos;
		double costo;
		
		System.out.println("igresa el numero de alumnos que iran al viaje");
		alumnos = scan.nextInt();
		
		if(alumnos >= 100) {
			
			costo = alumnos * 65;
			System.out.println("cada alumno deben pagar 65 euros");
			System.out.println("el costo de la renta del autobus que debe"
					+ " pagar el director es de: " + costo + " euros");
		}else if(alumnos >= 50 && alumnos <= 99) {
			
			costo = alumnos * 70;
			System.out.println("cada alumno deben pagar 70 euros");
			System.out.println("el costo de la renta del autobus que debe"
					+ " pagar el director es de: " + costo + " euros");
		}else if(alumnos >= 30 && alumnos <= 49) {
			
			costo = alumnos * 95;
			System.out.println("cada alumno deben pagar 95 euros");
			System.out.println("el costo de la renta del autobus que debe"
					+ " pagar el director es de: " + costo + " euros");
		}else {
			costo = 4000;
			costo = costo/alumnos;
			System.out.println("cada alumno deben pagar " + costo +" euros");
			System.out.println("el costo de la renta del autobus que debe"
					+ " pagar el director es de: 4000 euros");
		}
		
	}
	
	public void dado() {
		System.out.println("ingresa el numero que maeco el dado:");
		n1 = scan.nextInt();
		
		switch(n1) {
		case 1:
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("CUATRO");
			break;
		case 4:
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("UNO");
			break;
			
			default: 
				System.out.println("numero incorrecto");
		}
		
	}
	
	public void dia() {
		
		System.out.println("ingresa el numero del dia de la semana"
				+ "(del 1 al 7)");
		n1 = scan.nextInt();
		
		switch(n1) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;	
		case 7:
			System.out.println("Sabado");
			break;
			
			default: 
				System.out.println("error");
		}
		
	}
	
	public void mes() {
		System.out.println("ingresa el numero del mes (del 1 al 12)");
		n1 = scan.nextInt();
		
		switch(n1) {
		case 1:
			System.out.println("Enero");
			System.out.println("tiene 31 dias");
			break;
		case 2:
			System.out.println("Febrero");
			System.out.println("tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo");
			System.out.println("tiene 31 dias");
			break;
		case 4:
			System.out.println("Abril");
			System.out.println("tiene 30 dias");
			break;
		case 5:
			System.out.println("Mayo");
			System.out.println("tiene 31 dias");
			break;
		case 6:
			System.out.println("Junio");
			System.out.println("tiene 30 dias");
			break;	
		case 7:
			System.out.println("Julio");
			System.out.println("tiene 31 dias");
			break;
		case 8:
			System.out.println("Agosto");
			System.out.println("tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre");
			System.out.println("tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre");
			System.out.println("tiene 31 dias");
			break;
		case 11:
			System.out.println("Noviembre");
			System.out.println("tiene 30 dias");
			break;
		case 12:
			System.out.println("Diciembre");
			System.out.println("tiene 31 dias");
			break;
			
			default: 
				System.out.println("error");
		}
	}

	public void transporte() {
		
		System.out.println("ingresa la cantidad de kilos del paquete:");
		r=scan.nextDouble();
		
		System.out.println("ingresa el numero de la region"
				+ " en la que se entregara el paquete:");
		System.out.println("1.- America del Norte\n2.-America Central\n"
				+ "3.-America del Sur\4.-Europa\n5.-Asia");
		n2 = scan.nextInt();
		
		if(r > 0 && r <= 5) {
			switch(n2) {
			case 1:
				r = r * 24;
				System.out.println("el costo del transporte del paquete "
						+ "es de" + r +"euros");
				break;
			case 2:
				r = r * 20;
				System.out.println("el costo del transporte del paquete "
						+ "es de" + r +"euros");
				break;
			case 3:
				r = r * 21;
				System.out.println("el costo del transporte del paquete "
						+ "es de" + r +"euros");
				break;
			case 4:
				r = r * 10;
				System.out.println("el costo del transporte del paquete "
						+ "es de" + r +"euros");
				break;
			case 5:
				r = r * 18;
				System.out.println("el costo del transporte del paquete "
						+ "es de" + r +"euros");
				break;
				
				default:
					System.out.println("region no valida");
			}
		}else {
			System.out.println("entrega del paquete rechazada, "
					+ "no cumple con las politicas del peso maximo por paquete");
		}
	}
	
	public void IMC() {
		
		double peso;
		double altura;
		double imc;
		
		
		System.out.println("ingresa el peso de la persona en kilogramos");
		peso = scan.nextDouble();
		System.out.println("ingresa la altura de la persona en metros");
		altura = scan.nextDouble();
		
		imc=peso/(altura*altura);
		
		if(imc < 16) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("Criterio de ingreso en hospital");
		}else if(imc >= 16 && imc <= 17) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece infrapeso");
		}else if(imc > 17 && imc <= 18) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece bajo peso");
		}else if(imc > 18 && imc <= 25) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona es saludable (peso normal)");
		}else if(imc > 25 && imc <= 30) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece sobre peso (obesidad grado I)");
		}else if(imc > 30 && imc <= 35) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece sobre peso crónico (obesidad grado II)");
		}else if(imc > 35 && imc <= 40) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece obesidad premorbida(obesidad grado III)");
		}else if( imc < 40) {
			System.out.println("el indice de masa "
					+ "corporal de la persona es de: "
					+ imc);
			System.out.println("la persona padece obesidad morbida (obesidad grado IV)");
		}
	}

	public void donacion() {
		double donacion;
		double montoC;
		double montoN;
		double montoB;
		
		System.out.println("ingresa la cantidad de dinero recibida en la donacion");
		donacion=scan.nextDouble();
		
		if(donacion >= 10000) {
			montoC = donacion * 0.3;
			montoN = donacion * 0.5;
			montoB = donacion * 0.2;
			System.out.println("se destinaran $" + montoC + " al Centro de Salud" +
					"\nSe destinaran $" + montoN + " al Comedor de niños" + "\nSe destinaran $"
					+ montoB + " en la Bolsa de Valores");
		}else if(donacion > 0 && donacion < 10000 ){
			montoC = donacion * 0.25;
			montoN = donacion * 0.60;
			montoB = donacion * 0.15;
			System.out.println("se destinaran $" + montoC + " al Centro de Salud" +
					"\nSe destinaran $" + montoN + " al Comedor de niños" + "\nSe destinaran $"
					+ montoB + " en la Bolsa de Valores");
		}
	}

	public void salario() {
		
		double salario;
		System.out.println("ingresa la cantidad de horas trabajadas en al semana:");
		n1 = scan.nextInt();
		
		if(n1 > 40) {
			n2 = n1 - 40;
			salario = 40 * 16;
			salario = salario + (n2 * 20);
			System.out.println("el salario de esta semana por " + n1 +
					" horas de trabajo, es de: $" + salario );
		}else {
			salario = n1 * 16;
			System.out.println("el salario de esta semana por " + n1 +
					" horas de trabajo, es de: $" + salario );
		}
	}

	
}
