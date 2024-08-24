package com.evergent.corejava.interface1;


//Java will support multiple interfaces through interfaces
//One class can implement interfaces
//One interface can extend other interfaces
public class BookImpl3 implements Book, NewBook {

	public void bookTitle() {
		System.out.println("Core Java");	
	}
	public void bookAuthor() {
		System.out.println("Oracle Corp");
	}
	public void bookPrice() {
		System.out.println("550");
	}
	public void show() {
		System.out.println("Local Method");
	}
	public void myData() {
		System.out.println("My data interface");	
	}
	public void addNewBook() {
		System.out.println("Java new version");	
	}
	
	public static void main(String[] args) {
		Book b1 = new BookImpl3();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTitle();

	}


	

}
