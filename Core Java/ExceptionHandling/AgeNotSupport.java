package com.evergent.corejava.ExceptionHandling;

//User defined exception - 1
class AgeNotSupportedException extends Exception{
	public AgeNotSupportedException(String message) {
		System.out.println("Hello : "+message);
	}
}

public class AgeNotSupport {
	int age = 19;
	public void myData() throws AgeNotSupportedException {
			if(age < 18) {
				throw new AgeNotSupportedException("Not eligible for voting");
			}
			else
				System.out.println("Eligible for voting");
	}
	

	
	public static void main(String[] args) {
		try {
			AgeNotSupport e1 = new AgeNotSupport();			
			e1.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
