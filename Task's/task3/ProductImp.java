package com.evergent.corejava.collection.task3;

import java.util.HashSet;
import java.util.Set;

public class ProductImp implements ProductInterface {
	Set<Product> bookSet = null;

	public ProductImp() {
		bookSet = new HashSet<Product>();
	}

	@Override
	public String addProduct(Product p) {
		bookSet.add(p);
		return p.getId();
	}

	@Override
	public void searchById(String id) {
		boolean b = false;
		if (bookSet.size() > 0 && bookSet != null) {
			for (Product book : bookSet) {
				if (book.getId().equals(id)) {
					System.out.println(book.getId() + " " + book.getProductName() + " " + book.getPrice());
					b = true;
					break;
				}
			}
		}
		if (!b)
			System.out.println("The book is not found");

	}

	@Override
	public void getAllBooks() {
		if (bookSet.size() > 0) {
			for (Product book : bookSet) {
				System.out.println(book.getId() + " " + book.getProductName() + " " + book.getPrice());
			}

		} else {
			System.out.println("No books are available");
		}
	}

}
