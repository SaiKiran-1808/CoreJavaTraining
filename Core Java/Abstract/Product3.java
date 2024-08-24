package com.evergent.corejava.Abstract;


//Abstract class constructor can be created but will be called when we call sub class constructor
abstract public class Product3 {

	public Product3() {
		System.out.println("Product3 constructor");
	}
	
	abstract public void newProduct();
	
	public void allProducts() {
		System.out.println("All products");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
