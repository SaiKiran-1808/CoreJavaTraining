package com.evergent.controller;

import java.util.Scanner;

import com.evergent.service.LibraryService;

public class LibraryController {
    public static void main(String[] args) {
        LibraryService LibraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Welcome to the Library Management System --------");

        int choice = 0;
        do {
            System.out.println("\n1. Add a New Book");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Check Book Availability");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.next();
                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.next();
                    System.out.print("Enter Total Copies: ");
                    int totalCopies = scanner.nextInt();
                    int result = LibraryService.addNewBook(bookId, bookTitle, authorName, totalCopies);
                    System.out.println(result > 0 ? "Book Added Successfully!" : "Failed to Add Book!");
                    break;
                case 2:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueBookId = scanner.nextInt();
                    int issueResult = LibraryService.issueBook(issueBookId);
                    System.out.println(issueResult > 0 ? "Book Issued Successfully!" : "Book Not Available!");
                    break;
                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    int returnBookId = scanner.nextInt();
                    int returnResult = LibraryService.returnBook(returnBookId);
                    System.out.println(returnResult > 0 ? "Book Returned Successfully!" : "Failed to Return Book!");
                    break;
                case 4:
                    System.out.print("Enter Book ID to Check Availability: ");
                    int checkBookId = scanner.nextInt();
                    int availableCopies = LibraryService.getAvailableCopies(checkBookId);
                    System.out.println("Available Copies: " + availableCopies);
                    break;
                case 5:
                    System.out.println("Exiting the System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Try Again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}