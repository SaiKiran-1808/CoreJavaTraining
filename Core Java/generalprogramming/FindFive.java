package com.evergent.corejava.generalprogramming;

public class FindFive {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40, e = 50;
		if(a > b && a > c && a > d && a > e) 
			System.out.println("A is greater");
		else if(b > a && b > c && b > d && b > e) 
			System.out.println("B is greater");
		else if(c > a && c > b && c > d && c > e)
			System.out.println("C is greater");
		else if(d > a && d > b && d > c && d > e)
			System.out.println("D is greater");
		else
			System.out.println("E is greater");
		
		
	}

}
