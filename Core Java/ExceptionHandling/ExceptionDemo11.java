package com.evergent.corejava.ExceptionHandling;

//User defined exception where we use super keyword inside constructor

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class ExceptionDemo11 {
	int balance = 1000;
	public void myData(int amount) throws InsufficientFundsException {
			if(amount > balance) {
				throw new InsufficientFundsException("Insufficient funds in the account");
			}
			else
				System.out.println("Limit is available");
	}
	
	
	public static void main(String[] args) {
		try {
			ExceptionDemo11 e1 = new ExceptionDemo11();			
			e1.myData(2000);
		}
		catch(InsufficientFundsException e) {
			System.out.println("Caught Exception : "+ e.getMessage());
		}
	}
}
