package fr.ca.java.demooop5reference2;

public class Launcher {
	public static void main(String[] args) {
		
		
		Car myCar1 = new Car();
		myCar1.color = "White";
		
		
		Car myCar2 = myCar1;
		myCar2.color = "Black";
		
		
		Car myCar3 = myCar2;
		myCar3.color = "Yellow";
		
		System.out.println(myCar3.color);
		System.out.println(myCar2.color);
		System.out.println(myCar1.color);
		
	}
	
}
