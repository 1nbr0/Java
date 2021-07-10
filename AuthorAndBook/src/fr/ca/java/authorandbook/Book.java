package fr.ca.java.authorandbook;

public class Book {
	
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, double price, int qtyInStock, Author author) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		this.author = author;
	}
	
	public Book(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "Book name is " + name + ", his price is " + price + "$, qtyInStock = " + qtyInStock + ", his author is " + author;
	}
	
	

}
