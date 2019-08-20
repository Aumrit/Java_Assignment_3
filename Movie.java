package assign;

import java.util.Scanner;

public class Movie implements IEvent {
static final int totalTickets=20;
static int bookedTickets=0;
	@Override
	public void book() {
		//System.out.println("Movie Booked");
		if(bookedTickets==totalTickets) {
			System.out.println("No more available");
		}
		else {
		System.out.println("Give the number of Tickets");
		Scanner s= new Scanner(System.in);
		int units= s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the city");
		String city = s.next();
		s.nextLine();
		
		int bookedTickets=Movie.bookedTickets+units;
		if(bookedTickets>totalTickets) {System.out.println("So much seats not available");}
		else {
			Movie.bookedTickets=bookedTickets;
			TicketManager ticketManager = new TicketManager("Movie",units, city);
			ticketManager.book();
		}}
		
	}
	
	@Override
	public void cancel(int id, int unit) {
		TicketManager ticketManager = new TicketManager();
		boolean checker=ticketManager.cancel( id, unit);
		if(checker) {
			Movie.bookedTickets-=unit;
		}
	}

}
