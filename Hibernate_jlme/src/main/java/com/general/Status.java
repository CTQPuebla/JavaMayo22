package com.general;

public class Status {
	Object o;
	String res, men;
	
	public Status() {
		
	}
	
	public Status(Object o, String res, String men) {
		this.o = o;
		this.res = res;
		this.men = men;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getMen() {
		return men;
	}

	public void setMen(String men) {
		this.men = men;
	}

	@Override
	public String toString() {
		return "Status [o=" + o + ", res=" + res + ", men=" + men + "]";
	}
}
