package Launcher;

import model.Cat;

public class Launcher {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.setName("Sombrero");
		changeCatName(cat1);
		System.out.println(cat1.getName());
		
		int myInt = 10;
		changeMyInt(myInt);
		System.out.println(myInt);
			
	}
	
	public static void changeCatName(Cat cat) {
		cat.setName("bob");
	}
	
	public static void changeMyInt(int myInt) {
		myInt = 0;
	}
}
