package com;

public class Principal {
	
	//Metodo Main
	public static void main(String args []) {
	
		//tipos de datos primitivos 
		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 139999999999l;
		float f = 12.4f; 
		double d = 12.4;
		char c = 'k';
		boolean bo = true;
		
		//Wrappers - envoltorio 
		
		Integer n = new Integer(334);
		Byte by = b;
		Short sh = s;
		Integer in = i;
		Long lo = l;
		Float fl = f;
		Double dou = d;
		Character ch = c;
		Boolean bol = bo;
		
		//tipos de datos estructurados
		String est = "Donovan" +
					n.toString() + 
					by.toString() +
					sh.toString() +
					in.toString() +
					lo.toString() +
					fl.toString() +
					dou.toString() +
					ch.toString() +
					bol.toString();
		System.out.print(est);
	}
}