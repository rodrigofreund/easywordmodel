package br.com.rodrigofreund.easyword.model.event;

@FunctionalInterface
public interface EventListener<T> {

	void update(T data);

}
