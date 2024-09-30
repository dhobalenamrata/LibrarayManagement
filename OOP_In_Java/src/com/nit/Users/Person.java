package com.nit.Users;

import com.nit.Exceptions.BookNotAvailableException;
import com.nit.Library.Book;
public abstract class Person {
    protected String name;
    protected int userID;
    public Person(String name, int userID) {
    	this.name = name;
    	this.userID = userID;
    }
    
    public abstract void viewBooks();

	public abstract void searchBook(Book book) throws BookNotAvailableException;
	
}
