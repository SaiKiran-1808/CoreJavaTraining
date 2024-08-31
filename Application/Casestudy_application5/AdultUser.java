package com.evergent.corejava.saikiran.application5;

public class AdultUser implements LibraryUser {

	int age;
	String booktype;

	public void registerAccount(int age) throws AgeNotSupportedException {
		try {
			if (age > 12) {
				System.out.println("You have successfully registered under a Adult Account.");
			} else
				throw new AgeNotSupportedException("Sorry, Age must be greater than 12 to register as an adult.");
		} catch (AgeNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

	public void requestBook(String book) throws InvalidBookException{
		try {
			if (book.equals("Fiction"))
				System.out.println("Book Issued Successfully, please return the book within 7 days.");
			else
				throw new InvalidBookException("Oops, you are allowed to take only adult books.\n");
		} catch (InvalidBookException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

	}

}
