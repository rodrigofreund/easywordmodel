package br.com.rodrigofreund.easyword.model.event;

public class TextParam implements EventParam<String> {

    private String value;

    TextParam(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public EventParam<String> of(String value) {
        return new TextParam(value);
    }

}
