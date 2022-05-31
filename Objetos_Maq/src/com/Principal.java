package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//Instanciamos un objeto vacio
//		PrimerClase ob1 = new PrimerClase();
//		
//		System.out.println(ob1);
//		
//		ob1.setForma("Rectangulo");
//		ob1.setAlto(1.15);
//		ob1.setAncho(1.20);
//		ob1.setMaterial("vidrio");
//		ob1.setProfundidad(2.5);
//		ob1.setColor("azul");
//		
//		System.out.println(ob1);
//		
//		PrimerClase ob2 = new PrimerClase("Amarillo");
//		
//		System.out.println(ob2);
//		
//		PrimerClase ob3 = new PrimerClase("verde", "acero", 1, 1, 1, "circulo");
//		System.out.println(ob3);
		
		
//		CuentaBancaria c1 = new CuentaBancaria("Pedro", "0001", "Debito",
//				300000.00, true, 50000.00, 500000.00);
//		
//		CuentaBancaria c2 = new CuentaBancaria("Lulu", "0010", "Debito",
//				250000.00, true, 30000.00, 600000.00);
//					
//		//System.out.println(c1.depositar(201000.00));
//		System.out.println(c1.transferir(c1, c2, 30000.00));
//		
//		//Llamada directa (default o public)
//		//c1.saldoDisponible = 10;
//		
//		//Acceso a traves del metodo setter
//		c1.setSaldoDisponible(1);
		
		
		
		//Creacion de productos individualmente
		Producto p1 = new Producto("A1","Emperador", "Paquete 8 unidades", 18.0);
		Producto p2 = new Producto("A2","Cacahuates", "Bolsa 60 grs", 20.0);
		Producto p3 = new Producto("A3","Paleta", "Unidad", 10.0);
		Producto p4 = new Producto("A4","Gansito", "Paquete 70 grs", 14.0);
		Producto p5 = new Producto("A5","Chicles", "Paquete 20 unidades", 15.0);
		
		//Inicializacion del array
		Producto[] productos = new Producto[5];

		
		//Añade los productos al array
		productos[0] = p1;
		productos[1] = p2;
		productos[2] = p3;
		productos[3] = p4;
		productos[4] = p5;
		
		MaquinaExpendedora m1 = new MaquinaExpendedora("Negro", "F1", 140.0, productos, 0);
		
		
		m1.venderProducto();
		
		System.out.println(m1);
		
		
		
	}

}
