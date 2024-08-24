package com.evergent.corejava.ExceptionHandling;

//User defined exception where class extends RuntimeException(Unchecked exceptions)

class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}

public class ExceptionDemo12 {
	public void myData(int score) throws InvalidScoreException {
			if(score < 0 || score > 100) {
				throw new InvalidScoreException("Invalid score");
			}
			else
				System.out.println("Score is valid");
	}
	
	
	public static void main(String[] args) {
		try {
			ExceptionDemo12 e1 = new ExceptionDemo12();			
			e1.myData(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("Caught Exception : "+ e.getMessage());
		}
	}
}
