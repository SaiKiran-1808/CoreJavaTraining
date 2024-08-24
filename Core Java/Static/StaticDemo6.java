package com.evergent.corejava.Static;


//This is an example of static related variables are initialized only once
public class StaticDemo6 {

	static String name = "Raju";
	int age = 20;
	String address = "Hyderabad";

	public void display() {
		name = "Mani";
		System.out.println("Name : "+name+" "+"Age : "+age+" "+"Address : "+address);
	}
		
	public static void main(String[] args) {
		StaticDemo6 s1 = new StaticDemo6();
		System.out.println(s1.name);
		s1.display();
		StaticDemo6 s2 = new StaticDemo6();
		System.out.println(s2.name);	
	}
}
