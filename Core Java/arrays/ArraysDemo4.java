package com.evergent.corejava.arrays;


//Array creation using for loop and printing for loop using length method
public class ArraysDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[5];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = i+1;
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}		
	}
}
