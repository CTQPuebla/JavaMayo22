package com;

import java.util.HashMap;

public class Agenda {

	String key1, key2;
	HashMap<String,Contacto> agendaN = new HashMap<>();
	HashMap<String,Contacto> agendaC = new HashMap<>();
	
	public Agenda () {
		
	}

	public Agenda(String key1, String key2, HashMap<String, Contacto> agendaN, HashMap<String, Contacto> agendaC) {
		super();
		this.key1 = key1;
		this.key2 = key2;
		this.agendaN = agendaN;
		this.agendaC = agendaC;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public HashMap<String, Contacto> getAgendaN() {
		return agendaN;
	}

	public void setAgendaN(HashMap<String, Contacto> agendaN) {
		this.agendaN = agendaN;
	}

	public HashMap<String, Contacto> getAgendaC() {
		return agendaC;
	}

	public void setAgendaC(HashMap<String, Contacto> agendaC) {
		this.agendaC = agendaC;
	}

	@Override
	public String toString() {
		return "Agenda [key1=" + key1 + ", key2=" + key2 + ", agendaN=" + agendaN + ", agendaC=" + agendaC + "]";
	}
	
	
	//llenar 
	public void llenar1(HashMap algo) {
		setAgendaN(algo);
	}
	
	public void llenar2(HashMap algo) {
		setAgendaC(algo);
	}
	
	
	public void llenar3(String llave1, String llave2) {
		setKey1(llave1);
		setKey2(llave2);
		
	}
	
	// borrar
	public void borrar() {
		this.agendaN.remove(this.key1);
		this.agendaC.remove(this.key2);
	}
}
