package br.com.rodrigofreund.easyword.model.event;

public interface EventParam<T> {

    T getValue();

    EventParam<T> of(T value);

}
