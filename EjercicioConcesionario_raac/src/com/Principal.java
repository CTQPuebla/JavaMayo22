package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m, a;
		double p;
		String nombre, numero, id;
		int na;
		double dineroDis;
		HashMap<String,Cliente> hash2 = new HashMap<>();
		HashMap<String,Cliente> hash1 = new HashMap<>();
		List<Auto> lista1 = new ArrayList<>();
		int sa;
		String idc;
		int w =1;
		int decidir = 0;
		Consesionario c1 = new Consesionario();
		System.out.println("bienvenido a autos Ceteq");
		// se ingresan los autos 
		for (int i = 0; i < 15; i++) {

			System.out.println("Ingrese el modelo del auto: ");
			m = sc.next();
			System.out.println("Ingrese el año: ");
			a = sc.next();
			System.out.println("Ingrese el precio del auto: ");
			p = sc.nextDouble();
			lista1.add(new Auto(m,a,p));
			
		}
		
		
		
		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese el nombre: ");
			nombre = sc.next();
			System.out.println("Ingrese el numero de telefono: ");
			numero = sc.next();
			System.out.println("Ingrese el dinero disponible: ");
			dineroDis = sc.nextDouble();
			System.out.println("Ingrese el numero de autos comprados: ");
			na = sc.nextInt();
			System.out.println("Ingrese el ID: ");
			id = sc.next();
			hash1.put(id,new Cliente(nombre,numero,dineroDis,na));
		} 
		
		
		
		System.out.println("Ingrese su ID:");
		idc = sc.next();
		
		
		c1.llenarA(lista1);
		c1.llenarC(hash1);
		c1.selectC(idc);
		try {
			System.out.println("Bienvenido "+hash1.get(idc).getNombre());
			System.out.println("Dinero disponible: "+c1.getHashC().get(idc).getDineroDis());
			System.out.println("Autos comprados: "+c1.getHashC().get(idc).getAutos());
			System.out.println("Tel: "+c1.getHashC().get(idc).getNumeroTel());
			
			
			
			while(w == 1) {
				System.out.println("Seleccione un auto para comprar:");
				for (int i= 0; i<c1.getListaA().size(); i++) {
					System.out.println((i)+" "+c1.getListaA().get(i).getModelo());
				}
				sa = sc.nextInt();
				c1.selectA(sa);
				System.out.println("Modelo: "+lista1.get(sa).getModelo()+" Año: "+lista1.get(sa).getAño()+" Precio: "+lista1.get(sa).getPrecio());
					if(c1.val(idc, sa) == true) {
						
						dineroDis = (c1.getHashC().get(idc).getDineroDis() - (c1.getListaA().get(sa).getPrecio()));
						na = (c1.getHashC().get(idc).getAutos()) + 1;
						hash2.put(idc,new Cliente(dineroDis, na));
						c1.venta(sa, idc, hash2);
					} else {
						System.out.println("No Puede comprar el carro");
						break;
					}
				
					System.out.println("Compra Exitosa");
					System.out.println("Nuevo Saldo: "+c1.getHashC().get(idc).getDineroDis());
					System.out.println("Autos comprados: "+c1.getHashC().get(idc).getAutos());
					System.out.println("Si desea comprar otro auto presione 1 de lo contrario 0");
					w = sc.nextInt();
			}
			
			
		}catch(Exception e){
			System.out.println("Cliente no registrado");
		}
			
		
			
		
		
		
		
		
		
	}

}
