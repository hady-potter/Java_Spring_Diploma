package com.pioneers;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	List<Book> allBooks = new LinkedList<>();


	public void addBookToSystem(Book book) {
		allBooks.add(book);
	}

	public void addBooksToSystem(List<Book> listOfBook) {
		allBooks.addAll(listOfBook);
	}

	public List<Book> getAllBooks() {
		return this.allBooks;
	}

	public List<Book> getBorrowedBooks() {
		return allBooks.stream()
			.filter(Book::isBorrowed)
			.toList();
	}

	public List<Book> getUnBorrowedBooks(){
		return allBooks.stream()
			.filter(book -> !book.isBorrowed())
			.toList();
	}

	public void borrowBook(Book book) {
		allBooks = allBooks.stream()
			.map(e -> {
				if(e.equals(book)) {
					e.setBorrowed(true);
				}
				return e;
			})
			.collect(Collectors.toCollection(LinkedList::new));
	}

	public void returnBook(Book book) {
		allBooks = allBooks.stream()
			.map(e -> {
				if(e.equals(book)){
					e.setBorrowed(false);
				}
				return e;
			})
			.collect(Collectors.toCollection(LinkedList::new));
	}
}
