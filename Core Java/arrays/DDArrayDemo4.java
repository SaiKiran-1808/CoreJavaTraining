package com.evergent.corejava.arrays;

//2-D array 
public class DDArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][] = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i == 0 || j == 0 || i == 4 || j == 4)
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
