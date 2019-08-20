package assign;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventManager eventManager =new EventManager();
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Welcome to Events ");
		
		//System.out.println(eventManager.listEvents());
		System.out.println("Choose one");
		int choice=inputScanner.nextInt(); 
		switch(choice) {
		case 1 :System.out.println(eventManager.listEvents());
				String typeReturned = inputScanner.next();
				eventManager.book(typeReturned);
				break;
		
		
		}
		
		
	}

}
