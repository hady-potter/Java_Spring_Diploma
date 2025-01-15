package com.pioneers;

public class Book {
	private String name;
	private int id;
	private boolean isBorrowed;
	protected int counter = 1000;

	public Book(String name, int id) {
		this.name = name;
		this.id = id;
		isBorrowed = false;
	}

	public Book(String name) {
		this.name = name;
		this.id = ++counter;
		isBorrowed = false;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean borrowed) {
		isBorrowed = borrowed;
	}

	@Override
	public String toString() {
		return "Name: %s, ID: %s Is_Borrowed: %s".formatted(name, id, isBorrowed);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Book book = (Book) o;
		return getName().equals(book.getName());
	}

	@Override
	public int hashCode() {
		return getName().hashCode();
	}
}
