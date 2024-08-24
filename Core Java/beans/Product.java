package com.evergent.corejava.beans;

public class Product {

	private int epno;
	private String pname;
	private double price;
	
	public Product(int epno, String pname, double price) {
		this.epno = epno;
		this.pname = pname;
		this.price = price;
	}
	

	public int getEpno() {
		return epno;
	}


	public String getPname() {
		return pname;
	}


	public double getPrice() {
		return price;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
