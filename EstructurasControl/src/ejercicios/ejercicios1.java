package ejercicios;
import java.util.*;



public class ejercicios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//--------------------------------------------	
		
		int n1=0,n2=0;
		float f1,f2;
		String text;
		
		Scanner entrada= new Scanner(System.in);
		
//		System.out.println("ejercicio 1");
//		System.out.println("numero 1:");
//		n1=entrada.nextInt();
//		
//		System.out.println("numero 2:");
//		n2=entrada.nextInt();
//		
//		if(n1>n2) {
//			System.out.println(n1 +" es mayor a "+ n2);
//			
//		}else if(n2>n1) {
//			System.out.println(n2 +" es mayor a "+ n1);
//		}else {
//			System.out.println(n1 +" es igual a "+ n2);
//		}
//		
//	//--------------------------------------------	
//		System.out.println("ejercicio 2");
//		System.out.println("numero 1:");
//		n1=entrada.nextInt();
//		if(n1%2 == 0) {
//			System.out.println(" es par ");
//		}else {
//			System.out.println(" es impar ");
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 3");
//		System.out.println("numero 1:");
//				
//		f1=entrada.nextFloat();
//				
//		System.out.println("numero 2:");
//		f2=entrada.nextFloat();
//		
//		if(f2 == 0) {
//			System.out.println("no se puede");
//		}else {
//			System.out.println(f1/f2);
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 4");
//		
//		String text2;
//		
//		text=entrada.next();
//		
//		System.out.println(text);
//		
//		text2=text.toLowerCase();
//		
//		
//		if(text.equals(text2)) {
//			System.out.println("no tiene mayusculas");
//		}else {
//			System.out.println("tiene mayusculas");
//		}
//		
//		//--------------------------------------------	
//		System.out.println("ejercicio 5");
//		
//		int no,ed;
//	    String se;
//		
//		System.out.println("nota:");
//        no=entrada.nextInt();
//        
//        System.out.println("edad:");
//        ed=entrada.nextInt();
//        
//        System.out.println("sexo m/f:");
//        se=entrada.next();
//        
//        if(se.equalsIgnoreCase("m")) {
//        	if(no>=5 && ed>=18) {
//        		System.out.println("posible");
//        	}else {
//        		System.out.println("no aceptado");
//        	}
//        }
//        
//        if(se.equalsIgnoreCase("f")) {
//        	if(no>=5 && ed>=18) {
//        		System.out.println("aceptada");
//        	}else {
//        		System.out.println("no aceptado");
//        	}
//        }
//        
//       //--------------------------------------------	
//      	System.out.println("ejercicio 6");
//      	
//      	double precio;
//      	int tam;
//      	String tip;
//      	
//      	System.out.println("precio inicial");
//      	precio=entrada.nextDouble();
//      	
//      	System.out.println("tipo");
//      	tip=entrada.next();
//      	
//      	System.out.println("tamaño");
//      	tam=entrada.nextInt();
//      	
//      	if(tip.equalsIgnoreCase("a")) {
//      		if(tam==1) {
//      			precio=precio+0.2;
//      		}else {
//      			precio=precio+0.3;
//      		}
//      	}else if(tam==1) {
//  			precio=precio-0.3;
//  		}else {
//  			precio=precio-0.5;
//  		}
//      	System.out.println("precio es " + precio);
//      	
//      //--------------------------------------------	
//      	System.out.println("ejercicio 7");
//      	
//      	double alu,pago,costo;
//      	
//      	System.out.println("cantidad de alumnos=");
//    	alu=entrada.nextDouble();
//    	
//    	if(alu>99) {
//    		costo=65;
//    		pago=65*alu;
//    	}else if(alu>49) {
//    		costo=70;
//    		pago=70*alu;
//    	}else if(alu>29) {
//    		costo=95;
//    		pago=95*alu;
//    	}else {
//    		pago=4000;
//    		costo= 4000/alu;
//    	}
//      	
//    	System.out.println("pago a compañia= "+ pago + " costo por alumno= "+costo);
//      	
//    	//--------------------------------------------	
//      	System.out.println("ejercicio 8");
//      	
//      	System.out.println("resultado");
//      	n1=entrada.nextInt();
//      	
//      	switch (n1) {
//      	
//      	case 1:
//      		n1= 6;
//      		System.out.println("la cara opuesta es "+n1);
//      		break;
//      	case 2:
//      		n1= 5;
//      		System.out.println("la cara opuesta es "+n1);
//      		break;
//      	case 3:
//      		n1= 4;
//      		System.out.println("la cara opuesta es "+n1);
//      		break;
//      	case 4:
//      		n1= 3;
//      		System.out.println("la cara opuesta es "+n1);
//      		break;
//      	case 5:
//      		n1= 2;
//      		System.out.println("la cara opuesta es "+n1);
//      		break;
//      	case 6:
//      		n1= 1;
//      		System.out.println("la cara opuesta es "+n1);
//      		
//      		default:
//      			System.out.println("El valor "+n1+ " es incorrecto");
//      			break;
//      	}
//      	
//      //--------------------------------------------	
//      	System.out.println("ejercicio 9");
//      	
//      	System.out.println("dia de la semana");
//      	n1=entrada.nextInt();
//      	
//      	switch (n1) {
//      	
//      	case 1:
//      		System.out.println("el dia "+n1+ " es lunes ");
//      		break;
//      	case 2:
//      		System.out.println("el dia "+n1+ " es martes");
//      		break;
//      	case 3:
//      		System.out.println("el dia "+n1+ " es miercoles");
//      		break;
//      	case 4:
//      		System.out.println("el dia "+n1+ " es jueves");
//      		break;
//      	case 5:
//      		System.out.println("el dia "+n1+ " es viernes");
//      		break;
//      	case 6:
//      		System.out.println("el dia "+n1+ " es sabado");
//      		break;
//      	case 7:
//      		System.out.println("el dia "+n1+ " es domingo");
//      		break;
//      		
//      		default:
//      			System.out.println("El valor "+n1+ " es incorrecto");
//      			break;
//      	}
//      	
//      //--------------------------------------------	
//      	System.out.println("ejercicio 10");
//      	
//      	System.out.println("numero de mes");
//      	n1=entrada.nextInt();
//      	
//      	switch (n1) {
//      	
//      	case 1:
//      		System.out.println("el mes "+n1+ " tiene 21 dias ");
//      		break;
//      	case 2:
//      		System.out.println("el mes "+n1+ " tiene 22 dias ");
//      		break;
//      	case 3:
//      		System.out.println("el mes "+n1+ " tiene 23 dias ");
//      		break;
//      	case 4:
//      		System.out.println("el mes "+n1+ " tiene 24 dias ");
//      		break;
//      	case 5:
//      		System.out.println("el mes "+n1+ " tiene 25 dias ");
//      		break;
//      	case 6:
//      		System.out.println("el mes "+n1+ " tiene 26 dias ");
//      		break;
//      	case 7:
//      		System.out.println("el mes "+n1+ " tiene 27 dias ");
//      		break;
//      	case 8:
//      		System.out.println("el mes "+n1+ " tiene 28 dias ");
//      		break;
//      	case 9:
//      		System.out.println("el mes "+n1+ " tiene 29 dias ");
//      		break;
//      	case 10:
//      		System.out.println("el mes "+n1+ " tiene 30 dias ");
//      		break;
//      	case 11:
//      		System.out.println("el mes "+n1+ " tiene 31 dias ");
//      		break;
//      	case 12:
//      		System.out.println("el mes "+n1+ " tiene 32 dias ");
//      		break;
//      		
//      		default:
//      			System.out.println("El valor "+n1+ " es incorrecto");
//      			break;
//      	}
//     	
//     //--------------------------------------------	
//      	System.out.println("ejercicio 12");
//      	
//      	double peso,est,imc;
//      	
//      	
//      	System.out.println("peso");
//      	peso=entrada.nextDouble();
//      	
//      	System.out.println("est");
//      	est=entrada.nextDouble();
//      	
//      	imc=peso/(est*est);
//      	
//      	if(imc<16) {
//      		System.out.println("hospital");
//      	}else if(imc<17) {
//      		System.out.println("infrapeso");
//      	}else if(imc<18) {
//      		System.out.println("bajo peso");
//      	}
//        //--------------------------------------------   	
//      	System.out.println("ejercicio 13");
//      	
//      	double don;
//      	
//      	
//      	System.out.println("donacion");
//      	don=entrada.nextDouble();
//      	
//      	if(don>=1000) {
//      		System.out.println("centro de salud "+ (don*0.3));
//      		System.out.println("comedor de niño "+ (don*0.5));
//      		System.out.println("inversion "+ (don*0.2));
//      	}else{
//      		System.out.println("centro de salud "+ (don*0.25));
//      		System.out.println("comedor de niño "+ (don*0.6));
//      		System.out.println("inversion "+ (don*0.15));
//      	}
//		//--------------------------------------------   	
//     	System.out.println("ejercicio 14");
//      	
//      	int horas;
//      	
//      	System.out.println("horas");
//      	horas=entrada.nextInt();
//      	
//      	if(horas<=40){
//      		System.out.println("sueldo "+ (horas*16));
//      	}else{
//      		System.out.println("sueldo "+ ((40*16)+((horas-40)*20)));
//      	}     	
	}

}
