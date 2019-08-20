package assign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventStore implements IEventStore{
	List<String> eventtypes = new ArrayList<>() ;
	Map<String,IEvent> typeMap=new HashMap<>();
	
	EventStore(){
		this.eventtypes.add("1 Movie");
		this.eventtypes.add("2 Trek");
		this.eventtypes.add("3 Sports");
		this.typeMap.put("Movie",new Movie());
		this.typeMap.put("Trek",new Trek());
		this.typeMap.put("Sports",new Sports());
		
		
	}
	public List<String> getEvents() {
		
		return this.eventtypes;
	}
	public void book(String index) {
		IEvent event = typeMap.get(index);
		event.book();
	}
	

}
