package com;

public class Principal {
public static void main(String[] args) {
	//versión vacia de este objeto 
	//Ctrl mas espacio y que tengo para ver que puedo hacer elegir el primer constructor, el vacío 
//	PrimerClase ob1 = new PrimerClase(); 
//	
//	//ver el estado de objeto (todos tienen un valor por default) 
//	//el objeto existe pero no tiene ningun valor asignado 
//	System.out.println(ob1);
//	 //de esta forma voy llamando a cada uno de los atributos 
//	
//	
//	ob1.setForma("Rectangulo");
//    ob1.setColor("Amarillo");
//    ob1.setMaterial("Madera");
//    ob1.setAlto(1.20);
//    ob1.setAncho(1.40);
//    ob1.setProfundidad(1.00);
//    
//	System.out.println(ob1);
//	
//	 PrimerClase ob2 = new PrimerClase("Azul"); 
//	 
//	 System.out.println(ob2);
//	 
//	    ob2.setForma("Cuadrado");
//	    ob2.setMaterial("Acero");
//	    ob2.setAlto(1.40);
//	    ob2.setAncho(1.35);
//	    ob2.setProfundidad(0.80);
//	 
//	 System.out.println(ob2);
//	//Llamar al constructor de todos los parametros
//	 PrimerClase ob3 = new PrimerClase ("rojo", "plastico", 1 ,1, 1, "circulo");
//	 
//	 System.out.println(ob3); 
	//ctrl- espacio despues de Pastel y sale para rellenar lo que pide) 
//	Pastel com1 = new Pastel("Morado", "Vainilla", 15.00, 30.00, "Chocolate", "Corazón");
//	System.out.println(com1);
	
    CuentaBancaria c1= new CuentaBancaria ("Pedro", "001", "Debito", 300000.00, true, 50000.00, 500000);
    
    CuentaBancaria c2= new CuentaBancaria ("Lulu", "0010", "Debito", 250000.00, true, 30000.00, 600000);
	
//  System.out.println(c1.retirar(300000.00));
    
    //System.out.println(c1.transferir(c1, c2 ,300000));
    
    System.out.println(c1.depositar(201000.0));
}

}

