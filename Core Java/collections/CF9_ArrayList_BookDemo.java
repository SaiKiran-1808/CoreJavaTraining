package com.evergent.corejava.collections;

import java.util.ArrayList;

//This example is of we can store use defined objects inside collection with the help of generics.

class Book {
	String name;
	public Book(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java");
		Book b2 = new Book("Python");
		Book b3 = new Book("JS");
		Book b4 = new Book("Ruby");
		Book b5 = new Book("MYSQL");
		ArrayList al = new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		System.out.println(al);
	}
}
