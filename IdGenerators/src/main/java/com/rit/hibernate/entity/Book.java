package com.rit.hibernate.entity;

public class Book {

	private Long bookId;
	private String bookName;
	private String Author;
	private double bookPrice;

	private Booktype bookType;

	enum Booktype {
		NA, LITRATURE, PROGRAMMING, HISTORY, BIOGRAPHY, SCIENCE, BIOLIGY
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Booktype getBookType() {
		return bookType;
	}

	public void setBookType(Booktype bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", bookPrice=" + bookPrice
				+ ", bookType=" + bookType + "]";
	}

}