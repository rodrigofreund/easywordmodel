package br.com.rodrigofreund.easyword.model.event;

@FunctionalInterface
public interface EventListener<T extends EventParam<?>> {

	void update(T data);

}
