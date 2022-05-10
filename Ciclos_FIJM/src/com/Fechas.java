package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fechas {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String line = "";
		String fechas[];
		int limiteFechas = 0;
		String dias[] = {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Dies",
				  "Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho",
				  "Diecinueve","Veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco",
				  "Veintiseis","Veintisiete","Veintiocho","Veintinueve","Treinta",
				  "Treinta y uno"};
		
		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
			"Octubre","Noviembre","Diciembre"};
		
		System.out.println("Ingresa la cantidad de fechas que ingresaras");
		limiteFechas = sc.nextInt();
		fechas = new String [limiteFechas];
		
		for(int i = 0; i < fechas.length; i++) {
				
				sc = new Scanner(System.in);
				System.out.print("Ingresa los datos de la fecha ejemplo (01021996)");
				fechas[i] = sc.nextLine();
		}
		
		try {
		File archivo = new File("c:\\Users\\manue\\onedrive\\Escritorio\\Prueba_CETEC.txt");
			FileWriter linea = new FileWriter(archivo,true);
			for(int i = 0; i < fechas.length; i++) {
					linea.write(fechas[i] + "\n");
			}
			linea.close();
			
			
			FileReader linea2 = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea2);//espacio temporal
			
			while((line = buffer.readLine()) != null) {
				int dia = Integer.parseInt(line.substring(0,2));
				int mes = Integer.parseInt(line.substring(2,4));
				int año = Integer.parseInt(line.substring(4,8));
				
				
				
				System.out.println(dias[dia - 1] + " de " + meses[mes - 1] + " de " + año);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
