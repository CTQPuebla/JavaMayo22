package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Consesionario {

	List<Auto> listaA = new ArrayList<>();
	HashMap<String,Cliente> hashC = new HashMap<>();
	
	public Consesionario () {
		
	}

	
	
	
	public Consesionario(List<Auto> listaA, HashMap<String, Cliente> hashC) {
		super();
		this.listaA = listaA;
		this.hashC = hashC;
	}




	public List<Auto> getListaA() {
		return listaA;
	}




	public void setListaA(List<Auto> listaA) {
		this.listaA = listaA;
	}




	public HashMap<String, Cliente> getHashC() {
		return hashC;
	}




	public void setHashC(HashMap<String, Cliente> hashC) {
		this.hashC = hashC;
	}

	
	
		
	@Override
		public String toString() {
			return "Consesionario [listaA=" + listaA + ", hashC=" + hashC + "]";
		}


	//llenar autos
	public void llenarA (List algo) {
			setListaA( algo);
		}
	
	//llenar Clientes
	public void llenarC (HashMap algo2) {
		setHashC(algo2);
	}
	
	//Seleccion de auto y cliente 
	
	public void selectA (int numeroAuto) {
		getListaA().get(numeroAuto);
	}
	
	public void selectC (String id) {
		getHashC().get(id);
	}
	
	// Validacion
	public Boolean val ( String id, int numeroAuto) {
		if((getHashC().get(id).getDineroDis()>getListaA().get(numeroAuto).getPrecio()) && (getHashC().get(id).getAutos()<5)) {
			return true;
		}else {
			return false;
		}
	}
	
	//Venta
	public void venta (int numeroAutos, String id, HashMap algo3) {
		
		this.listaA.remove(numeroAutos);
		setHashC(algo3);
	}
	
	
	
	
	
	
	
	
}
