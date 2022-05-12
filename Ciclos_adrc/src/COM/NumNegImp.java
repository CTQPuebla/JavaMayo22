package COM;
import java.util.Scanner;

public class NumNegImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		boolean seguir=true;
		int numero, sumaPar=0, sumaImpar=0;
		String mensaje;
		
		System.out.println("Escribe un numero");
		
		while(seguir) {
			
			mensaje="El numero es ";
			try {
				numero=sc.nextInt();
				if(numero==0) {
					
				}else if(numero<0) {
					mensaje+="negativo";
				}else {
					mensaje+="positivo";
				}
				
				if(numero%2==0) {
					mensaje+=" y par";
					sumaPar+=numero;
				}else {
					mensaje+=" e impar";
					sumaImpar+=numero;
				}
				
				System.out.println(mensaje);
				System.out.println("");
				System.out.println("Escribe otro numero");
				
			}catch(Exception e) {
				seguir=false;
				System.out.println("suma de numeros pares: "+sumaPar);
				System.out.println("suma de numeros impares es: "+sumaImpar);
				System.out.println("Tarea finalizada");
			}
		}
		

	}

}
