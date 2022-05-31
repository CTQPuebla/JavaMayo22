package COM;
import java.util.Scanner;
public class Tabla {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int numero, iteracion;
		
		System.out.println("Podemos generar la tabla que deses");
		
		System.out.println("Introduce el numero a multiplicar");
		numero=sc.nextInt();
		
		System.out.println("Introduce el numero de iteraciones");
		iteracion=sc.nextInt();
		
		System.out.println("Tabla");
		
		for(int i=1; i<=iteracion; i++) {
			System.out.println(numero+"X"+i+"="+numero*i);
		}
		
		
	}
}
