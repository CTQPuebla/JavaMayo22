package com;

public class principal {
	public static void main(String[] args) {
		String a = "123456789123456";
		int b = 10;
		int c = 15;
		// if &&
		/* if(a.length()<c && a.length()>b) {
			System.out.println("si cumple");
		} else {
			System.out.println("no cumple");
		}
		
		// if ||
		if(a.length()<b || a.length()>c) {
			System.out.println("si cumple");
		} else {
			System.out.println("no cumple");
		}
		
		// if not 
		if(!(a.length()<b)) {
			System.out.println("si cumple");
		} else {
			System.out.println("no cumple");
		}
		
		// if diferente de 
		if(a.length()!=c) {
			System.out.println("si cumple");
		} else {
			System.out.println("no cumple");
		} */
		
		// if anidado
		// switch 
		
		switch (b) {
		
		case 1: // case "a" para comparar caracteres 
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
			
		default:
			System.out.println("desconocido");
		}
	}
}
