package com.nit.Users;

import com.nit.Exceptions.BookNotAvailableException;
import com.nit.Library.*;

public class Student extends Person {
	Book book;
	
	public Student(String name, int userID) {
		super(name, userID);
	}
	
	// Method for borrow book by student
	public Book[] borrowBook(Book book) {
		Book [] arr = new Book[50];
		for(int j=0,i=0;i<Library.booksCount;i++, j++) {
			if(book==Library.books[i]){
				this.book = Library.books[i];
				i--;
				Library.booksCount--;
				System.out.println(this.book+" Book borrowed.");
			}
			else {
				arr[i]= Library.books[j];
			}
		}
		return arr;		
	}
	
	// method for return book by student
	public Book[] returnBook(Book book) {
		Library.books[Library.booksCount] = book;
		return Library.books;		
	}
	
	// view books method
	public void viewBooks() {
		System.out.println(this.name + " is viewing Books.");
		int i = 0;
		do {
			System.out.println("Book "+Library.books[i]);
			i++;
		} while(i<Library.booksCount);
		
	}
	
	// searchBook method by using Book object
	public void searchBook(Book book) throws BookNotAvailableException {
		int i=0;
		int temp=0;
		do {
			if(Library.books[i]==book) {
				System.out.println(book+" book Found by "+name);
				temp++;
			}
			i++;
		}
		while(i<Library.booksCount);
			
		if(temp==0) throw new BookNotAvailableException("This book not found by "+this.name);
	
	}
	
	// searchBook method by using book/author name
	public void searchBook(String name) throws BookNotAvailableException {
		int i=0;
		int temp=0;
		do {
			if(Library.books[i].getAuthor().equalsIgnoreCase(name)) {
				System.out.println(Library.books[i].getAuthor()+" author's "+Library.books[i].getTitle()+" book found.");
				temp++;
			}
			else if(Library.books[i].getTitle().equalsIgnoreCase(name)) {
				System.out.println(Library.books[i].getTitle()+" book found.");
				temp++;
			}
			i++;
		} while(i<Library.booksCount);
		
		if(temp==0) throw new BookNotAvailableException("This book not found by student using booktitle/author.");
	}	
}
