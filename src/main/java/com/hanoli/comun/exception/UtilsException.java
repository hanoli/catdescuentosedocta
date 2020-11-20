package com.hanoli.comun.exception;

public class UtilsException extends Exception {

	private static final long serialVersionUID = 1L;


	public UtilsException() {
		super();
	}

	public UtilsException(String message) {
		super(message);
	}

	public UtilsException(Throwable cause) {
		super(cause);
	}

	
	public UtilsException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
