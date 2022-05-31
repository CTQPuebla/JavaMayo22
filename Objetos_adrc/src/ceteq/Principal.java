package ceteq;

import java.util.Scanner;

public class Principal {

	private static Producto productos[];

	public static void main(String[] args) {
		
//		PrimerClase primerClase1 = new PrimerClase();
//		primerClase1.setForma("Rectangulo");
//		primerClase1.setAlto(12.2);
//		primerClase1.setAncho(10.3);
//		primerClase1.setProfundidad(20.6);
//		primerClase1.setColor("Negro");
//		primerClase1.setMaterial("Madera");
//		System.out.println(primerClase1);
//		
//		PrimerClase primerClase2 = new PrimerClase("Amarillo");
//		System.out.println(primerClase2);
//		
//		PrimerClase primerClase3 = new PrimerClase("Verde", "Acero", 1, 1, 1, "Circulo");
//		System.out.println(primerClase3);
		
//		Manzana manzana1 = new Manzana();
//		manzana1.setColor("Roja");
//		manzana1.setTamaño("Grande");
//		manzana1.setPrecio(10);
//		manzana1.setOrigen("Estados Unidos");
//		manzana1.setRecienCortada(true);
//		
//		System.out.println(manzana1);
//		
//		Manzana manzana2 = new Manzana("Verde", "Chica", 4.21);
//		System.out.println(manzana2);
//		
//		Manzana manzana3 = new Manzana("Roja", "Mediana", 7.90, false);
//		System.out.println(manzana3);
//		
//		Manzana manzana4 = new Manzana("Verde", "Grande", 8, "China");
//		System.out.println(manzana4);
//		
//		Manzana manzana5 = new Manzana("Roja", "Chica", 6.50, "Francia", true);
//		System.out.println(manzana5);
		
//		CuentaBancaria c1 = new CuentaBancaria("Pedro", "001", "Debito", 300000.00, true, 50000.00, 500000.00);
		
//		CuentaBancaria c2 = new CuentaBancaria("Lulu", "0010", "Debito", 250000.00, true, 30000.00, 600000.00);
		
		//System.out.println(c1.depositar(201000.00));
//		System.out.println(c1.transferir(c1, c2, 30000.00));
		
		//c1.saldoDisponible = 10;
		
//		c1.setSaldoDisponible(10);
//		
//		Smartphone sp = new Smartphone();
//		sp.setColor("Negro");
		Scanner sc = new Scanner(System.in);
		Maquina maquina = new Maquina();
		int numProductos;
		Producto productos[] = null;
		String nombre;
		String codigo;
		double precio;
		System.out.print("Ingresar numero de productos a la maquina: ");
		numProductos = sc.nextInt();
		productos = new Producto[numProductos];
		for (int i = 0; i < numProductos; i++) {
			sc = new Scanner(System.in);
			System.out.print("Ingresa el nombre del producto: ");
			nombre = sc.nextLine();
			System.out.print("Ingresa el codigo: ");
			codigo = sc.nextLine();
			System.out.print("Ingresa el precio: ");
			sc = new Scanner(System.in);
			precio = sc.nextDouble();
			System.out.println(nombre + codigo + precio);
			productos[i] = new Producto(nombre, codigo, precio);
		}
		maquina.setDineroTotalMaquina(100.00);
		maquina.llenarMaquina(productos);
		maquina.ingresarDinero(6.00);
		maquina.ingresarDinero(10.00);
		maquina.ingresarDinero(2.00);
		maquina.escogerProducto("CCLA");

	}

}
