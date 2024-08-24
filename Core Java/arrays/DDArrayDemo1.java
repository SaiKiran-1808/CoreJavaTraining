package com.evergent.corejava.arrays;

//Basic 2-D array creation
public class DDArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr1[i][j] = 7;
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
