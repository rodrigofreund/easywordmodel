package br.com.rodrigofreund.easyword.model.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class EventManager {
	private Map<EventType, List<EventListener<EventParam>>> eventListeners;
	
	private static EventManager instance;
	
	private EventManager() {
		eventListeners = new TreeMap<>();
	}
	
	public static EventManager instance() {
		if(instance == null)
			instance = new EventManager();
		return instance;
	}
	
	public void subscribe(EventType eventType, EventListener<EventParam> eventListener) {
		eventListeners.merge(eventType, List.of(eventListener), (u, i) -> {
			var nlst = new ArrayList<EventListener<EventParam>>();
			nlst.addAll(u);
			nlst.addAll(i);
			return nlst;
		});
	}
	
	public void notify(EventType eventType, EventParam arg) {
		eventListeners.get(eventType).forEach(i -> i.update(arg));
	}
}
