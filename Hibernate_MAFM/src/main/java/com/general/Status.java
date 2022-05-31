package com.general;

public class Status {
	Object oB;
	String mensaje, respuesta;
	
	public Status (){
		
	}

	public Status(Object oB, String mensaje, String respuesta) {
		super();
		this.oB = oB;
		this.mensaje = mensaje;
		this.respuesta = respuesta;
	}

	public Object getoB() {
		return oB;
	}

	public void setoB(Object oB) {
		this.oB = oB;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Status [oB=" + oB + ", mensaje=" + mensaje + ", respuesta=" + respuesta + "]";
	}
	
	
}
