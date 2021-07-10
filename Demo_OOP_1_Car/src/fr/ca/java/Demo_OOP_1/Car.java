package fr.ca.java.Demo_OOP_1;

public class Car {

	public Car() {
		System.out.println("Building a new car");
	}
//	Attributes
//	define the states
	public String color;
	public double price;
	public int horsePower;
	
	
//	methods
//	define the behavior
	public void start() {
		System.out.println("My car of color " + color + " is starting");
	}
	
	public void stop() {
		System.out.println("My car of color " + color + " is stoping");
	}
	
	public static void printAllBrandsOfCar() {
		System.out.println("Renault");
		System.out.println("Peugeot");
		System.out.println("Citroën");
	}
}
