package fr.ca.java.demooop6inheritance;

public class Cat extends Catlike{

	@Override
	void hunt() {
		System.out.println("I am a cat named " + this.name + " and I killing for fun");
	}
	
}
