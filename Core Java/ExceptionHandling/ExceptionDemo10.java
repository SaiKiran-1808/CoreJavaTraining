package com.evergent.corejava.ExceptionHandling;

//User defined exception where we use super keyword inside constructor

class ProductNotFoundExceptions extends Exception{
	public ProductNotFoundExceptions(String message) {
		super(message);
	}
}

public class ExceptionDemo10 {
	int pno = 105;
	public void myData() throws ProductNotFoundExceptions {
			if(pno > 100) {
				throw new ProductNotFoundExceptions("This product is not there");
			}
			else
				System.out.println("Product is available");
	}
	

	
	public static void main(String[] args) {
		try {
			ExceptionDemo10 e1 = new ExceptionDemo10();			
			e1.myData();
		}
		catch(ProductNotFoundExceptions e) {
			System.out.println("Caught Exception : "+ e.getMessage());
		}
	}
}
