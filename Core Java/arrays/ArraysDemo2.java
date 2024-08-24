package com.evergent.corejava.arrays;


//Basic array creation program and printing using for loop
public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[5];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		System.out.print(ar[0]+" ");
		System.out.print(ar[1]+" ");
		System.out.print(ar[2]+" ");
		System.out.print(ar[3]+" ");
		System.out.print(ar[4]+" ");
		
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}		
	}
}
