package com;

public class Principal {
	
	//Metodo Main
	public static void main(String[] args) {
	
		//Tipos primitivos
		byte b = 127;
		short s = 32767;
		int i = 999999999;
		long l = 99999999999999999l;
		float f = 12.4f;
		double d = 0.14;
		char c = 'ñ';
		boolean bol = false;
		
		
	
	//Wrapers - (Envoltorios)
	Integer n = new Integer(999999999);
	
	n.hashCode(273273);
	
	Float g =  13.3f;
	g.floatValue();
	
	Integer a = new Integer (127);
	a.byteValue ();
			
	Long toobig = new Long(999999999999999999l); 
	Byte uno = 127; 
	
	Integer q = (int) 'v';
	q.signum(7667);
	}
	
	
	
	
}
