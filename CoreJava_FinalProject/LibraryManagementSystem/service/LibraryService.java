package com.evergent.service;

import com.evergent.bean.LibraryBean;
import com.evergent.dao.LibraryDAO;

public class LibraryService {

	LibraryDAO LibraryDAO = new LibraryDAO();

	public int addNewBook(int bookId, String bookTitle, String authorName, int totalCopies) {
		LibraryBean book = new LibraryBean();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setAuthorName(authorName);
		book.setTotalCopies(totalCopies);
		book.setAvailableCopies(totalCopies);
		return LibraryDAO.addBook(book);
	}

	public int issueBook(int bookId) {
		return LibraryDAO.issueBook(bookId);
	}

	public int returnBook(int bookId) {
		return LibraryDAO.returnBook(bookId);
	}

	public int getAvailableCopies(int bookId) {
		return LibraryDAO.getAvailableCopies(bookId);
	}
}
