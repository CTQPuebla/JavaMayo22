package com;

public class Principal {
	public static void main(String[] args) {
		//Datos primitivos
		byte b= 127;
		short s= 3276;
		int i= 12;
		long l= 13;
		float f= 12.14f;
		double d= 0.14;
		char c= '5';
		boolean bol= false;
		
		//Estructurados
		String cadena = new String();

		//Wrappers y sus metodos
		Integer n = new Integer(99999997);
		cadena = n.toString(n);
		System.out.println(cadena);
		
		Long toobig = new Long(99999999999999l);
		cadena = toobig.toString(toobig);
		System.out.println(cadena);
		
		Byte uno = 127;
		cadena = uno.toString();
		System.out.println(cadena);
		
		Short s1 = 3267;
		cadena = s1.toString();
		System.out.println(cadena);
		
		Float f1 = 12.41f;
		cadena = f1.toString();
		System.out.println(cadena);
		
		Double d1 = new Double(1.3455555555);
		cadena = d1.toString(d1);
		System.out.println(cadena);
		
		Character ch = 'r';
		c = ch.charValue();
		System.out.println(c);
		
		Boolean b1 = new Boolean(true);
		bol = b1.booleanValue();
		System.out.println(bol);
	}
} 
