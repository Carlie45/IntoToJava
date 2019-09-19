package com.edynamix.learning.intro_to_java.chapter14;

import java.util.List;

public class Library {
	
	private String name;
	private List<Book> books;
	
	public Library(String name, List<Book> books) {
		this.name = name;
		this.books = books;
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBookByAuthor(String author) {
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				return book;
			}
		}
		
		return null;
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void printBooksInLibrary() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}

}
