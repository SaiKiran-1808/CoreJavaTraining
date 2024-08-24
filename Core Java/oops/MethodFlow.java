package com.evergent.corejava.oops;


//Different type of user defined methods
public class MethodFlow {

	//No parameter with out return type
	public void show() {
		System.out.println("No parameter with out return type");
	}
	
	//No parameter with return type
	public int myChange() {
		return 100;
	}
	
	//Parameter with out return type
	public void myData(int a, int b) {
		System.out.println("Parameter with out return type : "+a*b);
	}
	
	//Parameter with return type
	public int myMul(int a, int b) {
		return a*b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf = new MethodFlow();
		mf.show();
		System.out.println("No parameter with return type : "+mf.myChange());
		mf.myData(10, 20);
		System.out.println("Parameter with return type : "+mf.myMul(5, 2));

	}

}
