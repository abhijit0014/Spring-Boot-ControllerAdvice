package com.ovi.ControllerAdvice.exception;

public class LowScoreException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public LowScoreException() {
		super();
	}

	public LowScoreException(final String message) {
		super(message);
	}

}
