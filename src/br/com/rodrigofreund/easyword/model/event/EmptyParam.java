package br.com.rodrigofreund.easyword.model.event;

public final class EmptyParam extends TextParam {

    EmptyParam() {
        super("empty");
    }

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public EventParam<String> of(String value) {
        return new EmptyParam();
    }

}
