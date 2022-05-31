package COM;

public class invertir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dinero=1000;
		
		
		for(int i=1;i<=12;i++) {
		dinero=dinero+(dinero*.02);	
		}
		
		System.out.println("Total de dinero despues de 12 meses: "+dinero);
	}

}
