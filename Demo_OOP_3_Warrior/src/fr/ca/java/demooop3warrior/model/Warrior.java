package fr.ca.java.demooop3warrior.model;

public class Warrior {
	
//	Attributes
//	define the states
	private String name;
	private int lvl;
	private Weapon weapon;
	

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Warrior() {
		System.out.print("I'm a Warrior and ");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
