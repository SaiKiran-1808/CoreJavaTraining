package com.evergent.corejava.constructor;

//Super is a key word which calls super class constructor.
class MyEmployee {
	
	public MyEmployee() {
		System.out.println("Super class default constructor");
	}
		
	public MyEmployee(int eno) {
		System.out.println("Employee of super class : "+eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;
	String ename;
	double salary;

	Employee6(){
		System.out.println("Default Constructor");
	}
	public Employee6(int eno, String ename, double salary) {
		super(eno);
		this.ename = ename;
		this.salary = salary;
	}
	public void display() {
		System.out.println("Ename : "+ename);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		Employee6 e1 = new Employee6(111,"Mani",55000d);
		e1.display();			
	}

}
