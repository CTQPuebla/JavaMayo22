package com;

public class Principal {

	//Metodo main 
public static void main(String[] args) {
	// Tipos de datos primitivos 
	byte b = 127;
	short S = 11;
	int i = 12;
	long l = 13;
	float f = 12.4f;
	double d = 0.14;
	char c = ' ';
	boolean bol= true; 
	
	
	
	// wrappers 
	Integer n = new Integer(28);	
	Long toobig = new Long(99999999999999l);
	Byte uno = 127;
	Short sh= 450;
	Float fo= 3.1416f;
	Double dou= 0.789;	
	Character ch='M';
	Boolean boo=false;
	
	n.intValue();
	
	toobig.longValue();
	
	uno.byteValue();
	
	sh.shortValue();
	
	fo.floatValue();
	dou.doubleValue();
	ch.charValue();
	boo.booleanValue();
	
}
}
