package com.evergent.corejava.objectclassmethods;

public class Person1 {
	
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name : "+ name+"Age : "+age;
		
	}
	
	
	public static void main(String[] args) {
		Person1 p1 = new Person1("Kiran", 20);
		System.out.println(p1);

	}
}
