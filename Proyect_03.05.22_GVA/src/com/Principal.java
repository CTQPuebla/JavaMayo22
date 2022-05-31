package com;

public class Principal {

	public static void main(String[] args) {
			
		String x = "j"; //Valor inicial
		String xx = "ABCD";
		int y=16;
		int z=3;
		//Proceso
		//15 < 10 - true 
//		if(x.length()<10) {
//			//Si
//			System.out.println("Si lo cumple"); 
//		}else {
//			//No
//			System.out.println("No lo cumple");
//		}
//		
//		//Evaluar 2 condiciones juntas (condicion compuesta)
//		
//		if(x.length()<10 || y>0) {
//			System.out.println("OR: true");
//		}else {
//			System.out.println("OR: false");
//		}
//		
//		//AND
//		if(x.length()<10 && y>0){
//			System.out.println("AND: true");
//		}else {
//			System.out.println("AND: false");
//		}
//		
//		//NOT
//		if(!(x.length()<10 || y>0)) {
//			System.out.println("NOT: true");
//		}else {
//			System.out.println("NOT: false");			
//		}
//		
//		//DIFERENTE DE 
//		if(y !=z) {
//			System.out.println("Si es diferente de");
//		}else {
//			System.out.println("No es diferente de");
//
//		if(y==z) {
//			System.out.println("A huevo que si");
//		}else {
//			System.out.println("nel perro");
//		}
//		if(x.equals(xx)) {
//			System.out.println("Si son Iguales");
//		}else {
//			System.out.println("No es lo mismo Homs");
//			
		//Evaluar condiciones concatenadas
//		if(y<5) {  //false
//			System.out.println("Primero");
//			
//		}else if(y<10){
//			System.out.println("Segundo");
//			
//		}else if(y<15){
//			System.out.println("Tercero");
//		}else {
//			System.out.println("4");
//		}
		//------------------------------------------------------------------
		//Switch
		//z=1
		
		switch(x) {
		
		case "a": 
			System.out.println("Uno");
			System.out.println("Uno");
			System.out.println("Uno");
			System.out.println("Uno");
			break; 
		case "b":
			System.out.println("Dos");
			break;
		case "c": 
			System.out.println("Tres");
			break; 			
		case "d": 
			System.out.println("Cuatro");
			break; 			
		
			default:
				System.out.println("Valor desconocido");		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
