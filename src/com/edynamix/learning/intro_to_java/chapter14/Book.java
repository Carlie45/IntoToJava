package com.edynamix.learning.intro_to_java.chapter14;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private int yearOfPublishing;
	private int ISBNNumber;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, String publisher, int yearOfPublishing, int iSBNNumber) {
		this(title, author);
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		ISBNNumber = iSBNNumber;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	public int getISBNNumber() {
		return ISBNNumber;
	}
	public void setISBNNumber(int iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearOfPublishing="
				+ yearOfPublishing + ", ISBNNumber=" + ISBNNumber + "]";
	}
	
}
