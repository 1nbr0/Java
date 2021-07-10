package fr.ca.java.shootingstarlab;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Hello StarLab \n");

		System.out.println("Line :");
		line(5);
		System.out.println("\nSquare :");
		square(5);
		System.out.println("\nEmpty line :");
		emptyLine(5);
		System.out.println("\nEmpty Square");
		emptySquare(5);
		System.out.println("\nTriangle :");
		triangle(5);
		System.out.println("\nFull Triangle :");
		fullTriangle(9);
	}

	public static void line(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("* ");

		}
		System.out.println();
	}

	public static void square(int n) {
		for (int i = 0; i < n; i++) {
			line(n);
		}
		System.out.println();
	}

	public static void emptyLine(int n) {

		System.out.print("* ");
		for (int i = 0; i < (n - 2) ; i++) {
			System.out.print("  ");
		}
		
		
		System.out.println("* ");
		
	}
	
	public static void emptySquare(int n) {
		line(n);
		for (int j = 0; j < (n - 2); j++) {
			emptyLine(n);
		}
		line(n);
	}
	
	public static void triangle(int n) {
		
		for (int i = 1; i <= n; i++) {
			line(n - (n - i));

		}
	}
	
	public static void fullTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			line(n - (n - i++));
		}
	}

}
