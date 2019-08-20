package assign;

public class TicketManager  {
	static int id =1000;
	String type, city;
	int unit;
	static final TicketStore ticketStorage= new TicketStore();
	
	public TicketManager(){
		
	}
	
	TicketManager(String type,int units, String city){
		this.type=type;
		TicketManager.id+=1;
		this.unit=units;
		this.city = city;
	};
	
	public void book() {
		// TODO Auto-generated method stub
		TicketManager.ticketStorage.add(this.type,TicketManager.id,this.unit, this.city);
	}
	
	public boolean cancel(int id,int unit) {
		return ticketStorage.remove(id,unit);
		
	}

}
