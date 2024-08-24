package com.evergent.corejava.saikiran.application4;

import java.util.Scanner;

public class BankingImpl  {
	
	static String validateemail = null;
	static String validatepassword = null;
	static boolean condition = true;
	static String display = null;
	static String input = null;
	
	Scanner in = new Scanner(System.in);
	
	
	//----------------------------------------- LOCAL METHOD----------------------------------------
	public void yes() {
		//----------------------------------------- HAS - A RELATIONSHIP ----------------------------------------
		TransactionImpl impl = new TransactionImpl();
		
		if (validateemail != null) {
			display = "***LOGIN***";
		} else
			display = "***LOGOUT***";
		while (condition) {
			System.out.println(
					"Select module code : Deposit(D) | Withdraw(W) | Balance(B) | Login Main Menu(LM) | LogOut(L) \t\t\t"
							+ display);
			input = in.nextLine();
			if (input.equals("D"))
				impl.deposit();
			else if (input.equals("W"))
				impl.withdraw();
			else if (input.equals("B"))
				impl.balance();
			else if (input.equals("LM")) {
				impl.loginMainMenu();
			} else if (input.equals("L")) {
				impl.logout();
			} else
				System.out.println("!!!!!!!!!   Please enter valid code   !!!!!!!!!!!!!");
		}
	}

	public void no() {
		condition = false;
		validateemail = null;
		validatepassword = null;
		System.out.println("Login Failed");
	}	
	
	// ------------------------------------ CONSTRUCTOR ---------------------------------------
	public BankingImpl() {
		System.out.println("Application Started");
	}

	public static void main(String[] args) {

		System.out.println("Would you like to start application? Yes(Y) | No(N) ");
		Scanner in = new Scanner(System.in);

		input = in.nextLine();

		switch (input) {
		case "Y":
			// ------------------------------------ HAS - A RELATIONSHIP ---------------------------------------
			
			System.out.println("\t\t\t\t ---------- WELCOME TO BANKING MANAGEMENT SYSTEM ----------");

			while (true) {
				condition = true;

				System.out.println("\nHome");
				System.out.println("=====================================");
				System.out.println("R - Register");
				System.out.println("L - Login");
				System.out.println("A - Additional Services");
				System.out.println("E - Exit");
				System.out.println("=====================================");

				if (validateemail != null) {
					display = "***LOGIN***";
				} else
					display = "***LOGOUT***";

				System.out.println(
						"Select module code : Register(R) | Login(L) | Additional Services(A) | Exit(E) \t\t\t\t\t"
								+ display);

				input = in.nextLine();
				HomeImpl homeImpl = new HomeImpl();		
				if (input.equals("R"))
					homeImpl.register();
				else if (input.equals("L"))
					homeImpl.login();
				else if (input.equals("A"))
					homeImpl.additionalServices("A");
				else if (input.equals("E"))
					homeImpl.exit();
				else
					System.out.println("!!!!!!!!!   Please enter valid code   !!!!!!!!!!!!!");
			}
		case "N":
			System.out.println("\t\t\t\t\t\t**********APPLICATION ENDED************");
			System.exit(0);
			break;
		}
		//----------------------------------------- HAS - A RELATIONSHIP----------------------------------------
		AdditionalServicesImpl additionalServices = new AdditionalServicesImpl();
		additionalServices.loan();
		additionalServices.creditCard();
		additionalServices.insurance();
		additionalServices.transactionMainMenu();
		additionalServices.resetPassword();
		}
}
