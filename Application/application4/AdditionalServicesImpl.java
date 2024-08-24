package com.evergent.corejava.saikiran.application4;

import java.util.Scanner;

//----------------------------------------- IS - A RELATIONSHIP ----------------------------------------
public class AdditionalServicesImpl implements AdditionalServices {

	static long mobile = 0;
	static String input = null;
	static long insuranceAmount = 0;
	static String oldpassword = null;
	static String password = null;
	static int min = 100000;
	static int max = 10000000;
	
	Scanner in = new Scanner(System.in);
	
	public void loan() {
		System.out.println("Enter mobile number : ");
		mobile = in.nextLong();
		in.nextLine();
		System.out.println("Your Loan applicaiton number is : " + (long) (Math.random() * (max - min + 1)) + "LL");
	}

	public void creditCard() {
		System.out.println("Enter mobile number : ");
		mobile = in.nextLong();
		in.nextLine();
		System.out
				.println("Your Credit Card applicaiton number is : " + (long) (Math.random() * (max - min + 1)) + "CC");
	}

	public void insurance() {
		System.out.println("Enter mobile number : ");

		mobile = in.nextLong();
		in.nextLine();

		System.out.println("Select insurance amount : ");
		System.out.println("A. 500000 ");
		System.out.println("B. 1000000 ");
		input = in.nextLine();
		if (input.equals("A")) {
			insuranceAmount = 500000L;
		} else if (input.equals("B")) {
			insuranceAmount = 1000000L;
		}

		System.out.println("Enter age limit : ");
		System.out.println("A. Between 31-40  : ");
		System.out.println("B. Between 41-50  : ");
		System.out.println("C. Between 51-60  : ");
		input = in.nextLine();

		if (input.equals("A")) {
			System.out.println("Your insured amount : " + insuranceAmount);
			System.out.println("Your premium per month is : " + insuranceAmount / 12);

			System.out.println(
					"Your Insurance applicaiton number is : " + (long) (Math.random() * (max - min + 1)) + "II");
		} else if (input.equals("B")) {
			System.out.println("Your insured amount : " + insuranceAmount);
			System.out.println("Your premium per month is : " + insuranceAmount / 10);
			System.out.println(
					"Your Insurance applicaiton number is : " + (long) (Math.random() * (max - min + 1)) + "II");
		} else if (input.equals("C")) {
			System.out.println("Your insured amount : " + insuranceAmount);
			System.out.println("Your premium per month is : " + insuranceAmount / 9);
			System.out.println(
					"Your Insurance applicaiton number is : " + (long) (Math.random() * (max - min + 1)) + "II");
		} else
			System.out.println("!!!!!!!!!   Please enter valid code   !!!!!!!!!!!!!");
	}

	public void transactionMainMenu() {		
		new BankingImpl().yes();
	}

	public void resetPassword() {
		System.out.println("Password Reset");
		System.out.println("Enter your old password : ");
		oldpassword = in.nextLine();
		if (oldpassword.equals(password)) {
			System.out.println("Enter new password : ");
			password = in.nextLine();
			System.out.println("Passsword changed successfully");
		} else {
			System.out.println("Password's do not match");
			System.out.println("Reset Failed");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
