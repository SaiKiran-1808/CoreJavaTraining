package com.evergent.corejava.saikiran.application5;

public class LibraryInterfaceDemo {

	static String name;
	static int age;
	static String booktype;
	static String usertype;

	static String validatename;
	static int validateage;
	static String validateusertype;

	static String input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\t\t\t\t\t---------------- WELCOME TO LIBRARY ----------------------------");

		try {
			KidUser kid1 = new KidUser();
			kid1.registerAccount(10);
			kid1.requestBook("Kids");
		} catch (AgeNotSupportedException | InvalidBookException e) {
			System.out.println(e.getMessage());
		}

		try {
			KidUser kid2 = new KidUser();
			kid2.registerAccount(18);
			kid2.requestBook("Fiction");
		} catch (AgeNotSupportedException | InvalidBookException e) {
			System.out.println(e.getMessage());
		}

		try {
			AdultUser adult1 = new AdultUser();
			adult1.registerAccount(5);
			adult1.requestBook("Kids");
		} catch (AgeNotSupportedException | InvalidBookException e) {
			System.out.println(e.getMessage());
		}

		try {
			AdultUser adult2 = new AdultUser();
			adult2.registerAccount(23);
			adult2.requestBook("Fiction");
		} catch (AgeNotSupportedException | InvalidBookException e) {
			System.out.println(e.getMessage());
		}

	}

}
