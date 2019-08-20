package assign;

import java.util.ArrayList;
import java.util.List;

public class TicketStore implements ITicket {
	
	List<Ticket> tstore=new ArrayList<>();
	
	@Override
	public void add(String type , int id, int units, String city) {
		Ticket t = new Ticket(type, id, units, city);
		tstore.add(t);
		
		for(Ticket tk: tstore) {
			System.out.println("Type: "+ tk.type+" "+ "Id: "+ tk.id +" No: "+tk.unit+ " City: "+tk.city);
		}
	}
	
	public void showAllTickets() {
		
		
	}
	
	public boolean remove(int id, int unit) {
		boolean flag = false;
		for(Ticket t : tstore) {
			if(t.id == id) {
				if(t.unit>unit) {
					t.unit-=unit;
					System.out.println("You have successfully cancelled "+unit+" no of tickets");
					flag = true;
					break;
				}
				else if(t.unit==unit) {
					tstore.remove(t);
					System.out.println("You have successfully cancelled "+unit+" no of tickets");
					flag = true;
					break;
				}
				
				
				else {
					System.out.println("So much not present");
					break;
				}
				
			}
		}
		return flag;
	}

}
