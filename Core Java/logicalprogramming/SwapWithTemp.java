package com.evergent.corejava.logicalprogramming;

public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		int temp;
		System.out.println("Before Swapping : "+a+" "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : "+a+" "+b);

	}

}
