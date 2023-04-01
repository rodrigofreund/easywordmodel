package br.com.rodrigofreund.easyword.model.event;

public class TextParam implements EventParam {
	
	private String value;
	
	public TextParam(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}

}
