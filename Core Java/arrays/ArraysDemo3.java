package com.evergent.corejava.arrays;

//Array creation using for loop and printing for loop using explicit length value
public class ArraysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[5];
		
		for(int i=0;i<5;i++) {
			ar[i] = i+1;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}		
	}
}
