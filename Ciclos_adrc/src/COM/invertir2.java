package COM;

public class invertir2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dinero=700;
		int con=1;
		
		while(dinero<1500) {
			System.out.println(dinero);
		dinero=dinero+(dinero*.02);
		con++;
		}
		
		System.out.println("Total de meses para obtener 1500: "+con);
		System.out.println("Dinero: "+dinero);
	}

}
