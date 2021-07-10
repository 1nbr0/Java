package fr.ca.java.shapesexercise7;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello Shapes");
		
		Shape s1 = new Rectangle("red", 15, 20);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		
		Shape s2 = new Triangle("green", 18, 14);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
		
		//On ne peut pas instancier de class abstract
		
//		Shape s3 = new Shape("green");
//		System.out.println(s3);
//		System.out.println("Area is " + s3.getArea());
	}
}
