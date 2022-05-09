package com;

import java.util.Scanner;

public class Ejercicios13al14IfAndSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
 double peso, altura, IMC;
 
 System.out.println("Ingrese el Peso en Kg:");
 peso=sc.nextDouble();
 System.out.println("Ingrese Altura en m:");
 altura=sc.nextDouble();
 IMC= peso/(altura*altura);
  if (IMC<16) {
	  System.out.println("IMC="+IMC+" Criterio de ingreso al hospital");
  }else if (IMC>=16 && IMC<17) {
	  System.out.println("IMC="+IMC+" Infrapeso");
	  
  }else if (IMC>=17 && IMC<18) {
	  System.out.println("IMC="+IMC+" Bajo Peso");
  }else if (IMC >=18 && IMC <25) {
	  System.out.println("IMC="+IMC+" Peso norma (Soludable)");	  
  }else if (IMC >=25 && IMC<30) {
	  System.out.println("IMC="+IMC+" Sobrepeso (obecidad grado 1)");
  }else if (IMC>=30 && IMC<35) {
	  System.out.println("IMC="+IMC+" Sobrepeso cronica (obecidad grado 2)");
  }else if(IMC>=35 && IMC<40) {
	  System.out.println("IMC="+IMC+" Obecidad premórbida (obecidad grado 3)");
  }else if (IMC>40) {
	  System.out.println("IMC="+IMC+" Obecidad mórbida (obecidad grado 4)");
  }
		 
 
  
	}

}
