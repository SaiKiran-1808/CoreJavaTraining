package com.evergent.corejava.collection.task4;

import java.util.ArrayDeque;
import java.util.Scanner;

//TICKET SUPPORTING SYSTEM

public class SupportTicketSystem {

	public static ArrayDeque<String> ticketQueue = null;

	public void addTicket(String ticket) {
		ticketQueue.offer(ticket);
		System.out.println("\nTicket Added Successfully : " + ticket);
	}

	public void addTicketAtFirst(String ticket) {
		ticketQueue.offerFirst(ticket);
		System.out.println("\nTicket Added at First Successfully : " + ticket);
	}

	public void addTicketAtLast(String ticket) {
		ticketQueue.offerLast(ticket);
		System.out.println("\nTicket Added at Last Successfully : " + ticket);
	}

	public void processNextTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nTicket Processed Successfully : " + ticketQueue.poll());
		}
	}

	public void processFirstTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nFirst Ticket Processed Successfully : " + ticketQueue.pollFirst());
		}
	}

	public void processLastTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nLast Ticket Processed Successfully : " + ticketQueue.pollLast());
		}
	}

	public void peekNextTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nNext ticket in queue is : " + ticketQueue.peek());
		}
	}

	public void peekFirstTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nFirst ticket in queue is : " + ticketQueue.peekFirst());
		}
	}

	public void peekLastTicket() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found");
		else {
			System.out.println("\nLast ticket in queue is : " + ticketQueue.peekLast());
		}
	}

	public void displayQueue() {
		if (ticketQueue.isEmpty())
			System.out.println("\nNo Tickets were found to display");
		else {
			System.out.println("\nDislaying all tickets : ");
			for (String ticket : ticketQueue) {
				System.out.println(ticket);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"\t\t---------------------------------- CUSTOMER SUPPORT TICKETING ---------------------------------- ");

		ticketQueue = new ArrayDeque<>();
		while (true) {

			Scanner in = new Scanner(System.in);

			System.out.println();
			System.out.println("1. Add ticket");
			System.out.println("2. Process ticket");
			System.out.println("3. Check current ticket");
			System.out.println("4. Display all tickets");

			int value = in.nextInt();
			in.nextLine();

			SupportTicketSystem object = new SupportTicketSystem();

			String description;

			switch (value) {
			case 1:

				System.out.println("Please select, How do you want to add ticket?(1 | 2 | 3)");
				System.out.println("1. At Normal Position");
				System.out.println("2. At First Position");
				System.out.println("3. At Last Position");

				int n1 = in.nextInt();
				in.nextLine();

				switch (n1) {
				case 1:
					System.out.println("Enter ticket description : ");
					description = in.nextLine();
					object.addTicket(description);
					break;
				case 2:
					System.out.println("Enter ticket description : ");
					description = in.nextLine();
					object.addTicketAtFirst(description);
					break;
				case 3:
					System.out.println("Enter ticket description : ");
					description = in.nextLine();
					object.addTicketAtLast(description);
					break;
				}
				break;
			case 2:
				System.out.println("Please select, Which ticket do you want to process?(1 | 2 | 3)");
				System.out.println("1. Normal Ticket Processing");
				System.out.println("2. First Ticket Processing");
				System.out.println("3. Last Ticket Processing");

				int n2 = in.nextInt();
				in.nextLine();
				switch (n2) {

				case 1:
					object.processNextTicket();
					break;
				case 2:
					object.processFirstTicket();
					break;
				case 3:
					object.processLastTicket();
					break;
				}
				break;
			case 3:

				System.out.println("Please select, Which ticket you want to check with?(1 | 2 | 3)");
				System.out.println("1. Normal Ticket Checking");
				System.out.println("2. First Ticket Checking");
				System.out.println("3. Last Ticket Checking");

				int n3 = in.nextInt();
				in.nextLine();
				switch (n3) {
				case 1:
					object.peekNextTicket();
					break;
				case 2:
					object.peekFirstTicket();
					break;
				case 3:
					object.peekLastTicket();
					break;
				}
				break;
			case 4:
				object.displayQueue();
				break;
			}
		}
	}

}
