package COM;
import java.util.Scanner;

public class Uvas {
	
	
	public static void main(String args[]) {
		int kilos, tama�o;
		char tipo;
		float precio=50f, costo=50;
		String aux = new String();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("El costo inicial de la uva es de $50 n/");
		
		System.out.println("Escribe la cantidad de kilos a entregar");
		kilos = sc.nextInt();
		
		System.out.println("Escribe el tipo de uva");
		aux=sc.next();
		tipo=aux.charAt(0);
		
		System.out.println("Escribe el tama�o de la uva");
		tama�o=sc.nextInt();
		
		switch(tipo){
			case 'A': if(tama�o==1) {
				costo=costo+0.02f;
			}else {
				costo=costo+.3f;
			}
				break;
			case 'B': if(tama�o==1) {
				costo=costo-0.30f;
			}else {
				costo=costo-0.5f;
			}
				break;
		}
			
		System.out.println("entrega al vendedor: " + costo*precio);
		
		
	}

	
}
