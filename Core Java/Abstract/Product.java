package com.evergent.corejava.Abstract;


//Abstract is a keyword
//Abstract class contains abstract methods and concrete methods
//If any class having one abstract method that class need to be declared as abstract or it will throw compile time error.
//If any class extends abstract class that class should override all abstract methods otherwise the class will be showing compile time error.
//We cannot create object of abstract class, but we can create reference to it.
abstract public class Product {

	abstract public void newProduct();
	
	public void allProducts() {
		System.out.println("All products");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
