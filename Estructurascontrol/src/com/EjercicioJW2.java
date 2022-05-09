package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioJW2 {

	public static void main(String[] args) {
		String line = "";
		int contador = 0;
		String [] diasLetra= {"1ero","2do","3ro","4to","5to","6to","7mo","","","","","","",};
        String [] mesesletra = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        try {
        File archivo = new File("C:\\Users\\Aidde BE\\Desktop\\doc.txt");
        FileReader linea2 = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(Linea2); 
        System.out.println("Dentro del archivo del texto");
        int dia=0;
        int mes = 0;
        String resultado= "";
        while(line = buffer.readLine());
        

        }
	}
	
	}
}

