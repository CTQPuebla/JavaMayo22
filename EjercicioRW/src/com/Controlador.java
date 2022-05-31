package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Controlador {
	String line="";
	Scanner scan = new Scanner(System.in);
	int cont=0;
	String dia;
	String mes="";
	String año="";
	String[] dias = {"primero","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","deciocho","diecinueve","veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta","treinta y uno" };
	
	String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"} ;

	public void registroFechas() {
		String res="";
		
		//solicitando fechas
		do {
			try {
				File archivo = new File("C:\\Users\\bullc\\Desktop\\fechas.txt");
				FileWriter linea = new FileWriter(archivo, true);
				
				System.out.println("ingresa una fecha en formato DD/MM/AAAA");
				linea.write(scan.next()+"\n");
				linea.close();
				System.out.println("fecha registrada con exito\n");
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("deseas ingresar otra fecha?");
			res=scan.next();
		}while("si".equalsIgnoreCase(res));
	}
	
	
	public void lecturaFechas() {
		try {
			File archivo = new File("C:\\Users\\bullc\\Desktop\\fechas.txt");
			FileReader linea = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea);
			System.out.println("Registro de fechas:\n");
			
			while((line = buffer.readLine()) != null ) {
				cont++;
				dia = line.substring(0,2);
				mes = line.substring(3,5);
				año = line.substring(6,10);
				conversion(dia, mes, año);
			}
		}catch (Exception e) {
			System.out.println("error en la lectura del archivo");
		}
	}
	
	public void conversion(String dia, String mes, String año) {
		int temp=0;
		temp = Integer.parseInt(dia)-1;
		dia=dias[temp];
		temp = Integer.parseInt(mes)-1;
		mes = meses[temp];
		System.out.println(dia + " de " + mes +" de " + año + "\n");
	}
}
