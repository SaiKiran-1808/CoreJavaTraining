package com.evergent.corejava.beans;

import java.io.Serializable;

public class Student implements Serializable{

	private int sno;
	private String sname;
	private String address;
	
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
