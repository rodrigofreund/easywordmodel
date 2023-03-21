package br.com.rodrigofreund.easyword.model.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EventManagerTest {

	@Test
	void subscribe1() {
		
		EventManager.instance().subscribe(EventType.ACTION, new WindowEventListener());		
		assertEquals(1, EventManager.instance().getEventTypeSize());
		
	}
	
	@Test
	void subscribe2() {
		
		EventManager.instance().subscribe(EventType.ACTION, new WindowEventListener());
		EventManager.instance().subscribe(EventType.ACTION, new WindowEventListener());
		
		assertEquals(1, EventManager.instance().getEventTypeSize());
		
	}
	
	@Test
	void testEventSize() {
		
		EventManager.instance().subscribe(EventType.ACTION, new WindowEventListener());
		EventManager.instance().subscribe(EventType.ACTION, new WindowEventListener());
		
		assertEquals(5, EventManager.instance().getEventTypeListenerSize(EventType.ACTION));
		
	}
}
