package com;

public class Principal {
 public static void main(String[] args) {
 
	
	 /*
	  * if(condicio){
	  codigo a ejecutarse cuando
	  condicion = true
	  } elese{
	  
	  codigo a ejecutarse cuando condicion = false
	  }
	  */
	
	String x = "abcd";
	String xx = "ABCD";
	int y =0;
	int z=0;
	
//proceso
	
	//15 < 10 - true
	if(x.length()>10) {
		//si
		System.out.println(x.length());
	}else {
		//No
		System.out.println("No lo cumple");
	}


//Evaluar 2 condiciones juntas (condicion compuesta)

if(x.length()<10 ||y>0) {
	System.out.println("OR:true");
}else{
	System.out.println("OR: false");
}

//AND

if(x.length()<10 &&y>0) {
	System.out.println("AND: true");
}else{
	System.out.println("AND: false");
}

//NOT
if(x.length()<10 ||y>0) {
	System.out.println("NOT:true");
}else{
	System.out.println("NOT: false");
}

//DIFERENTE DE

if(y != z) {
	System.out.println("Si es diferente");
}else{
	System.out.println("No es diferente");
}

if(y==z) {
	System.out.println("si son iguales");
}else{
	System.out.println("nop");
}
if(x.equals(xx)) {
	System.out.println("objetos iguales");
}else{
	System.out.println("obj diferentes");
}	

//Evaluar condicion concatenada
if(y<5) {
	System.out.println("Primero");
}else if(y<10){
	System.out.println("Segundo");
}else if(y<15){
	System.out.println("Tercero");
}else{
	System.out.println("4");
}
//--------------------------------------------------
//Switch
//z=1
switch(z) {

case 1:
	System.out.println("Uno");
	System.out.println("Uno");
	System.out.println("Uno");
	System.out.println("Uno");
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
		System.out.println("Valor desconocido");
}
 }
}
	




 
 
