package com.evergent.corejava.ExceptionHandling;

public class StackOverFlowErrorExample16 {

	public static void recursiveMethod() {
		recursiveMethod();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			recursiveMethod();
		} catch (Exception e) {
			System.out.println("Stackoverflowerror caught  :"+e.getMessage());
		}
	}

}
