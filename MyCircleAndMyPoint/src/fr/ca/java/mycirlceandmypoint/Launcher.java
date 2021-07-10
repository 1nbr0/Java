package fr.ca.java.mycirlceandmypoint;


public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello MyCircle And MyPoint");
		
		MyCircle Circle1 = new MyCircle();
		System.out.println(Circle1);
		
		MyCircle Circle2 = new MyCircle(7, 7, 3);
		System.out.println(Circle2);
		
		System.out.println(Circle1.distance(Circle2));
//		System.out.println(Circle2.getArea());
//		System.out.println(Circle2.getCircumference());
	}
}
