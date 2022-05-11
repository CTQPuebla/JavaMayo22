package COM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Fechas {

	public static void main (String args[]) {
		
		//javaRW
		
		String line;
		int contador=0;
		
		try {
			File archivo=new File("C:\\Users\\52224\\Desktop\\Fechas.txt");
			FileReader linea2=new FileReader(archivo);
			BufferedReader buffer=new BufferedReader(linea2);
			String dia, mes="", año="";
			
			System.out.println("Dentro del archiivo de texto");
			
			while((line=buffer.readLine()) != null) {
				contador++;
				dia=""+line.charAt(0) + line.charAt(1);
				mes=""+line.charAt(2)+line.charAt(3);
				año=""+line.charAt(4)+line.charAt(5)+line.charAt(6)+line.charAt(7);
				System.out.println(diaText(dia)+" de "+mesText(mes)+" de "+año );
				}
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static String diaText(String d) {
		switch(d){
		case "01": return "Primero"; 
		case "02": return "Dos";
		case "03": return "Tres";
		case "04": return "Cuatro";
		case "05": return "Cinco";
		case "06": return "Seis";
		case "07": return "Siete";
		case "08": return "Ocho";
		case "09": return "Nueve";
		case "10": return "Diez";
		case "11": return "Once";
		case "12": return "Doce";
		case "13": return "Trece";
		case "14": return "Catorce";
		case "15": return "Quince";
		case "16": return "Diesiseis";
		case "17": return "Diesisiete";
		case "18": return "Disiocho";
		case "19": return "Diesinueve";
		case "20": return "Veinte";
		case "21": return "Veintiuno";
		case "22": return "Veitidos";
		case "23": return "Veintitres";
		case "24": return "Veinti cuatro";
		case "25": return "Veinti cinco";
		case "26": return "Veintiseis";
		case "27": return "Veintisiete";
		case "28": return "Veintiocho";
		case "29": return "Veintinueve";
		case "30": return "treinta";
		case "31": return "treinta y uno";
		}
		return "";
	}
	
	private static String mesText(String m) {
		switch(m) {
		case "01": return "Enero";
		case "02": return "Febrero";
		case "03": return "Marzo";
		case "04": return "Abril";
		case "05": return "Mayo";
		case "06": return "Junio";
		case "07": return "Julio";
		case "08": return "Agosto";
		case "09": return "Septiembre";
		case "10": return "Octubre";
		case "11": return "Noviembre";
		case "12": return "Diciembre";
		}
		return "";
	}

}
