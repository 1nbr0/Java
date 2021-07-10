package fr.ca.java.demooop8inheritance;

public class Cat extends Catlike {
	
	@Override
	void hunt() {
		// TODO Auto-generated method stub
		super.hunt();
		System.out.println("I am a cat, so I play with my food");

	}

	@Override
	void sleep() {
		System.out.println("I am sleeping like a cat");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleanItself() {
		// TODO Auto-generated method stub
		
	}
}
