package com.evergent.corejava.studentapplicationdao;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId=0;
		String name="";
		float marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID : ");
		studentId=sin.nextInt();
		System.out.println(("Enter Student Name : "));
		name = sin.next();
		System.out.println("Enter Student Marks : ");
		marks = sin.nextFloat();
		
		StudentService bookService = new StudentService();
		
		int updateCount=bookService.addStudentService(studentId,name,marks);
		
		

		System.out.println("Inserted :"+updateCount+" record Success");
		
		
		
		
	}

}
