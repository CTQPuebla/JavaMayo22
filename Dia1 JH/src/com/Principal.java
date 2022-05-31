package com;

public class Principal {

	private static final Character Boolean = null;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
	    //Tipos primitivos
		byte b = -127;
		short s = 3276;
		int i = 999999999;
		long l = 99999999999999l;
		float f = 12.4f;
		double d = 0.14567876;
		char c = 'ñ';
		boolean bol = false;

		//Wrappers - (Envoltorios)
		
        Integer  n = new Integer (999999999);
        Long  toobig= new Long (999999999999999999l);
        Byte uno = 127;
        
        n.byteValue();
        
        Integer gg = 50;
        Short tt = 3276;
        Byte ee = 127;
        Float uu = 12.4f;
        Long rr = 99999999999999l;
        Double qq = 0.14567876;
        Character cc = 'ñ';
        Boolean yy = false;
        
        gg .doubleValue();
        tt.hashCode();
        ee.equals(yy);
        uu.isNaN();
        rr.notifyAll();
        qq.floatValue();
        cc.charValue();
        yy.equals(yy);
        
        
        
        
        
				
		}
	
	
	
	
}