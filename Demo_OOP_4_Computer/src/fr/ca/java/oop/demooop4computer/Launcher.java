package fr.ca.java.oop.demooop4computer;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("Hello Computer Project");
		
		Computer myComputer1 = new Computer();
		myComputer1.setModeName("Macbook Pro");
		
		if (myComputer1.isStarted()) {
			System.out.println("MyComputer1 is started");
		} else {
			System.out.println("MyComputer1 is Not started");
		}
		
		myComputer1.start();
		
		if (myComputer1.isStarted()) {
			System.out.println("MyComputer1 is started");
		} else {
			System.out.println("MyComputer1 is Not started");
		}
		
		System.out.println(myComputer1);
		
		Computer myComputer2 = new Computer();
		System.out.println(myComputer2);
		
		
		Computer myComputer3 = new Computer("Asus", true);
		System.out.println(myComputer3);
	}
		
	}

