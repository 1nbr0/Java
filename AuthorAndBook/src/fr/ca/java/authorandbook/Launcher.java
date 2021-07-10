package fr.ca.java.authorandbook;

public class Launcher {
	public static void main(String[] args) {
		
		Author anAuthor = new Author("Tan Ah Teck", "ahteck.than@somewhere.com", "m");
		System.out.println(anAuthor);
		System.out.println();
		
		Book aBook = new Book("Java for dummy", 19.95, 1000, anAuthor);
		System.out.println(aBook);
		System.out.println();

				// Use an anonymous instance of Author
		Book anotherBook = new Book("more Java for dummy", 29.95, 888,  new Author("Yumichika", "yumichika@gmail.com", "f"));
		System.out.println(anotherBook);
		System.out.println();

		
		Book firstBook = new Book("Django", 20.99, 15);
		System.out.println(firstBook);
		System.out.println();
 
		
		Book secondBook = new Book("Django", 20.99, 15, new Author("Thommas Shelby", "thommyshelby@shelbylimitedcompagny.com", "m"));
		System.out.println(secondBook);
		
	}
}
