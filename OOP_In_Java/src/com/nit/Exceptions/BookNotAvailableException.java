package com.nit.Exceptions;

public class BookNotAvailableException extends Exception{
	public BookNotAvailableException() {
		super();
	}
	public BookNotAvailableException(String msg) {
		super(msg);
	}
}
