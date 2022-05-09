package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		int n1,n2,i,b;
		String s,s2;

	    System.out.println("ancho");
		n1=entrada.nextInt();
			
		System.out.println("alto:");
	    n2=entrada.nextInt();
	    
	    entrada.nextLine();
	    
	    String [][] cuadro1= new String[n1][n2];
	    String [][] cuadro2= new String[n1][n2];
	    int [][] cuadroR= new int[n1][n2];
	    
		for(i=0;i<n2;i++) {
			for(b=0;b<n1;b++) {

				System.out.println("cuadro1 dato:");
				s=entrada.nextLine();
				cuadro1[i][b]=s;
				
			}
		}
		
		
		for(i=0;i<n2;i++) {
			for(b=0;b<n1;b++) {

				System.out.println("cuadro2 dato:");
				s=entrada.nextLine();
				cuadro2[i][b]=s;
				
			}
		}
		System.out.println(Arrays.deepToString(cuadro1));
		System.out.println(Arrays.deepToString(cuadro2));
		
		for(i=0;i<n2;i++) {
			for(b=0;b<n1;b++) {
				

				if((cuadro1[i][b].matches("\\d{1,}"))&&(cuadro2[i][b].matches("\\d{1,}"))) {
					cuadroR[i][b]=(Integer.parseInt(cuadro1[i][b]))+(Integer.parseInt(cuadro2[i][b]));
				}else {
					cuadroR[i][b]=0;
				}
				
			}
		}
		System.out.println(Arrays.deepToString(cuadroR));
				
	}

}
