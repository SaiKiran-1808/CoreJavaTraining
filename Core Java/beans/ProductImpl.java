package com.evergent.corejava.beans;

public class ProductImpl {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product(100,"Kiran",80000);
		System.out.println(p.getEpno());		
		System.out.println(p.getPname());
		System.out.println(p.getPrice());
		
	}

}
