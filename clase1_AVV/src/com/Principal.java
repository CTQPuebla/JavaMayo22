package com;

public class Principal {
	
	public static void main(String args[]) {
		
		byte b = 10;
		short s = 11;
		int i = 12;
		long l= 13;
		float f = 12.4f;
		double d= 0.14;
		char c = '5';
		boolean bol = true;
		
		Byte j = new Byte((byte) 10);
		Short k = new Short((short) 11);
		Integer m = new Integer(9999999);
		Long n = new Long (13);
		Float o= new Float(12.4);
		Double p = new Double(0.14);
		Character q = new Character('c');
		Boolean r= new Boolean(false);
		
		k=j.shortValue();
		m=k.intValue();
		n=m.longValue();
		o=n.floatValue();
		p=o.doubleValue();
		q.toString();
		r.booleanValue()
		
		
		
		
		
		
		
		
		
	}

}
