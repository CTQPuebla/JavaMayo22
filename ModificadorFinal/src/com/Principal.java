package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Avion a1 = new Avion();
		Avion a2 = new Avion();
		a1.setMarca("Boeing");
		a1.setModelo("A400");
		
		a2.setMarca("Airbus");
		a2.setModelo("727");
		
		System.out.println(a1.getCombustible());
		System.out.println(a1.COMBUSTIBLE);
		
		
		
		
		
		
	}

}
