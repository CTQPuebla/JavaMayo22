package com;

public class Principal {
	//Metodo main
	public static void main(String args[]) {
		
		//Tipos de datos
		byte b = -127;
		short s = 11;
		int i = 999999999;
		long l = 999999999999999l;
		float f = 12.4f;
		double d = 0.14;
		char c = '5';
		boolean bol = true;
		
		//Wrappers - (Envoltorios)
		Integer n = new Integer(999999999);
		n.byteValue();
		Long tooBig = new Long(999999999999999l);
		tooBig.doubleValue();
		Byte bt = -127 ;
		bt.floatValue();
		Short sh = 12;
		sh.longValue();
		Float flo = new Float(12.4f);
		flo.isNaN();
		Double dble = new Double(0.14);
		dble.toString();
		Character chr = new Character('5');
		chr.charValue();
		Boolean blean = new Boolean(true);
		blean.hashCode();
		
	}

}
