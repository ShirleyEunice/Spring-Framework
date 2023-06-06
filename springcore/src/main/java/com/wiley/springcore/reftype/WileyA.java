package com.wiley.springcore.reftype;

public class WileyA {
	private int counta;
	private WileyB ob;
	public int getCountA() {
		return counta;
	}
	public void setCountA(int countA) {
		this.counta = countA;
	}
	public WileyB getOb() {
		return ob;
	}
	public void setOb(WileyB ob) {
		this.ob = ob;
	}
	public WileyA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WileyA [countA=" + counta + ", ob=" + ob + "]";
	}
	

}
