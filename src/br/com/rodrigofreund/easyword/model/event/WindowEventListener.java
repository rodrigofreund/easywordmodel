package br.com.rodrigofreund.easyword.model.event;

public class WindowEventListener implements EventListener {
	
	private static int defaultKey = 0;
	
	private String name;
	
	public WindowEventListener() {
		this.name = "EVENT-".concat(String.valueOf(++defaultKey));
	}
	
	public WindowEventListener(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
