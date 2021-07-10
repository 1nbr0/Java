package fr.ca.java.demooop7inheritence;

public class MagicWand extends Weapon{

	@Override
	void attack() {
		
		super.attack();
		System.out.println("Abracadabra, 0 damage");
		
	}

	
	
}
