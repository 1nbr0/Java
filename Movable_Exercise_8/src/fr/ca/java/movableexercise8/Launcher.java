package fr.ca.java.movableexercise8;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello Movable");
		
		Movable m1 = new MovablePoint(5, 6, 10, 4); // upcast
		System.out.println(m1);
		m1.moveLeft();
		m1.moveUp();
		System.out.println(m1);
		
		System.out.println();
		
		Movable m2 = new MovableCircle(2, 1, 2, 4, 20); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		System.out.println();
		
		Movable m3 = new MovableRectangle(4, 6, 5, 3, 10, 8); // upcast
		System.out.println(m3);
		m3.moveRight();
		System.out.println(m3);
		
		
	}
}
