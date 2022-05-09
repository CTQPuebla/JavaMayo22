package Com;
//METODO MAIN
public class Principal {
	public static void main(String[] args) {
		
		
		//TIPOS PRIMITIVOS
		byte b = 127;
		short s = 3276;
		int i = 99999999;
		long l = 9999999999999l;
		float f = 12.4f;
		double d = 0.14578543;
		char c= '5';
		boolean bol = true;
		
		
		//Wrappers - (Envoltorios):Para objetos de clase que ya estan definidos en la clase 
		
		Integer n = new Integer(999999999);
		n.intValue();
		Long toobig = new Long(999999999999999999l); 
		Byte uno = 127;
		
		
		Short corto = 20;
		n.byteValue();
		
		Byte g = new Byte((byte)234);
		n.notify();
		
		Float p = new Float (785.8f);
		n.getClass();
		
		Long w = new Long (239);
		n.hashCode();
		
		Double x = new Double (456);
		n.notifyAll();
		
		Character a = new Character ('H');
		n.doubleValue();
				
        Boolean q = new Boolean(false);
        n.intValue();
		
	}
		
	}
