package com.evergent.corejava.constructor;

//We can also initialize object in default constructor
class Car{
	
	String color;
	int maxspeed;
	
	Car(){
		color = "White";
		maxspeed = 120;
	}
	
	Car(String color, int maxspeed){
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	public void display() {
		System.out.println("Color : "+color+" MaxSpeed : "+maxspeed);
	}
	
}

public class MyCars7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car("Red",150);
		
		c1.display();
		c2.display();
		

	}

}
