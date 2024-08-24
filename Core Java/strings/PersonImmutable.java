package com.evergent.corejava.strings;


//Immutable example
public class PersonImmutable {

	String name;
	int age;
	
	
	public PersonImmutable(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public String myName() {
		return name;
	}
	
	public int myAge() {
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PersonImmutable p1 = new PersonImmutable("Mani", 30);
		System.out.println(p1.myName()+" "+p1.myAge());
		
		
	}

}
