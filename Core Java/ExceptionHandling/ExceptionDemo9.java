package com.evergent.corejava.ExceptionHandling;

//User defined exception(Mechanism) where we print message inside constructor.

class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello : "+message);
	}
}

public class ExceptionDemo9 {
	int pno = 105;
	public void myData() throws ProductNotFoundException {
			if(pno > 100) {
				throw new ProductNotFoundException("This product is not there");
			}
			else
				System.out.println("Product is available");
	}
	

	
	public static void main(String[] args) {
		try {
			ExceptionDemo9 e1 = new ExceptionDemo9();			
			e1.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
