package fr.ca.java.mytriangleandmypoint;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello MyTriangle");
		
		MyTriangle t1 = new MyTriangle();
		System.out.println(t1);
		
		MyTriangle t2 = new MyTriangle(5, 2, 4, 5, 8, 6);
		System.out.println(t2);		
		
		MyTriangle t3 = new MyTriangle(5, 5, 5, 5, 5, 5);
		System.out.println(t3);
		
		MyTriangle t4 = new MyTriangle(6, 6, 6, 6, 8, 6);
		System.out.println(t4);

	}
}
