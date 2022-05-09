package ejercicios;

import java.util.Scanner;

public class ejercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		int n1,n2,i,b;
		String s,s2;
//		//--------------------------------------------	
//		System.out.println("ejercicio 1");
//		i =0;
//		
//		while(i<13) {
//			System.out.println((i*12));
//			i++;
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 2");
//		
//		System.out.println("TABLA:");
//		n1=entrada.nextInt();
//		
//		System.out.println("Hasta:");
//		n2=entrada.nextInt();
//		
//		i=0;
//		
//		while(i<n2+1) {
//     		System.out.println((i*n1));
//			i++;
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 3");
//		
//		System.out.println("Palabra:");
//		s=entrada.nextLine();
//		b=1;
//		
//		for(i=0;i < (s.length()/2);i++) {
//			
//			System.out.println(s.charAt(i));
//			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
//				b=0;
//				System.out.println("No es palindromo");
//				break;
//			}			
//		}
//		
//		if(b==1) {
//			System.out.println("si es palindromo");
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 4");
//		
//		System.out.println("Frase:");
//		s=entrada.next();
//		
//		System.out.println("letra:");
//		s2=entrada.next();
//		
//        b=0;
//		
//		for(i=0;i < (s.length());i++) {
//			
//			System.out.println(s.charAt(i));
//			if(s.charAt(i) == s2.charAt(0) ) {
//				b++;
//
//			}			
//		}
//		
//		if(b!=0) {
//			System.out.println("la frase contiene "+ b + " veces la letra");
//		}else {
//			System.out.println(" caracter no encontrado");
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 5");
//		
//        for(i=0;i < 24;i++) {
//        	for(int h=0;h < 60;h++) {
//        		for(int se=0;se < 60;se++) {
//        			System.out.println(i+":"+ h +":"+ se);
//        		}
//        	}
//		}
//        
//      //--------------------------------------------	
//      	System.out.println("ejercicio 6");
//      	
//      	b=1000;
//      	
//      	for(i=0;i < 13;i++) {
//      		b=(int) (b*1.02);
//      		System.out.println(b);
//      	}
//      	
//      //--------------------------------------------	
//       System.out.println("ejercicio 7");
//       
//       b=700;
//       i=0;
//       
//       while(b<1500) {
//    	   b=(int) (b*1.02);
//    	   System.out.println(b);
//    	   i++;
//       }
//       System.out.println("se tarda "+ i + " meses");
//       
//      //--------------------------------------------	
//       System.out.println("ejercicio 8");
//       
//		System.out.println("numero 1:");
//		n1=entrada.nextInt();
//		
//		System.out.println("numero 2:");
//		n2=entrada.nextInt();
//		
//		if(n1>n2) {
//			while(n2<=n1) {
//				System.out.println(n2);	
//				n2++;
//			}
//		}else {
//			while(n1<=n2) {
//				System.out.println(n1);	
//				n1++;
//			}
//		}
//		
//      //--------------------------------------------	
//       System.out.println("ejercicio 9");
//		System.out.println("numero 1:");
//		n1=entrada.nextInt();
//		
//		System.out.println("numero 2:");
//		n2=entrada.nextInt();
//		
//		
//		if(n1>n2) {
//			while(n2<=n1) {
//				if(n2%2 == 0) {
//					System.out.println("numero par: " + (n2));
//				}
//				n2++;
//			}
//		}else {
//			while(n1<=n2) {
//				if(n1%2 == 0) {
//					System.out.println("numero par: " + (n1));
//				}
//				n1++;				
//			}
//		}
//		
//		//--------------------------------------------	
//	       System.out.println("ejercicio 10");
//			System.out.println("numero 1:");
//			n1=entrada.nextInt();
//			
//			System.out.println("numero 2:");
//			n2=entrada.nextInt();
//			
//			int sumI=0,sumP=0;
//			
//			b=n2;
//			
//			if(n1>n2) {
//				n2=n1;
//				n1=b;
//			}
//			
//				while(n1<=n2) {
//					if(n1%2 == 0) {
//						if(n1<0) {
//							System.out.println("el numero "+ n1 + " es par y negativo" );
//						}else {
//							System.out.println("el numero "+ n1 + " es par y positivo" );
//						}
//						sumP=sumP+n1;
//					}else {
//						if(n1<0) {
//							System.out.println("el numero "+ n1 + " es inpar y negativo" );
//						}else {
//							System.out.println("el numero "+ n1 + " es inpar y positivo" );
//						}
//						sumI=sumI+n1;
//					}
//					n1++;
//				}
//				
//				System.out.println("Sumatoria par "+ sumP + " Sumatoria inpar "+ sumI );
//				
//				//--------------------------------------------	
//		       System.out.println("ejercicio 11");
//		       System.out.println("numero:");
//				s=entrada.nextLine();
//				b=0;
//				while(s.matches("[+-]?\\d*(\\.\\d+)?")) {
//					b=b+Integer.parseInt(s);
//					System.out.println(Integer.parseInt(s));
//					System.out.println("numero:");
//					s=entrada.nextLine();
//					
//				}
//				System.out.println("suma: "+b);
//			
//				//--------------------------------------------	
//			       System.out.println("ejercicio 12");
//			       
//			       System.out.println("ancho:");
//					n1=entrada.nextInt();
//					
//				   System.out.println("alto:");
//					n2=entrada.nextInt();
//					
//					for(i=0;i<n2;i++) {
//						for(b=0;b<n1;b++) {
//							System.out.print("*");
//						}
//						System.out.print("\n");
//					}
//				//--------------------------------------------	
//				    System.out.println("ejercicio 13");
//				    
//				    i=0;
//				    b=0;
//				    while(true){
//				    	System.out.println("Edad:");
//						n1=entrada.nextInt();
//						i=i+n1;
//						b++;
//						if(i/b >= 25){
//							System.out.println("sumatoria:"+ i);
//							System.out.println("cantidad de datos:"+ b);
//							break;
//						}
//				    }
					
	}

}
