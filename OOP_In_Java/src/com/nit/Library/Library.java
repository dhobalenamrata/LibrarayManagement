package com.nit.Library;
import com.nit.Exceptions.BookNotAvailableException;
import com.nit.LibraryManagement.*;

public  class Library{
	public static int booksCount = 0;
	public static Book [] books = new Book[50];
	private Book book;	
	
	public void addBook(Book book) {
		books[booksCount] = book;
		booksCount++;
	}
	public void removeBook(Book book) {
		for(int i=0; i<booksCount;i++) {
			if(books[i]==book) {
				books[i] = books[++i];
				booksCount--;
			}
		}
	}
	
}
