package com.evergent.corejava.saikiran.application5;

public class KidUser implements LibraryUser {

	int age;
	String booktype;

	@Override
	public void registerAccount(int age) throws AgeNotSupportedException{
		try {
			if (age <= 12) {
				System.out.println("You have successfully registered under a Kids Account.");
			} else
				throw new AgeNotSupportedException("Sorry, Age must be less than 12 to register as a kid.");
		} catch (AgeNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void requestBook(String book) throws InvalidBookException{
		try {
			if (book.equals("Kids"))
				System.out.println("Book Issued Successfully, please return the book within 10 days.\n");
			else
				throw new InvalidBookException("Oops, you are allowed to take only kids books.\n");
		} catch (InvalidBookException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

	}

}
