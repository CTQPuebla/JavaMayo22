package com.general;

public class Estatus {
	Object ob;
	String mensaje, respuesta;

	public Estatus() {
	}

	public Estatus(Object ob, String mensaje, String respuesta) {
		this.ob = ob;
		this.mensaje = mensaje;
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Status [ob=" + ob + ", mensaje=" + mensaje + ", respuesta=" + respuesta + "]\n";
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
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
}
