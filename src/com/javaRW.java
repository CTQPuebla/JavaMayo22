package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class javaRW {
public static void main(String[] args) {
	
	//JavaRW
	String line = "";
	int contador = 0;
	String[] diasletra = {"1ero", "2do", "3ro", "4to", "5to", "6to", "7mo", "8vo", "9no", "10mo", "11avo", "12avo", "13avo", "14avo", "15avo", "16avo", "17avo", "18avo", "19avo", "20avo", "21avo", "22avo", "23avo", "24avo", "25avo", "26avo", "27avo","28avo", "29avo", "30avo", "31avo"};
	String[] mesesletra = {"Enero", "Febrero","Marzo","Abirl", "Mayo","Junio","Julio", "Agosto","Septiembre", "Octubre", "Noviembre","Diciembre"};
	try {
		File archivo = new File ("C:\\Users\\WILY´Z\\Desktop\\wlio.txt");
//		FileWriter linea = new FileWriter(archivo, true);
//		
//		for (int i =0; i < 20; i++) {
//			
//			linea.write("Hola mundo" +i+ "\n");		
//		}
//		linea.close();
		
		//Lectura 
		FileReader linea2 = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(linea2);
		System.out.println("Dentro del archivo de texto");
		int dia =0;
		int mes =0;
		while ((line = buffer.readLine()) != null) {
			contador++;
			System.out.println("linea: " + line);
			dia = Integer.parseInt(line.substring(0, 2));
			mes = Integer.parseInt(line.substring(2, 4));
			System.out.println("Fecha: " + diasletra[dia-1] +
					" de " + mesesletra[mes-1]+
					" de " + line.substring(4, line.length()));
	
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

}
