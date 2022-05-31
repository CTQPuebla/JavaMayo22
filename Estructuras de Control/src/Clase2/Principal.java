package Clase2;

public class Principal {
	public static void main(String[] args) {

		/*
		 * if(condicion) {
		 * 
		 * codigo a ejecutarse cuando condicion = true }else{
		 * 
		 * codigo a ejecutarse cuando condicion = false
		 * 
		 * }
		 * 
		 */

		String x = "12345";
		int y = 0;
		int z = 0;
		int xx = 20;
		

		// IF
		if (x.length() > 10) {
			// Si
			System.out.println("Si lo cumple");
		} else {
			// No
			System.out.println("No lo cumple");
		// AND
			if (x.length() < 10 && y < 0) {
				// Si
				System.out.println("Si lo cumple");
			} else {

	            // No
				System.out.println("No lo cumple");

			}
			// OR
			if (x.length() < 10 || y>0) {  //false
				System.out.println("OR: true");
			} else {
				System.out.println("OR: false");
			}
		
			 //AND 
			if (x.length()<10 && y>0) {
				System.out.println("AND:true");
			} else {
				System.out.println("AND: false");
			}
	//	     NOT
				if (!(x.length() < 10 || y > 0)) {
					System.out.println("NOT: true");
				} else {
					System.out.println("NOT: false");
				}
           //DIFERENTE DE 
					if (y != z) { 
						System.out.println("Si es diferente");
					}else {
					System.out.println("No es diferente");
					} 
		
				
		   if(x.equals(xx)) { 
			   System.out.println("objetos iguales");
		   }else {
			   System.out.println("objetos diferentes");
		   }
		   
		   //Evaluar Condiciones  Concatenadas 
		   
		   if(y<5) {
		   
			   System.out.println("Primero");
			   
		   }else if(y<10) {
			   System.out.println("Segundo");
			   
		   }else if(y<15) {
			   System.out.println("Tercero");
			   
		   }else {
			   System.out.println("4");
			   
		   }
			   
			   
		   
		}



		} 
	












