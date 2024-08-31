package com.evergent.corejava.beans;

//Setting and getting values using public methods of bean class
public class StudentImpl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setSno(100);
		s1.setSname("Mike");
		s1.setAddress("Bangalore");
		
		System.out.println(s1);
		
		
	}

}
