package com.edynamix.learning.intro_to_java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
	
	public List<Book> findAllBooksByAuthor(String author, Library lib) {
		List<Book> booksFromAuthor = new ArrayList<>();
		for (Book book : lib.getBooks()) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				booksFromAuthor.add(book);
			}
		}
		
		return booksFromAuthor;
	}
	
	public void deleteBooksFromAuthor(String author, Library lib) {
		List<Book> booksFromAuthor = findAllBooksByAuthor(author, lib);
		for (Book book : booksFromAuthor) {
			lib.removeBook(book);
		}
	}

	public static void main(String[] args) {
		Book book1 = new Book("It", "Steven King");
		Book book2 = new Book("The Lost Symbol", "Dan Brown");
		
		List<Book> books = new ArrayList<>();
		Library library = new Library("lib", books);
		library.addBook(book1);
		library.addBook(book2);
		library.printBooksInLibrary();
		
		new LibraryTest().deleteBooksFromAuthor("Steven King", library);
		library.printBooksInLibrary();
	}

}
