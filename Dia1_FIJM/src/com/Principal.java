package com;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
		//tipos primitivos
		byte b = 127;
		short s = 3276;
		int i = 999999999;
		long l = 9999999999999999l;
		float f=12.4f;
		double d = 0.14567876;
		char c = 'ñ';
		boolean bol = false;
		
		//wrappers - (envolvedores)
		Byte dos = 127;
		Short shortEstructurado = 3276;
		Integer intEstructurado = new Integer(999999999);
		Long longEstructurado = new Long(9999999999999999l);
		Float floatEstructurado = new Float(12.4f);
		Double doubleEstructurado = new Double(0.14567876);
		Character charEstructurado = new Character('5');
		Boolean booleanEstructurado = new Boolean(false);
		
		System.out.println(dos.getClass());
		System.out.println(shortEstructurado.compareTo(shortEstructurado));
		intEstructurado.toString();
		longEstructurado.getClass();
		floatEstructurado.byteValue();
		doubleEstructurado.isNaN();
		charEstructurado.equals(shortEstructurado);
		booleanEstructurado.toString();
		
		
		
		
		
		
		
		
	}

}
