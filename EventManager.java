package assign;

import java.util.List;

public class EventManager {
EventStore eventStore=new EventStore();
public List<String>listEvents() {
	return eventStore.getEvents();
}
public void book(String index) {
	eventStore.book(index);
}

}
