package com.evergent.corejava.interface1;


//We cannot create object to interface but we can create reference to object
public class BookImpl2 implements Book{

	
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
	
	public static void main(String[] args) {
		Book b1 = new BookImpl2();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTitle();

	}

	

}
