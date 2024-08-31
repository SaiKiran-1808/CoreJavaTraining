package com.evergent.corejava.beans;


//Setting and getting values using public methods of bean class
public class EmployeeImpl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEno(100);
		e1.setEname("Ram");
		e1.setSal(55000);
		
		System.out.println(e1.getEno());
		System.out.println(e1.getEname());
		System.out.println(e1.getSal());
	}

}
