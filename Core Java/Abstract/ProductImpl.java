package com.evergent.corejava.Abstract;

public class ProductImpl extends Product{

	public void show() {
		System.out.println("Local method");
	}
	
	public void newProduct() {
		System.out.println("New product");
	}
	
	public static void main(String[] args) {
		ProductImpl p1 = new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProducts();
	}
}
