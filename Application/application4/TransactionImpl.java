package com.evergent.corejava.saikiran.application4;

import java.util.Scanner;

//----------------------------------------- IS - A RELATIONSHIP ----------------------------------------
public class TransactionImpl implements Transaction{

	Scanner in = new Scanner(System.in);
	
	static long deposit = 0;
	static long withdraw = 0;
	static long total = 0;
	
	static String validateemail = null;
	static String validatepassword = null;
	
	static boolean condition = true;
	
	static String input = null;
	
	static String display = null;
	
	public void deposit() {
		System.out.println("Enter amount to deposit : ");
		deposit = in.nextLong();
		in.nextLine();
		total += deposit;

		System.out.println("Amount Deposited : " + deposit);
	}

	public void withdraw() {
		System.out.println("Enter amount to withdraw : ");
		withdraw = in.nextLong();
		in.nextLine();

		if (withdraw > total) {
			System.out.println("\nInsufficient Balance");
		} else {
			System.out.println("\nAmount withdrawn : " + withdraw);
			System.out.println("Withdraw Successfull");
			total -= withdraw;
		}
	}

	public void balance() {
		System.out.println("Balance Amount : " + total);
	}

	public void loginMainMenu() {
		System.out.println("=====================================");
		System.out.println("A - Additional Services");
		System.out.println("RP - Reset Password");
		System.out.println("L - LogOut");
		System.out.println("=====================================");

		System.out.println("Select module code : Additional Services(A) | LogOut(L) \t\t\t\t\t\t\t" + display);

		AdditionalServicesImpl additionalServicesImpl = new AdditionalServicesImpl();
		HomeImpl homeImpl = new HomeImpl();
		
		input = in.nextLine();
		if (input.equals("A")) {
			homeImpl.additionalServices("LA");
		} else if (input.equals("RP")) {
			additionalServicesImpl.resetPassword();
		} else if (input.equals("L")) {
			logout();
		} else
			System.out.println("!!!!!!!!!   Please enter valid code   !!!!!!!!!!!!!");

	}

	public void logout() {
		condition = false;
		validateemail = null;
		validatepassword = null;
		System.out.println("Logout successfull");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
