package com.evergent.corejava.constructor;


//Here we used this keyword to initialize objects when we have same instance and local variables
public class Employee3 {

	int eno;
	String ename;
	double salary;

	Employee3(){
		System.out.println("Default Constructor");
	}
	
	public Employee3(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Eno : "+eno);
		System.out.println("Ename : "+ename);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 e1 = new Employee3(111,"Mani",55000d);
		e1.display();
		
		
	}

}
