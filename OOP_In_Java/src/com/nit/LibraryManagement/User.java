package com.nit.LibraryManagement;
import java.util.Scanner;
import com.nit.Library.*;
import com.nit.Users.*;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book("You Can Win", "Shiv Khera", 123456);
		Book b2 = new Book("Wise & Other Wise", "Sudha Murthy", 234564);
		Book b3 = new Book("Atomic Habits", "James Clear", 465355);
		Book b4 = new Book("80/20 Principles", "Richard Koch", 444444);
		Book b5 = new Book("The Psychology of Money", "Mourgan Housel", 151515);
		Book b6 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 151515);
		
		Library bookList = new Library();
		bookList.addBook(b1);
		bookList.addBook(b2);
		bookList.addBook(b3);
		bookList.addBook(b4);
		bookList.addBook(b5);
		bookList.addBook(b6);
		
		
		System.out.println("************* Library *************");
		System.out.println();
		System.out.println("Who came into Labrary ? ");
		System.out.print("Student / Librarian : ");
		char user = sc.next().charAt(0);
		
		if(user=='S' || user=='s') {
			Student s1 = new Student("namu", 123);
			s1.viewBooks();
			System.out.println();
			Book [] bookBorrowed = s1.borrowBook(b6);
			try {
			s1.searchBook(b1);
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}			
		} else if(user=='L' || user=='l') {
			Librarian l1 = new Librarian("xyz", 321);
			l1.viewBooks();			
		}
	}

}
