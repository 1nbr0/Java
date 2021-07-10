package fr.ca.java.demooop2;

public class Launcher {

	public static void main(String[] args) {
		
//		Instantiation
		Game myGame1 = new Game();
		myGame1.brand = "Activision";
		myGame1.multiplayer = true;
		myGame1.online = false;
		myGame1.releaseYear = 2021;
		myGame1.start();
		myGame1.stop();
		
		System.out.println("My first game of the year is " + myGame1.releaseYear + ", available in multiplayer ? " + myGame1.multiplayer + ". And online available ? " + myGame1.online);
		
		Game myGame2 = new Game();
		myGame2.brand = "Electronics Art";
		myGame2.multiplayer = false;
		myGame2.online = false;
		myGame2.releaseYear = 2010;
		myGame2.start();
		myGame2.stop();
		
		System.out.println("My first game of the year is " + myGame2.releaseYear + ", available in multiplayer ? " + myGame2.multiplayer + ". And online available ? " + myGame2.online);
		
		
		Game myGame3 = new Game("EA Sport");
		
		System.out.println(myGame3.brand);
		
	}
}
