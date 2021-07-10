package fr.ca.java.demooop2;

public class Game {
	
//	Attributes
//	define the states
	public String brand;
	public boolean multiplayer;
	public boolean online;
	public int releaseYear;
	
	public Game() {
		System.out.println("Building a new game ");
	}
	
	public Game(String brand) {
		System.out.println("Building a new game ");
		this.brand = brand;
	}

//	methods
//	define the behavior
	public void start() {
		System.out.println("My game of brand " + brand + " is starting");
	}
	
	public void stop() {
		System.out.println("My game of brand " + brand + " is stoping");
	}
	public void printYourInformation() {
		if (this.multiplayer) {
			System.out.println("This is a multiplayer game ");
		} else {
			System.out.println("This is a NOT multiplayer game ");
		}
		
		if (this.online) {
			System.out.println("This is a online game ");
		} else {
			System.out.println("This is a NOT online game ");
		}
		System.out.println("Realese date " + this.releaseYear);
	}
	
}
