package br.com.rodrigofreund.easyword.model.event;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EventManager {
	private Map<EventType, List<EventListener>> eventListeners;
	
	private static EventManager instance;
	
	private EventManager() {
		eventListeners = new TreeMap<>();
	}
	
	static EventManager of() {
		if(instance == null)
			instance = new EventManager();
		return instance;
	}
	
	public void subscribe(EventType eventType, EventListener eventListener) {
		eventListeners.merge(eventType, List.of(eventListener), (u, i) -> u);
	}
	
	public int getEventTypeSize() {
		return eventListeners.size();
	}
}
