package com.ssafy.ws04.step4;

public class Magazine extends Book{
	private int year;
	private int month;
	
	
	public Magazine() {
		super();
		year = 0;
		month = 0;
	}
	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int quantity, int year, int month) {
		super(isbn, title, author, publisher, price, desc, quantity);
		this.year = year;
		this.month = month;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t| " + year + "\t| " + month;
	}
	
	
	
	

}
