package br.com.rodrigofreund.easyword.model.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EventManagerTest {

	@Test
	void subscribe() {
		
		EventManager.of().subscribe(EventType.ACTION, new EventListener() {});
		
		assertEquals(EventManager.of().getEventTypeSize(), 1);
		
	}
}
