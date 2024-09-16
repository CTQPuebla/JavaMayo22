package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de productos: ");
		int np = sc.nextInt();
		String b;
		String c;
		String d;
		CatalogoProductos a[] = new CatalogoProductos[np];
		for (int i = 0; i < np; i++) {

			System.out.println("Ingrese el nombre del producto: ");
			b = sc.next();
			System.out.println("Ingrese el codigo del producto: ");
			c = sc.next();
			System.out.println("Ingrese el precio del producto: ");
			d = sc.next();
			a[i] = new CatalogoProductos(b, c, Double.parseDouble(d));
		}
		System.out.println(Arrays.deepToString(a));
		Maquina m1 = new Maquina();
		m1.setDineroDis(250.50);
		m1.llenarM(a);
		m1.credito(10.50);
		m1.credito(3.20);
		m1.credito(0.50);
		m1.validar("gst");
		System.out.println(m1.getDineroI());

	}
}
