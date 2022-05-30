package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Files1 {
	public static void main(String[] args) {
String line = "";
String d = "";
String m = "";
String a = "";
int dn, mn;
int c = 0;
try {
	 File f = new File("C:\\Users\\Ricardo\\Desktop\\Prueba.txt");
	 /* FileWriter linea = new FileWriter(f,true);
	for (int i = 0; i < 20; i++) {
		linea.write("Hola mundo"+"\n");
		
	}
	linea.close(); */
	
	FileReader linea2 =  new FileReader(f);
	BufferedReader buffer = new BufferedReader(linea2);
	while ((line = buffer.readLine()) != null) {
		c++;
		d = line.substring(0, 2);
		m = line.substring(2, 4);
		a = line.substring(4, 8);
		dn = Integer.parseInt(d);
		mn = Integer.parseInt(m);
		
		
		switch (dn){
		case 1:
			d = "Primero de ";
			break;
		case 2:
			d = "Segundo de ";
			break;
		case 3:
			d = "Tercero de ";
			break;
		case 4:
			d = "Cuarto de ";
			break;
		case 5:
			d = "Quinto de ";
			break;
		case 6:
			d = "Sexto de ";
			break;
		case 7:
			d = "Séptimo de ";
			break;
		case 8:
			d = "Octavo de ";
			break;
		case 9:
			d = "Noveno de ";
			break;
		case 10:
			d = "Décimo de ";
			break;
		case 11:
			d = "Undécimo de ";
			break;
		case 12:
			d = "Duoécimo de ";
			break;
		case 13:
			d = "Décimo Tercero de ";
			break;
		case 14:
			d = "Décimo Cuarto de ";
			break;
		case 15:
			d = "Décimo Quinto de ";
			break;
		case 16:
			d = "Décimo Sexto de ";
			break;
		case 17:
			d = "Décimo Séptimo de ";
			break;
		case 18:
			d = "Décimo Octavo de ";
			break;
		case 19:
			d = "Décimo Noveno de ";
			break;
		case 20:
			d = "Vigésimo de ";
			break;
		case 21:
			d = "Vigésimo Primero de ";
			break;
		case 22:
			d = "Vigésimo Segundo de ";
			break;
		case 23:
			d = "Vigésimo Tercero de ";
			break;
		case 24:
			d = "Vigésimo Cuarto de ";
			break;
		case 25:
			d = "Vigésimo Quinto de ";
			break;
		case 26:
			d = "Vigésimo Sexto de ";
			break;
		case 27:
			d = "Vigésimo Séptimo de ";
			break;
		case 28:
			d = "Vigésimo Octavo de ";
			break;
		case 29:
			d = "Vigésimo Noveno de ";
			break;
		case 30:
			d = "Trigésimo de ";
			break;
		case 31:
			d = "Trigésimo Primero de ";
			break;
			
		}
		
		switch (mn){
		case 1:
			m = "Enero de ";
			break;
		case 2:
			m = "Febrero de ";
			break;
		case 3:
			m = "Marzo de ";
			break;
		case 4:
			m = "Abril de ";
			break;
		case 5:
			m = "Mayo de ";
			break;
		case 6:
			m = "Junio de ";
			break;
		case 7:
			m = "Julio de ";
			break;
		case 8:
			m = "Agosto de ";
			break;
		case 9:
			m = "Septiembre de ";
			break;
		case 10:
			m = "Octubre de ";
			break;
		case 11:
			m = "Noviembre de ";
			break;
		case 12:
			m = "Diciembre de ";
			break;
		}
		
		System.out.println(d + m + a);
	}
}catch (Exception e) {
	
}
	}
}
