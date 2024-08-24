package com.evergent.corejava.saikiran.application4;

import java.util.Scanner;

//----------------------------------------- IS - A RELATIONSHIP ----------------------------------------
public class HomeImpl extends Home {

	Scanner in = new Scanner(System.in);
	
	static String firstname = null;
	static String lastname = null;
	static String email = null;
	static String password = null;

	static String validateemail = null;
	static String validatepassword = null;

	static String display = null;

	static String input = null;
	
	
	public void register() {

		System.out.println("Welcome to registration");

		System.out.println("Enter First name : ");
		firstname = in.nextLine();

		System.out.println("Enter Last name : ");
		lastname = in.nextLine();

		System.out.println("Enter Email : ");
		email = in.nextLine();

		System.out.println("Enter Password : ");
		password = in.nextLine();

		System.out.println("- - - - - - - - - - - - - - - - ");
		System.out.println("REGISTRATION SUCCESSFULL");
		System.out.println("- - - - - - - - - - - - - - - - ");

	}

	public void login() {
		System.out.println("Welcome to Login");

		System.out.println("Enter email : ");
		validateemail = in.nextLine();
		System.out.println("Enter password : ");
		validatepassword = in.nextLine();

		System.out.println("Do you want to proceed with login? Y / N");

		input = in.nextLine();

		// --------------------------------------- HAS - A ---------------------------------------
		System.out.println("Login Successfull\n");
		Login login = new Login();

		if (input.equals("Y")) {
			if (login.yes(validateemail, validatepassword, email, password)) {
				new BankingImpl().yes();
			}
				
			else
				System.out.println("Login Failed");
		} else
			System.out.println("Login Failed");
	}

	public void additionalServices(String additional_services) {
		System.out.println("Additional Services");
		if (validateemail != null) {
			display = "***LOGIN***";
		} else
			display = "***LOGOUT***";

		if (additional_services.equals("LA")) {
			System.out.println(
					"Select module code : Loan(L) | Credit Cards(C) | Insurance(I) | Transaction Main Menu(TM) | LogOut(LL) \t\t"
							+ display);
		} else {
			System.out.println(
					"Select module code : Loan(L) | Credit Cards(C) | Insurance(I) | Home(H) \t\t\t\t\t" + display);
		}

		input = in.nextLine();

		AdditionalServicesImpl additionalServicesImpl = new AdditionalServicesImpl();
		TransactionImpl impl = new TransactionImpl();
		
		
		if (input.equals("L")) {
			additionalServicesImpl.loan();
		} else if (input.equals("C")) {
			additionalServicesImpl.creditCard();
		} else if (input.equals("I")) {
			additionalServicesImpl.insurance();
		} else if (input.equals("TM")) {
			additionalServicesImpl.transactionMainMenu();
		} else if (input.equals("LL")) {
			impl.logout();
		} else
			System.out.println("!!!!!!!!!   Please enter valid code   !!!!!!!!!!!!!");
	}

	public void exit() {
		System.out.println("\t\t\t\t\t\t**********APPLICATION ENDED************");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
