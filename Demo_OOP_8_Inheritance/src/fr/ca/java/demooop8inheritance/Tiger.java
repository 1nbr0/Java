package fr.ca.java.demooop8inheritance;

public class Tiger extends Catlike {
	
	int killCounter;
	
	void swim() {
		System.out.println("I am a tiger named " + super.name + ", I can swim and my kill counter is " + this.killCounter);
	}

	@Override
	void sleep() {
		System.out.println("I am sleeping like a tiger");
		
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
