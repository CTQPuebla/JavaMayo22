package com;

public class Principal {
	
	public static void main(String[] args) {
		
		/*
		
		 * if (condition){
		
		 codigo a ejecutarse cuando 
		 condicion= true
		 }else{
		 
		 codigo a ejecutarse cuando condition = false
		 }
		 
		 */
		
		String x = "12345$bkwa67890"; 
		String xx="ABCD";
		//valor inicial
		int y=0;
		int z=1;
		
	    if(x.length()>10) {
	    	//si
	    	System.out.println(x.length());//salidas
	    	
	    }else {
	    	//no
	    	System.out.println("No lo cumple");
	    }
	
	    
	    // evaluar 2 condiciones juntas (condicion compuesta)
	//OR
	    if ((x.length()<10 || y>0)) {
		System.out.println("OR: true");
	}else {
		System.out.println("OR: false");
	}
	    //AND
	    if(x.length()>10 && y>0){
	    	System.out.println("AND: true");
	  
	    }else {
	    	System.out.println("AND: false");
	    }
	   //NOT
	    if(!(x.length()>10 && y>0)){
	    	System.out.println("AND: true");
	  
	    }else {
	    	System.out.println("AND: false");
	    }
	    //diferente de
	    if(y != z) {
	    	System.out.println("si es diferente");
	  
	    }else {
	    	System.out.println("no es diferente");
	    }
	   //
	    if (y==z) {
	    	System.out.println("si son iguales");
	  	  
	    }else {
	    	System.out.println("nop");
	    }
	    if(x.equals(xx)) {
	    	System.out.println("objetos son iguales");
		  	  
	    }else {
	    	System.out.println("obj diferentes");
	    }
	
	//evaluar condiciones concatenadas
	    if(y<5) {
	    	System.out.println("Primero");
	    }else if(y<10){
	    	System.out.println("Segundo");
	    }else if(y<15){
	    	System.out.println("Tercero");
	    }else{
	    	System.out.println("4");
	    }
		
	
	
// switch
	switch(z) {
	case 1:
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
		System.out.println("valor desconocido");
	}
	
}
}