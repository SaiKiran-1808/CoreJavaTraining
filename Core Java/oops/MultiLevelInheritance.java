package com.evergent.corejava.oops;

class MyPerson {
	public void personInfo() {
		System.out.println("Rajesh");
	}
}

class PersonDetails extends MyPerson {
	public void personData() {
		System.out.println("Hyderabad");
	}
}

public class MultiLevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("Local Method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance i1 = new MultiLevelInheritance();
		i1.personInfo();
		i1.personData();
		i1.show();
	}

}
