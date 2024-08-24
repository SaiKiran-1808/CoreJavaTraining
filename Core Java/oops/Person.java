package com.evergent.corejava.oops;


//Initialization of objects during object creation
public class Person {

	
	int age = 23;
	String name = "Sai Kiran";
	String address = "Hyderabad";
	
	public void display() {
		System.out.println("Name : "+name+"\nAge  : "+age+" "+"\nAddress : "+address);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.display();
	}


}
