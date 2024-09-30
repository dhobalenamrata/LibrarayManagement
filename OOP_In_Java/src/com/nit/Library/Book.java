package com.nit.Library;
import com.nit.LibraryManagement.*;

public class Book {
	private String title;
	private String author;
	private long ISBN;
	public Book(String title, String author, long ISBN) {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
	public long getISBN() {
		return ISBN;
	}	
	public String toString() {
		return "Title : "+title+", Author : "+author;
	}
}
