package com.evergent.corejava.constructor;


//This is example of overriding using inheritance
class Animal {
	
	private String name;
	private int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age; 
	}
	
	public void displayInfo() {
		System.out.println("Name : "+name+" "+"Age : "+age);
	}
}

class Dog extends Animal{
	private String breed;
	
	Dog(String name, int age,String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed : "+breed);
	}
	
}

public class Inheritance_Overriding8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Buddy", 5, "German Shepard");
		dog.displayInfo();
	}

}
