package com.evergent.corejava.collection.task3;

import java.util.Scanner;

public class Product_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductInterface book = new ProductImp();
		for (;;) {
			System.out.println("1. Add Product 2.Search by id 3.displayAll 4. exit");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("Enter the id");
				String isbn = sc.next();
				System.out.println("Enter the product name");
				String name = sc.next();
				System.out.println("Enter the price");
				int price = sc.nextInt();
				Product b = new Product();
				b.setId(isbn);
				b.setProductName(name);
				b.setPrice(price);
				String message = book.addProduct(b);
				System.out.println(message);
				break;
			case 2:
				System.out.println("Enter the id");
				String isb = sc.next();
				book.searchById(isb);
				break;
			case 3:
				book.getAllBooks();
				break;
			case 4:
				System.exit(0);
			}

		}
	}
}
