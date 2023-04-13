package ControlStatement;

import java.util.Scanner;

public class TicketTypes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ticket = sc.next().charAt(0);
		
		switch(ticket)
		{
		case 'e':
			System.out.println("Early Bird Ticket");
			break;
		case 'E':
			System.out.println("Early Bird Ticket");
			break;
		case 'd':
			System.out.println("Discount Ticket");
			break;
		case 'D':
			System.out.println("Discount Ticket");
			break;
		case'v':
			System.out.println("VIP Ticket");
			break;
		case'V':
			System.out.println("VIP Ticket");
			break;
		case's':
			System.out.println("Standard Ticket");
			break;
		case'S':
			System.out.println("Standard Ticket");
			break;
		case'c':
			System.out.println("Child Ticket");
			break;
		case'C':
			System.out.println("Child Ticket");
			break;
			
			
		}
		sc.close();

	}

}
