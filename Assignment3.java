package assign;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventManager eventManager =new EventManager();
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Welcome to Events ");
		
		//System.out.println(eventManager.listEvents());
		String ans ="";
		do {
			System.out.println("Choose one");
			System.out.println("1. Book\n2. Cancel\n3. All Events\n4. Search");
			int choice=inputScanner.nextInt(); 
			
		
			switch(choice) {
			case 1 :System.out.println(eventManager.listEvents());
					String typeReturned = inputScanner.next();
					eventManager.book(typeReturned);
					break;
					
			case 2: System.out.println("Enter the id of event: ");
					int id = inputScanner.nextInt();
					
					System.out.println("Enter the type of the event:");
					String type = inputScanner.next();
					inputScanner.nextLine();
					
					System.out.println("Enter the number of tickets to be deleted: ");
					int unit=inputScanner.nextInt();
					
					eventManager.cancel(id,unit, type);
					break;
			
			
			}
			System.out.println("Do you want to continue(Y/N)?");
			ans = inputScanner.next();
			inputScanner.nextLine();
		}while(ans.toLowerCase().equals("y"));
		
		
		
	}

}
