package fr.ca.java.demooop7inheritence;

public class Weapon {

	String name;
	double damage;
	int range;
	
	void attack() {
		System.out.println(this.name + " is attacking with " + this.damage + " is range is " + this.range);
	}
}
