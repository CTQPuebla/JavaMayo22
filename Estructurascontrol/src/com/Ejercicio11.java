package com;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int peso;
		    int zona;
	
		    
		    System.out.println("Zonas de envío:");
		    System.out.println("1.- América del Norte");
		    System.out.println("2.- América Central");
		    System.out.println("3.- América del Sur");
		    System.out.println("4.- Europa");
		    System.out.println("5.- Asia");
		    zona = sc.nextInt();
		    System.out.println("Introduce el peso del paquete en gramos: ");
		    peso = sc.nextInt();
		    
		
		    if (peso > 5){
		      System.out.println("El paquete no puede ser admitido por motivos de seguridad.");
		    } else if (peso < 1) {
		      System.out.println("El peso del paquete debe ser un entero positivo.");
		    } else {
		      switch (zona) {
		      case 1:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América del Norte sale por " +(peso*24) + " euros.");
		        break;
		      case 2:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América Central sale por " +(peso*20) + " euros.");
		        break;
		      case 3:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América del Sur sale por " +(peso*21) + " euros.");
		        break;
		      case 4:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Europa sale por " +(peso*10) + " euros.");
		        break;
		      case 5:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Asia sale por " +(peso*18) + " euros.");
		        break;
		      default:
		        System.out.println("ERROR: zona elegida incorrecta.");
		        break;
		      }
		    }
		  
	}

}
