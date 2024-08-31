package com.evergent.corejava.beans;

import java.io.Serializable;

//This is bean creation, initialization is happening through setters and retrieval through getter methods
public class Employee implements Serializable{

	private int eno;
	private String ename;
	private double sal;
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
