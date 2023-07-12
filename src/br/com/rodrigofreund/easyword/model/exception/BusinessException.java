package br.com.rodrigofreund.easyword.model.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;

}
