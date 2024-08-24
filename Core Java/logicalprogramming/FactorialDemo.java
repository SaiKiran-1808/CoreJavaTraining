package com.evergent.corejava.logicalprogramming;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5,fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println(fact);

	}

}
