package com.evergent.corejava.logicalprogramming;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c = 0, n = 10;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}

}
