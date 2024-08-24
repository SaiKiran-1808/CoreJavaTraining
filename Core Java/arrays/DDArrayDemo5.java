package com.evergent.corejava.arrays;

//2-D array 

public class DDArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr1[][] = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr1[i][j] = "JAVA";
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
