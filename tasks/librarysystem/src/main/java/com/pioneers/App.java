package com.pioneers;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Library library = new Library();

		Book book1 = new Book("Book 1");
		Book book2 = new Book("Book 2");
		Book book3 = new Book("Book 3");
		Book book4 = new Book("Book 4");
		Book book5 = new Book("Book 5");

		library.addBooksToSystem(List.of(book1, book2, book3, book4, book5));

		print(library);

		library.borrowBook(book4);
		library.borrowBook(book2);
		print(library);
		System.out.println("+".repeat(30));

		library.returnBook(book2);
		print(library);
	}

	public static void print(Library library) {
		System.out.println("=== All Books ===");
		library.getAllBooks().forEach(System.out::println);
		System.out.println("=".repeat(30));
		System.out.println("=== Borrowed Books ===");
		library.getBorrowedBooks().forEach(System.out::println);
		System.out.println("=".repeat(30));
		System.out.println("=== UnBorrowed Books ===");
		library.getUnBorrowedBooks().forEach(System.out::println);
		System.out.println("=".repeat(30));
	}
}
