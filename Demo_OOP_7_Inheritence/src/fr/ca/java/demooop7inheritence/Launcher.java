package fr.ca.java.demooop7inheritence;

public class Launcher {
	public static void main(String[] args) {
		Weapon weapon1 = new Weapon();
		weapon1.name = "Master Sword";
		weapon1.damage = 10.0;
		weapon1.range = 150;
		weapon1.attack();
		
		MagicWand weapon2 = new MagicWand();
		weapon2.name = "Harry MagicWand";
		weapon2.damage = 0.0;
		weapon2.range = 500;
		weapon2.attack();
	}
}
