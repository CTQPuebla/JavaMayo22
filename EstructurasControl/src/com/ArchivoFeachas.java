package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoFeachas {

	public static void main(String[] args) {
		String linea="", diaText="", mesText="",año, fechaText="", lineaTxt;
		int diaInt, mesInt;
		String [] aDia = new String [31];
		String [] aMes = new String [12];
		
		aDia [0] = "Primero";
		aDia [1] = "Dos";
		aDia [2] = "Tres";
		aDia [3] = "Cuatro";
		aDia [4] = "Cinco";
		aDia [5] = "Seis";
		aDia [6] = "Siete";
		aDia [7] = "Ocho";
		aDia [8] = "Nueve";
		aDia [9] = "Díez";
		aDia [10] = "Once";
		aDia [11] = "Doce";
		aDia [12] = "Trece";
		aDia [13] = "Catorce";
		aDia [14] = "Quince";
		aDia [15] = "Dieciséis";
		aDia [16] = "Diecisiete";
		aDia [17] = "Dieciocho";
		aDia [18] = "Dicinueve";
		aDia [19] = "Veinte";
		aDia [20] = "Veintiuno";
		aDia [21] = "Veintidos";
		aDia [22] = "Vientitrés";
		aDia [23] = "Veinticuatro";
		aDia [24] = "Vienticinco";
		aDia [25] = "Vientiséies";
		aDia [26] = "Vientisiete";
		aDia [27] = "Veintiocho";
		aDia [28] = "Veintinueve";
		aDia [29] = "Treinta";
		aDia [30] = "Treinta y uno";
	
		aMes [0] = "Enero";
		aMes [1] = "Febrero";
		aMes [2] = "Marzo";
		aMes [3] = "Abril";
		aMes [4] = "Mayo";
		aMes [5] = "Junio";
		aMes [6] = "Julio";
		aMes [7] = "Agosto";
		aMes [8] = "Septiembre";
		aMes [9] = "Octubre";
		aMes [10] = "Noviembre";
		aMes [11] = "Diciembre";
		
	try {
		
		File archivo= new File ("C:\\Users\\monse\\OneDrive\\Escritorio\\Fechas.txt");
		FileReader linea1= new FileReader (archivo);
		BufferedReader buffer= new BufferedReader(linea1);
		while ((linea=buffer.readLine()) != null) {
		 
			
			diaInt= Integer.parseInt(linea.substring(0, 2));
		//	System.out.println("dia"+diaInt);
			mesInt = Integer.parseInt(linea.substring(2, 4));
		//	System.out.println("Mes"+mesInt);
			año= linea.substring(4);
		//	System.out.println("año"+año);
			for (int i= 0; i<aDia.length; i++) {
				diaText= aDia[diaInt-1];
			//	System.out.println(diaText);
				break;
			}
			for (int i= 0; i<aMes.length; i++) {
				mesText= aMes[mesInt-1];
			//	System.out.println(mesText);
				break;
			}
			fechaText=diaText+" de "+ mesText+" de "+año;
			System.out.println(fechaText);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
		
	}
	}

}
