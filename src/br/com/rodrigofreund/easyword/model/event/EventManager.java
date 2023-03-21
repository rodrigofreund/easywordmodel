package br.com.rodrigofreund.easyword.model.event;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EventManager {
	private Map<EventType, Set<EventListener>> eventListeners;
	
	private static EventManager instance;
	
	private EventManager() {
		eventListeners = new TreeMap<>();
	}
	
	static EventManager instance() {
		if(instance == null)
			instance = new EventManager();
		return instance;
	}
	
	public void subscribe(EventType eventType, EventListener eventListener) {
		
		eventListeners.merge(eventType, Set.of(eventListener), (u, i) -> {
			var nlst = new TreeSet<EventListener>();
			nlst.addAll(u);
			nlst.addAll(i);
			return nlst;
		});
	}
	
	public int getEventTypeSize() {
		return eventListeners.size();
	}
	
	public int getEventTypeListenerSize(EventType eventType) {
		return eventListeners.get(eventType).size();
	}
}
