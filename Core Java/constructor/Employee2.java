package com.evergent.corejava.constructor;


//We can access constructor while creation of object and it is used to initialize the objects, without this keyword.
public class Employee2 {

	int eno;
	String ename;
	double salary;

	Employee2(){
		System.out.println("Default Constructor");
	}
	
	public Employee2(int eno1, String ename1, double salary1) {
		eno = eno1;
		ename = ename1;
		salary = salary1;
	}
	
	public void display() {
		System.out.println("Eno : "+eno);
		System.out.println("Ename : "+ename);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee2();
		Employee2 e1 = new Employee2(111,"Mani",55000d);
		e1.display();
		
		
	}

}
