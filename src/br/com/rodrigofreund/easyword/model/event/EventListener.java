package br.com.rodrigofreund.easyword.model.event;

public interface EventListener extends Comparable<EventListener> {

	String getName();
	
	@Override
	default int compareTo(EventListener o) {
		return getName().compareTo(o.getName());
	}
}
