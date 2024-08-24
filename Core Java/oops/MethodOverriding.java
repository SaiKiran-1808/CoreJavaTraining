package com.evergent.corejava.oops;

class MyBigData {
	public void myData() {
		System.out.println("MyBigData :  Class");
	}
}

public class MethodOverriding extends MyBigData{

	public void myData() {
//		super.myData();
		System.out.println("MyData");
		
	}
	
	public void show() {
		System.out.println("Local Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding mo = new MethodOverriding();
		mo.show();
		mo.myData();
	
	}

}
