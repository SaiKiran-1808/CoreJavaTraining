package com.evergent.corejava.Abstract;

//Abstract class constructor can be created but will be called when we call sub class constructor
public class ProductImpl3 extends Product3{	
	
	public ProductImpl3() {
		System.out.println("Sub class constructor");
	}
	
	public void newProduct() {
		System.out.println("New Product");
	}
	
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Product prod = new Product();
		ProductImpl3 pr = new ProductImpl3();
		
		pr.show();
		pr.newProduct();
	}


}
