package com;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hash = new HashMap<Integer,String>();
		
		//Agregar valor al hash
		hash.put(10, "Once");
		hash.put(11, "hola");
		hash.put(12, "Java");
		hash.put(15, "hp");
		hash.put(10, "Nueve");
		System.out.println(hash);
		
		//Extraer {llave,valor} del hash
		System.out.println(hash.get(10));
		
		//eliminar un elemento buscando por la llave
		hash.remove(11);
		System.out.println(hash);
		
		//Elimina el conjunto k,v solo si esta mapeada correctamente
		hash.remove(12, "kkkkk");
		System.out.println(hash);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
