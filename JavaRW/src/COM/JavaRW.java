package COM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaRW {
	public static void main(String[] args) {
		
	

//	private static final String Enero = null;
//	private static final String Febrero = null;
//	private static final String Primero = null;
//	private static final String Dos = null;
//	private static final String Tres = null;
//	private static final String Cuatro = null;
//	private static final String Seis = null;
//	private static final String Cinco = null;
//	private static final String Siete = null;
//	private static final String Ocho = null;
//	private static final String Nueve = null;
//	private static final String Diez = null;
//	private static final String Once = null;
//	private static final String Doce = null;
//	private static final String Trece = null;
//	private static final String Catorce = null;
//	private static final String Quince = null;
//	private static final String Veinte = null;
//	private static final String Veintiuno = null;
//	private static final String Veintidos = null;
//	private static final String Veintitres = null;
//	private static final String Veinticuatro = null;
//	private static final String Veinticinco = null;
//	private static final String Veintiseis = null;
//	private static final String Veintisiete = null;
//	private static final String Veintiocho = null;
//	private static final String Veintinueve = null;
//	private static final String Treinta = null;
//	private static final String Treintayuno = null;
//	private static final String Diezyseis = null;
//	private static final String Diezysiete = null;
//	private static final String Diezyocho = null;
//	private static final String Diezynueve = null;
//	private static final String Marzo = null;
//	private static final String Abril = null;
//	private static final String Mayo = null;
//	private static final String Junio = null;
//	private static final String Julio = null;
//	private static final String Agosto = null;
//	private static final String Septiembre = null;
//	private static final String Octubre = null;
//	private static final String Noviembre = null;
//	private static final String Diciembre = null;



		// metodos clase String
		// substring **Sirve para cortar una sección de un string
		// charAt Extraer caracter de un String
		// tolowerCase
		// toUpperCase
		// valueOf
		// lastIndexOf **Ultima posición donde se encuentra x caracer en int

//		String m ="Estes un mensaje de prueba";
//		System.out.println(m.substring(9,16));

//		float f = 13.5f;
//		System.out.println(m.lastIndexOf("en", 10));

		// JavaRW
//		String line = "";
//		int contador = 0;
//
//		try {
//			File archivo = new File("C:\\Users\\gerar\\Desktop\\archivo de texto.txt");
////			FileWriter linea = new FileWriter(archivo, true);
////			
////			 for (int i = 0; i < 20; i++) {
//////			 System.out.println("El valor de i es:" +i);
////			 linea.write ("Hola mundo" + i+ "\n");
////			 }
////			linea.close();
////			
//			//Lectura
//			FileReader linea2 = new FileReader (archivo); //permite tener una referencia hacia un archivo que va a ser leido 
//			BufferedReader buffer = new BufferedReader (linea2); // Es un espacio temporal donde se carga el contenido de este archivo
//			System.out.println("Dentro del archivo de texto");
//			
//			while ((line = buffer.readLine()) != null) {
//				
//				
//				
//				contador++;
//				System.out.println("line: " + line + " " + contador);
//			 
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
// Ejercicio Realizar en un archivo de texto que las lineas que se lean en el fichero, pasen a la consola de numero a texto 
		
//		
//		
//		
//		String line = "";
//		int contador = 0;			
//
//		try {
//			File archivo = new File("C:\\Users\\gerar\\Desktop\\archivo de texto.txt");
//		
//			//Lectura
//			FileReader linea2 = new FileReader (archivo); //permite tener una referencia hacia un archivo que va a ser leido 
//			BufferedReader buffer = new BufferedReader (linea2); // Es un espacio temporal donde se carga el contenido de este archivo
//			
//			
//			String m, n =" ", a="";
//			
//			System.out.println("Dentro del archivo de texto");
//			
//			while ((line = buffer.readLine()) != null) {
//			contador++;
//			m= " "+ line.substring(0, 2);
//			n= " "+ line.substring(2, 4);
//			a= " "+ line.substring(4, 8);
//			
//			System.out.println(mText(m)+" de "+nText(n)+ " de " +a);
//				
//				System.out.println("line: " + line + " " + contador);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//	}
//	
//	private static String mText (String m) {
//		
//		 String Dia01= Primero;
//		 String Dia02= Dos;
//		 String Dia03= Tres;
//		 String Dia04= Cuatro;
//		 String Dia05= Cinco;
//		 String Dia06= Seis;
//		 String Dia07= Siete;
//		 String Dia08= Ocho;
//		 String Dia09= Nueve;
//		 String Dia10= Diez;
//		 String Dia11= Once;
//		 String Dia12= Doce;
//		 String Dia13= Trece;
//		 String Dia14= Catorce;
//		 String Dia15= Quince;
//		 String Dia16= Diezyseis;
//		 String Dia17= Diezysiete;
//		 String Dia18= Diezyocho;
//		 String Dia19= Diezynueve;
//		 String Dia20= Veinte;
//		 String Dia21= Veintiuno;
//		 String Dia22= Veintidos;
//		 String Dia23= Veintitres;
//		 String Dia24= Veinticuatro;
//		 String Dia25= Veinticinco;
//		 String Dia26= Veintiseis;
//		 String Dia27= Veintisiete;
//		 String Dia28= Veintiocho;
//		 String Dia29= Veintinueve;
//		 String Dia30= Treinta;
//		 String Dia31= Treintayuno;
//	
//	}
//	private static String nText(String n) {
//		
//		
//		String mes01= Enero;
//		String mes02= Febrero;
//		String mes03= Marzo;
//		String mes04= Abril;
//		String mes05= Mayo;
//		String mes06= Junio;
//	    String mes07= Julio;
//		String mes08= Agosto;				
//		String mes09= Septiembre;
//		String mes10= Octubre;
//		String mes11= Noviembre;
//		String mes12= Diciembre;
//		
		
//    String line = "";
//    int contador = 0;
//    
//    
//    String[] díasLetra= {"primero", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "diez y seis", "diez y siete", "diez y ocho", "diez y nueve", "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve"," treinta", "treinta y uno"};
//    String[] mesesLetra= { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
//
//    try {
//		File archivo = new File("C:\\Users\\gerar\\Desktop\\archivo de texto.txt");
//		FileReader linea2 = new FileReader (archivo); //permite tener una referencia hacia un archivo que va a ser leido 
//		BufferedReader buffer = new BufferedReader (linea2); // Es un espacio temporal donde se carga el contenido de este archivo
//		
//		System.out.println("Dentro del archivo de texto");
//    			int día=0;
//    			int mes=0;
//    			String resultado= "";
//    			
//    			while ((line = buffer.readLine()) != null) {
//    				contador++;
//    				System.out.println("linea: " + line);
//    				día = Integer.parseInt(line.substring(0,2));
//    				mes = Integer.parseInt(line.substring(2,4));
//    			System.out.println("Fecha: " +díasLetra[día-1] + "de " + mesesLetra[mes-1]+ "de " +line.substring(4, line.length()));
//    			
//    			}
//    		} catch (Exception e) {
//    				e.printStackTrace();
//    	
//    			}
//	}
//}
    			

