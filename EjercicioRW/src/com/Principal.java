package com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Controlador c = new Controlador();
		c.registroFechas();
		System.out.println("fechas guardadas con exito\n\nProcesamiento de lecturas de fechas\n");
		c.lecturaFechas();
		
		
	}
}
