package fr.ca.java.demooop5reference;

public class Launcher {
	public static void main(String[] args) {
		
		
		int myInt = 0;
		System.out.println("Initial value of myInt : " + myInt);
		changeMyInt(myInt);
		System.out.println("New value of myInt : " + myInt);
		
		
		Car myCar = new Car();
		myCar.color ="White";
		System.out.println("Initial value of color : " + myCar.color);
		changeMyColor(myCar);
		System.out.println("New value of color : " + myCar.color);
		
	}
//	primitive type = copy of value
	public static void changeMyInt(int myInt) {
		myInt = 10;
	}
//	Object type = copy of reference
	public static void changeMyColor(Car myCar) {
		myCar.color = "Black";
	}
}
