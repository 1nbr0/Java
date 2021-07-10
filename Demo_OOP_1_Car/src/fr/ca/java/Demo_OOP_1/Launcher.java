package fr.ca.java.Demo_OOP_1;

public class Launcher {

	public static void main(String[] args) {
		
//		Instantiation
		Car myCar1 = new Car();		
		myCar1.color = "Grey";
		myCar1.price = 18700.00;
		myCar1.horsePower = 110;
		
		myCar1.start();
		myCar1.stop();
		
		System.out.println("My first car price is " + myCar1.price + " and horsePower " + myCar1.horsePower);
		
		Car myCar2 = new Car();		
		myCar2.color = "Red";
		myCar2.price = 48700.00;
		myCar2.horsePower = 300;
		
		myCar2.start();
		myCar2.stop();
		
		System.out.println("My second car price is " + myCar2.price + " and horsePower " + myCar2.horsePower);
		
		Car.printAllBrandsOfCar();
		
		
	}
}
