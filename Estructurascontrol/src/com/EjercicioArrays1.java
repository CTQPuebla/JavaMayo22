package com;

public class EjercicioArrays1 {

	public static void main(String[] args) {
		
		//creando un array que contendría los meses en formato texto, y para ello, 
		//hemos declarado su tipo, y el espacio en memoria para las 12 posiciones
	
//		String [] meses = new String[12];
//		meses[0] = "Enero";
//		meses[1] = "Febrero";
//		meses[2] = "Marzo";
//		meses[3] = "Abril";
//		meses[4] = "Mayo";
//		meses[5] = "Junio";
//		meses[6] = "Julio";
//		meses[7] = "Agosto";
//		meses[8] = "Septiembre";
//		meses[9] = "Octubre";
//		meses[10] = "Noviembre";
//		meses[11] = "Diciembre";
		
		//otra forma de crear el array 
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		System.out.println(meses[0]);
		for (int i = 0; i <12; i++){
			System.out.println(meses[i]);
			}
	}

}
