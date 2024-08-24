package com.evergent.corejava.logicalprogramming;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		System.out.println("Before Swapping : "+a+" "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping : "+a+" "+b);

	}

}
