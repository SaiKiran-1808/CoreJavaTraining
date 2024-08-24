package com.evergent.corejava.constructor;

//"this" is used to call the constructor in same class.
public class Employee5 {

	int eno;
	String ename;
	double salary;

	Employee5(){
		System.out.println("Default Constructor");
	}
	public Employee5(int eno, String ename, double salary) {
		this();
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
		
		Employee5 e1 = new Employee5(111,"Mani",55000d);
		e1.display();		
	}

}
