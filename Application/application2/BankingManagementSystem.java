package com.evergent.corejava.saikiran.application2;

import java.util.Scanner;

public class BankingManagementSystem {

	// R - Register | L - Login | A - Additional Services | E - Exit
	enum home {
		R, L, A, E;
	}

	// Y - Yes | N - NO | A - Additional Services | L - Logout
	enum login {
		Y, N, A, L, RP;
	}

	//D - Deposit | W - Withdraw | B - Balance | LM - Login Main Menu| L - Logout
	enum transaction {
		D, W, B, LM, L;
	}

	//L - Loan | C - Credit Card | I - Insurance | M - Home | TM - Transaction Main Menu | LL - Logout
	enum additionalservices {
		L, C, I, M, TM, LL;
	}

	//A - Age 31-40 | B - Age 41-50 | C - Age 51-60
	enum insurance {
		A, B, C;
	}
	
	static String firstname = null;
	static String lastname = null;
	static String email = null;
	static String password = null;

	static String validateemail = null;
	static String validatepassword = null;

	static String oldpassword = null;

	static long deposit = 0;
	static long withdraw = 0;
	static long total = 0;

	static long mobile = 0;

	static int min = 100000;
	static int max = 10000000;

	static boolean condition = true;
	static String display = null;

	public static void main(String[] args) {
		String input = null;
		Scanner in = new Scanner(System.in);

		System.out.println("\t\t\t\t\t ---------- WELCOME TO BANKING MANAGEMENT SYSTEM ----------");
		while (true) {
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

			System.out
					.println("Select module code : Register(R) | Login(L) | Additional Services(A) | Exit(E) \t\t\t\t\t"
							+ display);

			input = in.nextLine();

			switch (home.valueOf(input)) {
			case R:
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

				break;

			case L:

				System.out.println("Welcome to Login");

				
				
				System.out.println("Enter email : ");
				validateemail = in.nextLine();
				System.out.println("Enter password : ");
				validatepassword = in.nextLine();

				System.out.println("Do you want to proceed with login? Y / N");

				input = in.nextLine();
				switch (login.valueOf(input)) {
				case Y:
					if (validateemail.equals(email) && validatepassword.equals(password)) {
						System.out.println("- - - - - - - - - - - - - - - - ");
						System.out.println("LOGIN SUCCESSFULL");
						System.out.println("- - - - - - - - - - - - - - - - ");

						System.out.println("User Name : " + firstname + " " + lastname);
						System.out.println("User Email : " + email);

						while (condition) {

							if (validateemail != null) {
								display = "***LOGIN***";
							} else
								display = "***LOGOUT***";
							System.out.println(
									"Select module code : Deposit(D) | Withdraw(W) | Balance(B) | Login Main Menu(LM) | LogOut(L) \t\t\t"
											+ display);

							input = in.nextLine();
							switch (transaction.valueOf(input)) {

							case D:
								System.out.println("Enter amount to deposit : ");
								deposit = in.nextLong();
								in.nextLine();
								total += deposit;

								
								System.out.println("Amount Deposited : " + deposit);

								break;

							case W:
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
								break;

							case B:
								System.out.println("Balance Amount : " + total);
								break;

								
							case LM:
								System.out.println("=====================================");
								System.out.println("A - Additional Services");
								System.out.println("RP - Reset Password");
								System.out.println("L - LogOut");
								System.out.println("=====================================");

								System.out.println(
										"Select module code : Additional Services(A) | LogOut(L) \t\t\t\t\t\t\t"
												+ display);

								input = in.nextLine();
								switch (login.valueOf(input)) {
								case A:
									System.out.println("Additional Services");
									if (validateemail != null) {
										display = "***LOGIN***";
									} else
										display = "***LOGOUT***";
									System.out.println(
											"Select module code : Loan(L) | Credit Cards(C) | Insurance(I) | Transaction Main Menu(TM) | LogOut(LL) \t\t"
													+ display);
									input = in.nextLine();

									switch (additionalservices.valueOf(input)) {
									case L:
										System.out.println("Enter mobile number : ");
										mobile = in.nextLong();
										in.nextLine();
										System.out.println("Your Load applicaiton number is : "
												+ (long) (Math.random() * (max - min + 1)));
										break;

									case C:
										System.out.println("Enter mobile number : ");
										mobile = in.nextLong();
										in.nextLine();
										System.out.println("Your Credit Card applicaiton number is : "
												+ (long) (Math.random() * (max - min + 1)));
										break;

									case I:
										System.out.println("Enter mobile number : ");
										
										
										mobile = in.nextLong();
										in.nextLine();
										
										System.out.println("Enter age limit : ");
										System.out.println("A. Between 31-40  : ");
										System.out.println("B. Between 41-50  : ");
										System.out.println("C. Between 51-60  : ");
										input = in.nextLine(); 
										switch(insurance.valueOf(input)) {
											
										case A: {
											System.out.println("\nThe insured amount is : 800000");
											break;
										}
										case B: {
											System.out.println("\nThe insured amount is : 600000");
											break;
										}
										case C: {
											System.out.println("\nThe insured amount is : 300000");
											break;
										}
									}
										
										System.out.println(
												"Your Insurance applicaiton number is : " + (long) (Math.random() * (max - min + 1))+"II");					
										break;
									case LL:
										condition = false;
										validateemail = null;
										validatepassword = null;
										System.out.println("Logout successfull");
										break;
									}
									break;

								case RP:
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
									break;

								case L:
									condition = false;
									validateemail = null;
									validatepassword = null;
									System.out.println("Logout successfull");
									break;

								}
								break;

							case L:
								condition = false;
								validateemail = null;
								validatepassword = null;
								System.out.println("Logout successfull");
								break;
							}
						}
					} else {
						System.out.println("Login Failed");
						break;
					}
					condition = true;
					break;
				case N:
					System.out.println("Login Failed");
					break;
				}
				break;

				
			case A:
				System.out.println("Additional Services");
				if (validateemail != null) {
					display = "***LOGIN***";
				} else
					display = "***LOGOUT***";
				System.out.println("Select module code : Loan(L) | Credit Cards(C) | Insurance(I) | Home(M)");
				input = in.nextLine();
				switch (additionalservices.valueOf(input)) {
				case L:
					System.out.println("Enter mobile number : ");
					mobile = in.nextLong();
					in.nextLine();
//					System.out.println("Your loan sanctioned successfully");
					System.out.println("Your Loan application number is : " + (long) (Math.random() * (max - min + 1))+"LL");
					break;

				case C:
					System.out.println("Enter mobile number : ");
					mobile = in.nextLong();
					in.nextLine();
					System.out.println(
							"Your Credit Card applicaiton number is : " + (long) (Math.random() * (max - min + 1))+"CC");
					break;

				case I:
					System.out.println("Enter mobile number : ");
					
					
					mobile = in.nextLong();
					in.nextLine();
					
					System.out.println("Enter age limit : ");
					System.out.println("A. Between 31-40  : ");
					System.out.println("B. Between 41-50  : ");
					System.out.println("C. Between 51-60  : ");
					input = in.nextLine(); 
					switch(insurance.valueOf(input)) {
						
					case A: {
						System.out.println("\nThe insured amount is : 800000");
						break;
					}
					case B: {
						System.out.println("\nThe insured amount is : 600000");
						break;
					}
					case C: {
						System.out.println("\nThe insured amount is : 300000");
						break;
					}
				}
					
					System.out.println(
							"Your Insurance applicaiton number is : " + (long) (Math.random() * (max - min + 1))+"II");					
					break;
				}
				break;
			case E:
				System.out.println("\t\t\t\t\t\t**********APPLICATION ENDED************");
				System.exit(0);
				break;

			default:
				System.out.println("Please select valid module");
				break;
			}
			
		}
		
	}
}


