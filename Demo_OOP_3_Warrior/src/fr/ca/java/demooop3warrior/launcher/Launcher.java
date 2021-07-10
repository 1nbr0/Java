package fr.ca.java.demooop3warrior.launcher;

import fr.ca.java.demooop3warrior.model.Warrior;
import fr.ca.java.demooop3warrior.model.Weapon;

public class Launcher {

	public static void main(String[] args) {

//		Instantiation
		Weapon myWeapon = new Weapon();
		myWeapon.name = "Pas Trop P'tit";
		myWeapon.damage = 10000.0;
		myWeapon.range = 300;
		myWeapon.attackSpeed = 3;
		
		
		Warrior myWarrior = new Warrior();
//		myWarrior.name = "Frodon";
//		myWarrior.lvl = 10;
//		myWarrior.weapon = myWeapon;
		myWarrior.setName("Frodon");
		myWarrior.setLvl(10);
		myWarrior.setWeapon(myWeapon);
		

		System.out.println(myWarrior.getWeapon().name);
		
	}

}
