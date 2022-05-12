package COM;
import java.util.Scanner;
public class NumeroSuma {

	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean seguir=true;
		int con=0, mayores=0;
		double[] numeros = new double [100];
		double promedio, n, cantidad=0;
		
		System.out.println("introduce numeros, nos detendremos cuando pongas una letra y calcularemos la suma");
		
		while(seguir) {
			try{
				n=sc.nextDouble();
				numeros[con]=n;
				cantidad=cantidad+n;
				con++;
				
				System.out.println("ingresa otro numero");
			}catch(Exception e) {
				seguir=false;
				System.out.println("la suma es : "+cantidad);
				promedio=cantidad/con;
				System.out.println("el promedio es: "+promedio);
				for(int i=0; i<100; i++) {
					if(numeros[i]>(cantidad/con)) {
						mayores=mayores+1;
					}
				}
				
				System.out.println("numeros mayores al promedio: "+mayores);
			}
		}
		
	
		
	}
}
