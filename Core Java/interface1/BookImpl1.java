package com.evergent.corejava.interface1;

//Interface is keyword
//We can declare method signature only but not implementation
//By default all interface methods are abstract
//If any class implements interface then class should be override all interface methods otherwise the class will be showing compile time error.
//We can declare variables inside interface by default they are public static final.
public class BookImpl1 implements Book {	
	
	public void bookTitle() {
		System.out.println("Core Java"+cname);	
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
	public static void main(String[] args) {
		BookImpl1 b1 = new BookImpl1();
		b1.bookTitle();
		b1.bookPrice();
		b1.bookTitle();
		b1.show();
	}
}
