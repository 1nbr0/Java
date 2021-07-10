package fr.ca.java.demooop8inheritance;

public abstract class Catlike implements Animal {
	
	String name;
	
	void hunt() {
		System.out.println("My catlike named " + this.name + " is hunting");
	}
	
	abstract void sleep();
		

		
	
}
